
# Programmation fonctionnelle avec Kotlin

BUT Informatique - S5 - Qualité de développement



## 1. Préliminaires





### 1.1. Classes sealed




Nous allons utiliser une catégorie particulière de classes de Kotlin: les
classes « sealed ». Sans rentrer dans tous les détails de ces classes (voir pour
cela la [documentation Kotlin](https://kotlinlang.org/docs/sealed-classes.html)), ces classes présentent l’avantage de contrôler
leur utilisation et de déterminer statiquement (i.e. à la compilation) toutes
classes qui sont sous-types de cette classe sealed. À titre d’exemple,
considérons la classe sealed `Shape` et 3 classes qui héritent de `Shape`:





```
sealed class Shape
data class Rectangle(val longueur : Double, val largeur : Double) : Shape()
data class Cercle(val rayon: Double) : Shape()
object Point : Shape()

```



Les utilisateurs de `Shape` ne sont pas autorisés à écrire d’autres classes qui
hériteraient de `Shape` car celle-ci est sealed.




La structure de contrôle `when` (vues précédemment en altertive à `if`… `else`)
permet aussi de tester le type d’une valeur (en utilisant le mot-clé `is`) et
ainsi de réaliser une forme (restreinte) de filtrage de motif qu’on retrouve
dans la plupart des languages fonctionnels (Haskell, OCaml, Scala, etc.). Ainsi
on peut écrire une fonction qui calcule la surface d’une forme quelconque:





```
fun surface(forme : Shape) : Double = when (forme) {
    is Rectangle -> sqrt(forme.longueur.pow(2)+forme.largeur.pow(2))
    is Cercle -> forme.rayon.pow(2) * kotlin.math.PI
    is Point -> 0.0
}

```



Deux remarques:



* Le fait que `Shape` soit une classe `sealed` permet au compilateur de vérifier que
le filtrage est exhaustif, c’est-à-dire qu’on a considéré tous les cas
possibles de formes. Si `Shape` n’était pas `sealed` il serait nécessaire
d’ajouter une clause `else`.
* Le filtrage sur les types permet de faire ce qui est appelé des « smartcast »
c’est-à-dire de surcharger le type de forme (initialement `Shape`) en type
`Rectangle` dans la première branche et d’accéder aux attributs de ce type en
toute sécurité.





### 1.2. Sous-typage




Dans ce TP nous allons utiliser des classes génériques *covariantes*. En Kotlin,
la covariance s’exprime simplement à l’aide du mot clé `out` qui annote la
variable de type de la classe générique. Ainsi, la classe `Liste` que nous allons
utiliser, est déclarée par `Liste<out A>`. La covariance signifie, par exemple,
que là où est attendue une liste de `Number`, on pourra passer une liste de `Int` ou
de `Double` ou de tout autre sous-type de `Numbre`. En d’autres termes si `T1` est un
sous-type de `T2` alors `Liste<T1>` est aussi un sous-type de `Liste<T2>` (grâce à
l’annotation `out` sur le paramètre de type de `Liste`).







## 2. Listes




Récupérez sur Moodle le fichier `Liste.kt`.




Nous allons ici utiliser notre propre type de listes et implémenter nos propres
fonctions sur les listes:





```
sealed class Liste<out A>{
    companion object {
        /* Factory */
        fun <A> of(vararg xs : A) : Liste<A> =
            if (xs.isEmpty()) Nil
            else Cons(xs[0], of(*xs.sliceArray(1 until xs.size)))
    }
}

object Nil : Liste<Nothing>()
data class Cons<out A>(val head : A, val tail : Liste<A>) : Liste<A>()

```



`Nil` désigne la liste vide et la data classe `Cons` (pour *Construct*) la paire
formée d’un élément et d’une queue (i.e. la liste suivant le premier élément).
Ces deux classes héritent de (et sont donc de type) `Liste`. La fonction (*factory*)
prédéfinie `of`, semblable à `listOf`, permet de construire facilement des listes.





### 2.1. Somme et produit



* Écrire la fonction récursive `sum` (membre de l’objet compagnon de `Liste`) sur
les listes de `Int`. Vérifier qu’on ne peut pas l’appliquer sur une liste dont
les éléments ont un type différent de `Int`.
* Même question pour le produit (fonction `product`). Quelle doit être la valeur
de produit pour les listes vides ?





### 2.2. Tête et queue




Écrire les fonctions de destructuration `head(l)` et `tail(l)` qui permettent,
respectivement, de récupérer le premier élément et la queue de la liste `l`. Pour
les cas problématiques, on déclenchera une exception `IllegalStateException`. En
Kotlin, les exceptions sont déclenchées avec `throw` (voir rapidement cette
[documentation](https://kotlinlang.org/docs/exceptions.html)).






### 2.3. Remplacer la tête




Écrire la fonction `setHead(l,x)` qui renvoie liste `l` dont le premier élément est
remplacé par `x`.






### 2.4. Supprimer les n premiers éléments




Écrire la fonction `drop(l,n)` qui renvoie la liste `l` amputée de ses `n` premiers
éléments.






### 2.5. Suppression avec prédicat




Écrire la fonction `dropWhile(l,p)` qui renvoie la liste `l` amputée des premiers
éléments de `l` qui satisfont le prédicat `p` jusqu’au premier élément (exclus) qui
ne satisfait pas `p`.






### 2.6. Longueur totale de chaînes




En suivant le modèle des fonctions `sum` et `product` écrire une fonction
`lengthOfStrings(l)` qui calcule la somme des longueurs des chaînes de caractères
contenues dans la liste `l`.






### 2.7. `foldRight`: généralisation de `sum`, `product` et `lengthOfStrings`



* 
On remarque que les fonctions `sum`, `product` et `lengthOfStrings` partagent la
même structure. En effet, elles ne diffèrent que par la valeur (`z`) renvoyée
pour la chaîne vide et l’opération (`f`) appliquée sur ses éléments. Par
ailleurs, comme dans le cas de `lengthOfStrings`, le type de valeur renvoyée
(`Int`) peut également différer du type des valeurs contenues dans la liste
(`String`). Par conséquent, on peut généraliser ces fonctions en ajoutant `z` et `f` à leurs
arguments, et écrire la fonction:





```
fun <A,B> foldRight(l : Liste<A>, z : B, f : (A,B) -> B ) : B

```


* Réécrivez les fonctions `sum`, `product` et `lengthOfStrings` (nommées `sum2`,
`product2` et `lengthOfStrings2`) à l’aide de `foldRight`.
* Écrivez la fonction `length(l)` qui calcule la longueur d’une liste `l` à l’aide de `foldRight`.






## 3. Récursion terminale




![functional_xkcd.png](Programmation%20fonctionnelle%20avec%20Kotlin_files/functional_xkcd.png)






### 3.1. Calculs terminaux



* Écrire la fonction `sumTerm` version récursive terminale de la fonction `sum`.
Pour ce faire, vous utiliserez une fonction locale auxiliaire pourvue d’un
accumulateur et qui sera effectivement la fonction récursive terminale.
* Même question pour `product` et `lengthOfStrings`





### 3.2. Pliage terminal



* La fonction `foldRight` écrite plus haute n’est pas récursive terminale.
Implémentez la fonction `foldLeft` version récursive *terminale* de `foldRight`
comme généralisation des fonctions précédentes.
* Implémentez la fonction `sumTerm2`, fonction identique à `sumTerm` mais
implémentée à l’aide de `foldLeft`.
* Même question pour `productTerm` et `lengthOfStringsTerm`.






## 4. Évaluation paresseuse




![haskell.png](Programmation%20fonctionnelle%20avec%20Kotlin_files/haskell.png)





Dans la majorité des langages de programmation (y compris Kotlin) l’exécution
des programmes suit une *évaluation stricte* (dite aussi *appel par valeur*). Elle
consiste, pour l’évaluation d’une fonction (ou d’un opérateur), à évaluer les
arguments *avant* d’évaluer la fonction. Ainsi, l’évaluation de l’appel `inc(1+2)`
évalue d’abord l’expression `1+2` (i.e. `3`), puis évalue la fonction `inc` pour la
valeur `3`.




L’alternative, qui consiste à n’évaluer les arguments que lorsqu’ils sont
nécessaires dans l’évaluation de la fonction, s’appelle l’*évaluation paresseuse*
(aussi appelée *appel par nom* ou *évaluation non stricte*). Celle-ci peut s’avérer
plus efficace que l’appel par valeur. C’est celle qui est en particulier
implémentée par défaut dans le langage Haskell.




Dans un langage comme Kotlin, il est cependant possible de simuler l’évaluation
paresseuse pour bénéficier de ses avantages. Il faut en effet encapsuler les
valeurs dans des lambdas (appelées *thunk*). Ainsi, l’expression `1+2` (de type `Int`)
est encapsulée avec `{ 1+2 }` (qui est de type `()->Int`) qui ne s’évalue en 3 que
lorsque cette expression est appliquée à `()` (ie. `{1+2}()`).




Pour illustrer l’évaluation paresseuse et sa simulation en Kotlin, nous allons
implémenter des streams (ce sont les `Sequence` de l’API Kotlin). Leur définition
est très proche de celle des listes. La différence est que la tête et la queue
sont systématiquement encapsulées dans une lambda:





```
sealed class Stream<out A>

object Empty : Stream<Nothing>()

data class Cons<out A>(
    val head: () -> A,
    val tail: () -> Stream<A>
): Stream<A>()

```



Dans le fichier `Stream.mk` qui est fourni sur Moodle, remarquez les imports
réalisés pour bénéficier des fonctions définies précédemment sur les listes. Le
constructeur de listes `Cons` est renommé `ConsL` pour éviter la confusion avec le
constructeur sur les `Stream`. Enfin, nous utiliserons la fonction `cons`, au lieu
du constructeur de Stream `Cons`, qui permet d’évaluer une seule fois une
expression paresseuse en mémorisant (on dit [mémoïser](https://fr.wikipedia.org/wiki/M%C3%A9mo%C3%AFsation)) sa valeur (inutile de
comprendre les détails de cette fonction ici…). Cette fonction est par exemple
utilisée la fonction `of` qui est également fournie.




Dans la suite, cette fois-ci, les fonctions implémentées seront des méthodes
d’instance (et non pas des méthodes « statiques » comme précédemment).





### 4.1. Tête




Implémenter la fonction (d’instance) `head` qui renvoie la tête de la stream.






### 4.2. Conversion en liste




Pour afficher correctement les stream, le plus simple est de les convertir en listes.
Implémenter la fonction `toList` qui convertie une `Stream` en `Liste`.






### 4.3. Suppression d’éléments



* Implémenter la fonction `take(n)` qui renvoie la stream composée des `n`
premiers éléments de la stream.
* Implémenter la fonction `drop(n)` qui renvoie la stream amputée de ses `n`
premiers éléments.
* Implémenter la fonction `takeWhile(p)` qui renvoie la stream composée des
éléments de la stream initiale jusqu’au premier élément qui ne satisfait pas
le prédicat `p`.





### 4.4. Existence




Implémenter la fonction `exists(p)` qui teste l’existence d’un élément dans la
stream qui statisfait le prédicat `p`.






### 4.5. `foldRight` paresseux



* Implémenter une version paresseuse de `foldRight`.
* Réimplémenter la fonction `exists` (nommée cette fois `exists2`) à l’aide de `foldRight`.
* Réimplémenter la fonction `takeWhile` (nommée cette fois `takeWhile2`) à l’aide de `foldRight`.





### 4.6. Filtre et recherche



* Implémenter la fonction `filter(p)` qui renvoie la stream des éléments qui
satisfont le prédicat `p`. Pour ce faire, vous utiliserez `foldRight`.
* À l’aide de `filtre` implémentez la méthode `find(p)` qui trouve le premier
élément de la stream qui satisfait le prédicat `p`.
* Bien que `filtre` extrait tous les éléments de la stream qui satisfont `p`, `find`
se contente d’inspecter uniquement les premiers éléments jusqu’au premier
qui satisfait `p`. Pourtant `find` utilise `filtre`!! Pourquoi ?





