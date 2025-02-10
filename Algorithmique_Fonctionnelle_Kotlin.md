
# Algorithmique fonctionnelle avec Kotlin

BUT Informatique - S5 - Qualité de développement



Dans ce TP, vous écrirez des tests pour toutes vos fonctions.




## 1. Tri linéaire… fonctionnellement pure





### 1.1. Préliminaires




Dans ce TP vous utiliserez le type `Liste` suivant:





```
sealed class Liste<out A> {
    companion object {
        /* Factory */
        fun <A> of(vararg xs: A): Liste<A> =
            if (xs.isEmpty()) Nil
            else Cons(xs[0], of(*xs.sliceArray(1 until xs.size)))
    }
    abstract fun length() : Int
}

data class Cons<out A>(val head:A, val tail: Liste<A>): Liste<A>() {
    override fun length() = 1 + tail.length()
}

data object Nil: Liste<Nothing>() {
    override fun length() = 0
}

```





### 1.2. Première fonctions « presque pures »




Les fonctions de cette partie sont à écrire dans un package `exercice1A`.



1. 
Écrire une fonction





```
 fun count(l : Liste<Int>) : Int

```



qui pour une liste de 0 et de 1, renvoie le nombre d’occurrences de 0 dans
`l`. Cette fonction lèvera une exception `IllegalListeException` (que vous
aurez préalablement définie) si la liste `l` comporte d’autres valeurs que 0
et 1. Mis à part cette levée d’exception, la fonction `count` doit être
**fonctionnelle pure**.



2. 
Écrire une fonction





```
 fun sort(l : Liste<Int>) : Liste<Int>

```



qui trie une liste ne comportant que des 0 et des 1 à l’aide de la fonction
`count`. Mis à part une éventuelle levée d’exception, la fonction `sort` doit
être **fonctionnelle pure**.



3. 
Écrire une fonction





```
 fun sortOnePass(l : Liste<Int>) : Liste<Int>

```



qui trie, en une seule passe, une liste ne comportant que des 0 et des 1.
Cette fonction lèvera l’exception `IllegalListeException` si la liste `l`
comporte d’autres valeurs que 0 et 1. Mis à part une éventuelle levée
d’exception, la fonction `sortOnePass` doit être **fonctionnelle pure**.








### 1.3. Tri pur




Dupliquez le fichier précédent et modifiez le nom de package en `exercice1B`.



1. Définissez le type générique `Option<A>`, équivalent du type `Optional<A>`
de Java, sur le modèle du type `Liste` en Kotlin. `Option<A>` comportera
**exactement** deux sous-types:
	* `Some<A>` une data classe qui encapsule une valeur de type `A` (c’est
	l’équivalent de `Cons` pour le type `Liste`), et
	* `None` un objet qui représente l’absence de valeur (c’est équivalent de
	`Nil` pour le type `Liste`). Cette objet est utilisé en alternative de la
	levée d’exception pour signaler l’échec d’une évaluation.
2. 
Définissez le fonction





```
fun <A,B> map(f : (A)->B) : (Option<A>) -> Option<B>

```



qui, « élève » l’application de fonctions `f: (A)->B` aux valeurs optionnelles
(ie. les valeurs de type `Option`). Ainsi, en définissant:





```
val inc: (Int)->Int = { x -> x+1 }
val incOpt : (Option<Int>) -> Option<Int> = map(inc)

```



l’incrémentation est élevée aux types optionnels:





```
incOpt(Some(5))

```



renvoie `Some(6)` et





```
incOpt(None)

```



renvoie `None`. La fonction `map` est appelée **foncteur**.



3. 
Définissez le fonction





```
fun <A,B> flatMap(f : (A)->Option<B>) : (Option<A>) -> Option<B>

```



qui réalise la même chose que `map` mais pour des fonctions `f` qui peuvent échouer (ie. renvoyer `None`).



4. 
Définissez la fonction





```
fun <A,B,C> mapOp (f: (A,B) -> C) : (Option<A>,Option<B>) -> Option<C>

```



qui « élève » la fonction binaire `f` aux valeurs optionnelles. Ainsi, la
fonction obtenue renvoie `None` dès qu’un de ses arguments est `None`, sinon
elle se comportera comme `f`. **Utilisez les fonctions `map` et `flatMap`
précédemment définies pour définir `mapOp`**.



5. 
Définissez l’addition `plus` sur les entiers optionnels à l’aide de `mapOp`. Faîtes en sorte que `plus` soit utilisable comme opérateur infixe. On pourra donc écrire:





```
Some(1) plus Some(2)

```



dont le résultat sera `Some(3)`, et





```
Some(1) plus None

```



s’évaluera par contre en `None`.



6. 
Modifiez la fonction `count` précédemment difinie afin de gérer les listes malformées (ie. ne comportant pas uniquement des 0 et 1) à l’aide du type `Option` en alternative aux exceptions:





```
 fun count(l : Liste<Int>) : Option<Int>

```


7. 
Même question pour la fonction `sort`:





```
 fun sort(l : Liste<Int>) : Option<Liste<Int>>

```








## 2. Arbres binaires





### 2.1. Préliminaires




On ajoute quelques fonctions aux `Liste`:





```
fun <A> Liste<A>.enqueue(v : A) : Liste<A> =
    when (this) {
        is Nil -> Liste.of(v)
        is Cons -> Cons(this.head, this.tail.enqueue(v))
    }

// [1,2,3].enqueue([4,5]) = [1,2,3,4,5]
fun <A> Liste<A>.enqueue(l : Liste<A>) : Liste<A> =
    when (this) {
        is Nil -> l
        is Cons -> Cons(this.head, this.tail.enqueue(l))
    }

fun Liste<Int>.toList() : List<Int> = when (this) {
    is Nil -> emptyList()
    is Cons -> listOf(this.head) + this.tail.toList()
}

```



Et on introduit le type des arbres binaires (d’entiers) suivant:





```
sealed class BinaryTree {
    companion object {
        /* Factory */
        fun of(vararg values: Int): BinaryTree {
            if (values.isEmpty()) return Empty
            val nodes : Array<Node> = Array(values.size){ Node(values.get(it), Empty, Empty) }

            // Arrange nodes to form an almost complete binary tree
            for (i in nodes.size-1 downTo 1) {
                val parent = (i-1) / 2
                nodes[parent] = if (i % 2 == 1) // then i is left child of parent
                    nodes[parent].copy(left = nodes[i])
                else nodes[parent].copy(right = nodes[i]) // right child otherwise
            }
            return nodes[0]
        }
        fun of(values : Liste<Int>): BinaryTree {
            return of(*values.toList().toIntArray())
        }
    }

    fun toList() : Liste<Int> {
        fun toListAux(queue : Liste<BinaryTree>) : Liste<Int> =
            when (queue) {
                is Nil -> Nil
                is Cons -> when (val tree = queue.head) {
                    is Empty -> toListAux(queue.tail)
                    is Node -> Cons(tree.value, toListAux(queue.tail.enqueue(Liste.of(tree.left, tree.right))))
                }
            }
        return toListAux(Liste.of(this))
    }

    fun print() {
        fun printAux(t: BinaryTree, s: String) {
            when (t) {
                is Node -> {
                    println(s + "${t.value}")
                    printAux(t.left, s + " ")
                    printAux(t.right, s + " ")
                }
                else -> {}
            }
        }
        printAux(this,"")
    }
}

data class BTNode(val value : Int, val left : BinaryTree, val right : BinaryTree) : BinaryTree()

data object BTEmpty : BinaryTree()

```



La fonction `BinaryTree.of` construit un **arbre binaire presque complet** à partir d’une liste d’entiers représentant le parcours en largeur de l’arbre (à la manière d’un tas). Par exemple, `BinaryTree.of(23,10,13,11,9)` construit l’arbre:




```
    23
   /  \
  10  13
 /  \
11   9

```




### 2.2. Symmétrie




Ajouter à la classe `BinaryTree` la méthode d’instance `isSymetric` sur les
arbres binaires, qui renvoie `true` si l’arbre est symétrique:





```
fun isSymetric() : Boolean

```





### 2.3. Tas binaires



1. 
Ajouter la méthode d’instance `isHeap` qui détermine si l’arbre est un tas:





```
 fun isHeap() : Boolean

```


2. 
Ajouter la fonction d’instance `rightHeap(a)` qui insère l’entier `a` dans
l’arbre en supposant que celui-ci comporte exactement 2k valeurs:





```
 fun rightHeap(a : Int) : BinaryTree

```








## 3. Tas binomiaux




On considère ici le type des tas binomiaux:





```
sealed class BinomialHeap

data class BHNode(val value : Int, val children : Liste<BinomialHeap>) : BinomialHeap()

data object BHEmpty : BinomialHeap()

```


1. 
Écrire la méthode d’instance `order` qui renvoie l’ordre d’un tas binomial:





```
fun order() : Int

```


2. 
Écrire la méthode d’instance `isBH` qui renvoie `true` si l’instance est un tas binomial:





```
fun isBH() : Boolean

```


3. 
Écrire la fonction `fusion` qui fusionne deux arbres binomiaux de même
ordre pour obtenir un nouvel arbre binomial:





```
fun fusion(b1: BinomialHeap, b2: BinomialHeap) : BinomialHeap

```


4. 
Écrire la méthode d’instance `binaryToBinomial` de la classe `BinaryTree`
qui convertie un arbre binaire de taille 2k en un tas binomial:





```
fun toBinomialHeap() : BinomialHeap

```






