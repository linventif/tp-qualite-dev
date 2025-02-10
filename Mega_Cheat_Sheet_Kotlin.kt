
// Mega Cheat Sheet Kotlin
// Ce fichier regroupe les exemples principaux de Kotlin extraits des cours.


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
    var answer = 42
    // Type mismatch error:
    //  answer = "unknown"
    println("Type mismatch")
}


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  TODO() // write some examples

  println("The type that can be combined " + "with every other type using '+':")
  println("???")

  // Can't be combined:
  TODO() // write some examples
}


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  // String can be combined with every other type:
  val si: String = string + int
  val sd: String = string + double
  val sb: String = string + boolean
  val sc: String = string + character

  val d1: Double = int + double
  val d2: Double = double + int
  val s1: String = character + string
  val c1: Char = character + int

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  // val bb = boolean + boolean
  // val ic = int + character
  // val ds = double + string


// --- Extrait de Introduction à Kotlin.html ---
val c1 = 'a' + 1
val c2 = 'a' + 25
val c3 = 'E' - 2


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
  val whole = 11
  val fractional = 1.4
  val trueOrFalse = true
  val words = "A value"
  val character = 'z'
  val lines = """Triple quotes let
you have many lines
in your string"""
  println(whole)
  println(fractional)
  println(trueOrFalse)
  println(words)
  println(character)
  println(lines)
}


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
  val s = "Sally" + 5.9
  println(s)
}


// --- Extrait de Introduction à Kotlin.html ---
fun squareInt(i: Int): Int = i * i

fun main() {
  println(squareInt(2))  // 4
}


// --- Extrait de Introduction à Kotlin.html ---
fun getSum(a: Double, b: Double, c: Double): Double = a+b+c

fun main() {
  println(getSum(1.0, 2.2, 3.4))  // 6.6
}


// --- Extrait de Introduction à Kotlin.html ---
fun duplicate(s: String): String = s + s

fun main() {
  println(duplicate("abc"))  // abcabc
}


// --- Extrait de Introduction à Kotlin.html ---
fun foo(): String {
  return "abc"
}

fun main() {
  println(foo())
}


// --- Extrait de Introduction à Kotlin.html ---
fun checkSign(number: Int): String =
  if (number > 0)
    "positive"
  else if (number < 0)
    "negative"
  else
    "zero"

fun main() {
  println(checkSign(-19))  // negative
}


// --- Extrait de Introduction à Kotlin.html ---
fun abs(number: Int): Int =
  if (number >= 0) number else -number

fun main() {
  println(abs(-19))  // 19
}


// --- Extrait de Introduction à Kotlin.html ---
fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  println(findMax(-1, 4))  // 4
}


// --- Extrait de Introduction à Kotlin.html ---
fun oneOrTheOther(exp: Boolean) =
  if (exp)
    "True!"
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))  // True!
}


// --- Extrait de Introduction à Kotlin.html ---
fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  val first = 17
  val second = 31
  println("The maximum of $first and $second is ${findMax(first, second)}.")
}


// --- Extrait de Introduction à Kotlin.html ---
fun record(index: Int, status: String, message: String): String =
  "$index [$status] $message\n"

fun main() {
  print(record(1, "OK", "Everything is fine."))
  print(record(2, "Fail", "Something has broken."))
}


// --- Extrait de Introduction à Kotlin.html ---
fun show(i: Int, s: String, c: Char, d: Double) {
    println("i: $i")
    println("s: \"$s\"")
    println("c: '$c'")
    println("d: $d")
}

fun main() {
  show(1, "abc", 'd', 2.0)
}


// --- Extrait de Introduction à Kotlin.html ---
fun displayContent(s: String) {
  var i = 0
  while (i < s.length) {
    println(s[i])
    i++
  }
}

fun main() {
    displayContent("abc")
}


// --- Extrait de Introduction à Kotlin.html ---
fun sum(number: Int): Int {
  var sum = 0
  var i = 0
  while (i <= number) {
    sum += i
    i++
  }
  return sum
}

fun main() {
  println(sum(10))  // 55
}


// --- Extrait de Introduction à Kotlin.html ---
fun sumOfEven(n: Int): Int {
  var result = 0
  var i = 0
  while (i <= n) {
    if (i % 2 == 0) {
      result += i
    }
    i++
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}


// --- Extrait de Introduction à Kotlin.html ---
fun getFooResult(): Int = 736

fun main() {
  println("Foo result is: ${getFooResult()}")
}


// --- Extrait de Introduction à Kotlin.html ---
fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun main() {
  println(factorial(10))  // 3628800
}


// --- Extrait de Introduction à Kotlin.html ---
fun sumOfFactorials(n: Int): Long {
  var result = 0L
  for (i in 1..n) {
    result += factorial(i)
  }
  return result
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}


// --- Extrait de Introduction à Kotlin.html ---
fun sumOfEven(n: Int): Int {
  var result = 0
  for (i in 1..n) {
    if (i % 2 == 0) {
      result += i
    }
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}


// --- Extrait de Introduction à Kotlin.html ---
fun showHalfTriangle(n: Int) {
  for (i in 1..n) {
    repeat(i) {
      print("#")
    }
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}


// --- Extrait de Introduction à Kotlin.html ---
fun getAlphabet(): String {
  var s = ""
  for (c in 'a'..'z') {
    s += c
  }
  return s
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}


// --- Extrait de Introduction à Kotlin.html ---
fun sumOfEven(n: Int): Int {
  var result = 0
  for (i in 0..n step 2) {
    result += i
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}


// --- Extrait de Introduction à Kotlin.html ---
fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}


// --- Extrait de Introduction à Kotlin.html ---
fun isValidCharacter(ch: Char): Boolean = ch == '_' ||
  ch in 'a'..'z' || ch in 'A'..'Z' ||
  ch in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty() || s[0] in '0'..'9') return false
  for (ch in s) {
    if (!isValidCharacter(ch)) return false
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}


// --- Extrait de Introduction à Kotlin.html ---
fun main() {
  println(println(1))
}


// --- Extrait de Introduction à Kotlin.html ---
fun f(i: Int, j: Int) = i + j

fun g(s1: String, s2: String) = s1 + s2

fun h() = println("h()")

fun main() {
  val fVal: Int = f(1, 2)
  val gVal: String = g("a", "bc")
  val hVal: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}


// --- Extrait de Introduction à Kotlin.html ---
// i-- means:
// First the current value is produced,
// then the value is decremented.
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i means:
// First the value is decremented,
// then the current value is produced.
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result =
  left - right // 1 - (-1) = 1 + 1 = 2
println(result)


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_lineaire_iterative(e:Int, liste:List<Int>) : Int


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_lineaire_iterative(e:Int, liste:List<Int>) : Int {
    var i : Int = 0
    while (i < liste.size && e != liste[i]) {
        i++
    }
    return if (i<liste.size) i else -1
}


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_lineaire_rec(e:Int, liste:List<Int>) : Int {
    return when {
        liste.isEmpty() -> -1
        liste.first() == e -> 0
        else -> {
            val res = recherche_lineaire_rec(e, liste.drop(1))
            if (res == -1) -1 else 1+res
        }
    }
}


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_dicho_iterative(e: Int, liste:List<Int>) : Int


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_dicho_iterative(e: Int, liste : List<Int>) : Int {
    var deb : Int = 0
    var fin : Int = liste.size - 1
    var milieu : Int = deb + (fin-deb)/2
    while (deb!=fin){
        if (e>liste[milieu])
            deb = milieu+1
        else fin = milieu
        milieu = deb + (fin-deb)/2
    }
    return if (liste[deb] == e) deb else -1
}


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_dicho_rec(e : Int, liste : List<Int>, bas : Int, haut : Int) : Int


// --- Extrait de Introduction à Kotlin.html ---
/* recherche dichotomique récursive avec des indices */
/* premier appel avec bas = 0 et haut = liste.size-1 */
fun recherche_dicho_rec(e : Int, liste : List<Int>, bas : Int, haut : Int) : Int {
    if (liste.isEmpty()) return -1
    if (bas == haut) return if (liste[bas] == e) bas else -1
    else {
        val milieu = (bas + haut) / 2
        return if (e <= liste[milieu]) recherche_dicho_rec(e, liste, bas, milieu)
        else recherche_dicho_rec(e, liste, milieu + 1, haut)
    }
}


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_dicho_rec(e : Int, liste : List<Int>) : Int


// --- Extrait de Introduction à Kotlin.html ---
fun recherche_dicho_rec(e : Int, liste : List<Int>) : Int {
    val half1 = liste.size/2
    val half2 = kotlin.math.ceil(liste.size/2.0).toInt()
    if (liste.isEmpty()) return -1
    if (liste.size == 1) return if (liste[0] == e) 0 else -1
    val res_gauche = recherche_dicho_rec(e, liste.dropLast(half2))
    if (res_gauche != -1) return res_gauche
    val res_droite = recherche_dicho_rec(e, liste.drop(half1))
    return if (res_droite != -1) half1 + res_droite else -1
}


// --- Extrait de Introduction à Kotlin.html ---
fun tri_insertion_mutable(liste : List<Int>) : List<Int>


// --- Extrait de Introduction à Kotlin.html ---
fun tri_insertion_mutable(liste : List<Int>) : List<Int> {
    var new_liste : MutableList<Int> = liste.toMutableList()
    for (j in 1 until liste.size){
        var key : Int = new_liste[j]
        var i = j-1
        while (i>-1 && new_liste[i]>key) {
            new_liste[i+1] = new_liste[i]
            i--
        }
        new_liste[i+1] = key
    }
    return new_liste.toList()
}


// --- Extrait de Introduction à Kotlin.html ---
fun tri_insertion_non_mutable(liste : List<Int>) : List<Int>


// --- Extrait de Introduction à Kotlin.html ---
/* La liste est divisée en l_j_deb et l_j_fin le premier élément de l_j_fin représente tab[j] */
/* De même l_j_deb est divisée en l_i_deb et l_i_fin et le premier élément de l_i_fin */
/* représent tab[i] */
fun tri_insertion_non_mutable(liste : List<Int>) : List<Int> {
    if (liste.isEmpty()) return emptyList()
    var l_j_deb: List<Int> = listOf(liste.first())
    var l_j_fin: List<Int> = liste.drop(1)
    while (!l_j_fin.isEmpty()) {
        val key = l_j_fin.first()
        var l_i_deb: List<Int> = l_j_deb
        var l_i_fin: List<Int> = emptyList()
        while (!l_i_deb.isEmpty() && l_i_deb.last() > key) {
            l_i_fin = listOf(l_i_deb.last()) + l_i_fin
            l_i_deb = l_i_deb.dropLast(1)
        }
        l_j_deb = l_i_deb + key + l_i_fin
        l_j_fin = l_j_fin.drop(1)
    }
    return l_j_deb
}


// --- Extrait de Programmation objet avec Kotlin.html ---
val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()


// --- Extrait de Programmation objet avec Kotlin.html ---
class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  val capacity: Int
    get() = maxCapacity - hamsters.size

  val full: Boolean
    get() = hamsters.size == maxCapacity

  /* add 'empty' property here */

  fun put(hamster: Hamster): Boolean =
    if (full)
      false
    else {
      hamsters += hamster
      true
    }

  fun takeHamster(): Hamster =
    hamsters.removeAt(0)
}

fun main() {
  val cage = Cage(2)
  // cage.empty eq true
  cage.put(Hamster("Alice"))
  // cage.empty eq false
}


// --- Extrait de Programmation objet avec Kotlin.html ---
fun main() {
  val accessible = Accessible()
  accessible.mutable = "abc"
  println(accessible.readOnly)
}


// --- Extrait de Programmation objet avec Kotlin.html ---
class AccessCounter {

  val accesses: Int
    get() = TODO()
}


// --- Extrait de Programmation objet avec Kotlin.html ---
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket {
    TODO()
}


// --- Extrait de Programmation objet avec Kotlin.html ---
data class Person(
  val name: String,
  // TODO: add property here
  val age: Int
)

fun displayPersonInfo(person: Person) {
// TODO
}

fun main() {
val person = Person("Alice",  30)
//  val person = Person("Alice", "Johnson", 30)
  displayPersonInfo(person)
}


// --- Extrait de Programmation objet avec Kotlin.html ---
interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      println("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}


// --- Extrait de Programmation objet avec Kotlin.html ---
fun playGame(factory: GameFactory) {
  val s = factory.create()
  while (s.move())
    ;
}

fun main() {
  playGame(Checkers.Factory)
  playGame(Chess.Factory)
}


// --- Extrait de Programmation objet avec Kotlin.html ---
val personne = Personne("Turing", "Alan", 112, "alan.turing@cam.ac.uk")
personne.presentation()


// --- Extrait de Programmation objet avec Kotlin.html ---
val jimmyPage = Etudiant1("Page", "Jimmy", 79, "Jimmy.Page.etu@univ-lille.fr", 53498, "BUT Guitare")
jimmyPage.presentation()


// --- Extrait de Programmation objet avec Kotlin.html ---
val iut = Composante("Université de Lille", "univ-lille.fr", "IUT de Lille", "A")
println(iut)


// --- Extrait de Programmation objet avec Kotlin.html ---
val guyDebord = Etudiant("Debord", "Guy", 92, iut, 12345, "BUT Spectacle")
    guyDebord.presentation()


// --- Extrait de Programmation objet avec Kotlin.html ---
val diplomes = listOf(Diplome("BUT", "Informatique", Grade.Licence),
                      Diplome("Master", "QUALITÉ, HYGIÈNE, SÉCURITÉ", Grade.Master),
                      Diplome("BUT", "Biologie", Grade.Licence))

val iut = Composante("Université de Lille", "univ-lille.fr", "IUT de Lille", "A", diplomes)
iut.lesDiplomes(Grade.Licence)


// --- Extrait de Programmation objet avec Kotlin.html ---
val josephSifakis = Etudiant("Sifakis", "Joseph",77, iut, 9999, Diplome("BUT", "Informatique", Grade.Licence))
josephSifakis.presentation()


// --- Extrait de Programmation objet avec Kotlin.html ---
val jimmyPage = Etudiant("Page", "Jimmy",79,iut, 53498, Diplome("BUT", "Guitare", Grade.Licence))
jimmyPage.presentation()


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
sealed class Shape
data class Rectangle(val longueur : Double, val largeur : Double) : Shape()
data class Cercle(val rayon: Double) : Shape()
object Point : Shape()


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
fun surface(forme : Shape) : Double = when (forme) {
    is Rectangle -> sqrt(forme.longueur.pow(2)+forme.largeur.pow(2))
    is Cercle -> forme.rayon.pow(2) * kotlin.math.PI
    is Point -> 0.0
}


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
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


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Somme d'entiers */
        fun sum(l : Liste<Int>) : Int = when (l) {
            is Nil -> 0
            is Cons -> l.head + sum(l.tail)
        }

        /* produit de doubles */
        fun product(l : Liste<Double>) : Double = when (l) {
            is Nil -> 1.0
            is Cons -> l.head * product(l.tail)
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Destructurations: head et tail */
        fun <A> head(l : Liste<A>) : A = when (l) {
            is Nil -> throw IllegalStateException("head: Nil n'a pas de tête")
            is Cons -> l.head
        }

        fun <A> tail(l : Liste<A>) : Liste<A> = when (l) {
            is Nil -> throw IllegalStateException("tail: Nil n'a pas de queue")
            is Cons -> l.tail
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Remplace le premier élément d'une liste par une autre valeur */
        fun <A> setHead(l : Liste<A>, x : A) : Liste<A> = when (l) {
            is Nil -> throw IllegalStateException("setHead: Nil n'a pas de tête")
            is Cons -> Cons(x, tail(l))
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Supprime les n premiers éléments d'une liste. */
        fun <A> drop(l : Liste<A>, n : Int) : Liste<A> = when {
            n<0 -> throw IllegalStateException("drop: n doit être positif ou nul")
            n == 0 -> l
            else ->  when (l) {
                Nil -> throw IllegalStateException("drop: liste trop petite")
                else -> drop(tail(l), n-1)
            }
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Supprime les premiers éléments d'une liste tant qu'ils satisfont une prédicat */
        fun <A> dropWhile(l: Liste<A>, p: (A) -> Boolean) : Liste<A> = when (l) {
            is Nil -> Nil
            is Cons -> if (p(l.head)) dropWhile(l.tail,p) else l
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* Longueur cumulée des chaînes de caractères contenues dans une liste */
        fun lengthOfStrings(l : Liste<String>) : Int = when (l) {
            is Nil -> 0
            is Cons -> l.head.length + lengthOfStrings(l.tail)
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
fun <A,B> foldRight(l : Liste<A>, z : B, f : (A,B) -> B ) : B


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* foldRight : généralisation de sum, product */
        fun <A,B> foldRight(l : Liste<A>, z : B, f : (A,B) -> B ) : B = when (l) {
            is Nil -> z
            is Cons -> f(l.head, foldRight(l.tail,z,f))
        }

        /* Réimplémentation de sum, product et longueur */
        fun sum2(l : Liste<Int>) : Int = foldRight(l, 0, {a , b -> a+b} )
        fun product2(l : Liste<Double>) : Double = foldRight(l, 1.0, {a , b -> a*b} )
        fun lengthOfStrings2(l : Liste<String>) : Int = foldRight(l, 0, {a, b -> a.length + b})

        /* Longueur d'une liste avec foldRight */
        fun <A> length(l : Liste<A>) : Int = foldRight(l, 0, { a, b -> 1 + b})


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        fun sumTerm(l : Liste<Int>) : Int {
            tailrec fun sumTermAux(l: Liste<Int>, acc: Int): Int = when (l) {
                is Nil -> acc
                is Cons -> sumTermAux(l.tail, l.head + acc)
            }
            return sumTermAux(l, 0)
        }

        /* product terminale */
        fun productTerm(l : Liste<Double>) : Double {
            tailrec fun productTermAux(l: Liste<Double>, acc: Double): Double = when (l) {
                is Nil -> acc
                is Cons -> productTermAux(l.tail, l.head + acc)
            }
            return productTermAux(l, 1.0)
        }

        /* lengthOfStrings terminale */
        fun lengthOfStringsTerm(l : Liste<String>) : Int {
            tailrec fun lengthOfStringsTermAux(l: Liste<String>, acc: Int): Int = when (l) {
                is Nil -> acc
                is Cons -> lengthOfStringsTermAux(l.tail, l.head.length + acc)
            }
            return lengthOfStringsTermAux(l, 1)
        }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
        /* foldLeft */
        tailrec fun <A,B> foldLeft(l : Liste<A>, z : B, f : (B,A) -> B) : B = when (l) {
            is Nil -> z
            is Cons -> foldLeft(l.tail, f(z,l.head), f)
        }

        fun sumTerm2 (l : Liste<Int>) : Int = foldLeft(l, 0, { a, b -> a + b })
        fun productTerm2(l : Liste<Double>) : Double = foldLeft(l, 1.0, { a, b -> a * b })
        fun lengthOfStringsTerm2(l : Liste<String>) : Int = foldLeft(l, 1, { a, b -> a * b.length })


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
sealed class Stream<out A>

object Empty : Stream<Nothing>()

data class Cons<out A>(
    val head: () -> A,
    val tail: () -> Stream<A>
): Stream<A>()


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    fun <A> head(): A = when (this) {
        is Empty -> throw IllegalStateException("head: Nil n'a pas de tête")
        is Cons -> this.head()
    }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    /* Convertie une stream en liste */
    fun toList(): Liste<A> = when (this) {
        is Empty -> Nil
        is Cons -> ConsL(this.head(), this.tail().toList())
    }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    /* Renvoie les n premiers éléments */
    fun take(n: Int): Stream<A> = when {
        n < 0 -> throw IllegalStateException("take: n doit être positif ou nul")
        n == 0 -> Empty
        else -> when (this) {
            is Empty -> throw IllegalStateException("take: Stream trop petite")
            is Cons -> cons(this.head, { this.tail().take(n - 1) })
        }
    }

    /* Supprime les n premiers éléments d'une stream */
    fun drop(n: Int): Stream<A> = when {
        n < 0 -> throw IllegalStateException("drop: n doit être positif ou nul")
        n == 0 -> this
        else -> when (this) {
            is Empty -> throw IllegalStateException("drop: liste trop petite")
            is Cons -> drop(n - 1)
        }
    }

    /* renvoie la stream composée des éléments de this jusqu'au premier élément */
    /* qui ne satisfait pas le prédicat p */
    fun takeWhile(p: (A) -> Boolean): Stream<A> = when (this) {
        is Empty -> Empty
        is Cons -> if (p(this.head())) cons(this.head, { this.tail().takeWhile(p) })
        else Empty
    }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    /* teste l'existance d'un élément dans la stream qui statisfait le prédicat p */
    fun exists(p: (A) -> Boolean): Boolean = when (this) {
        is Empty -> false
        is Cons -> if (p(this.head())) true else this.tail().exists(p)
    }


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    /* foldRight */
    fun <B> foldRight(z: () -> B, f: (A, () -> B) -> B): B = when (this) {
        is Empty -> z()
        is Cons -> f(this.head()) { this.tail().foldRight(z, f) }
    }

    /* exists avec foldRight */
    fun exists2(p: (A) -> Boolean): Boolean = this.foldRight( { false }, { a, b -> if (p(a)) true else b() } )

    /* takeWhile avec foldRight */
    fun takeWhile2(p: (A) -> Boolean): Stream<A> = this.foldRight( { Empty as Stream<A> } , { a, b -> if (p(a)) cons({ a }, b) else Empty })


// --- Extrait de Programmation fonctionnelle avec Kotlin.html ---
    /* Trouver les éléments d'une Stream qui satisfont un prédicat */
    fun filter(p : (A) -> Boolean) : Stream<A> = this.foldRight( { Empty as Stream<A> }, { a, b -> if (p(a)) cons({ a }, b) else b() } )

    /* Premier élément qui satisfait un prédicat */
    fun find(p : (A) -> Boolean) : A = filter(p).head()


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
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


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun count(l : Liste<Int>) : Int


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun sort(l : Liste<Int>) : Liste<Int>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun sortOnePass(l : Liste<Int>) : Liste<Int>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun <A,B> map(f : (A)->B) : (Option<A>) -> Option<B>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
val inc: (Int)->Int = { x -> x+1 }
val incOpt : (Option<Int>) -> Option<Int> = map(inc)


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun <A,B> flatMap(f : (A)->Option<B>) : (Option<A>) -> Option<B>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun <A,B,C> mapOp (f: (A,B) -> C) : (Option<A>,Option<B>) -> Option<C>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun count(l : Liste<Int>) : Option<Int>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun sort(l : Liste<Int>) : Option<Liste<Int>>


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
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


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
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
                    printAux(t.left, s + "  ")
                    printAux(t.right, s + "  ")
                }
                else -> {}
            }
        }
        printAux(this,"")
    }
}

data class BTNode(val value : Int, val left : BinaryTree, val right : BinaryTree) : BinaryTree()

data object BTEmpty : BinaryTree()


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun isSymetric() : Boolean


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun isHeap() : Boolean


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
 fun rightHeap(a : Int) : BinaryTree


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
sealed class BinomialHeap

data class BHNode(val value : Int, val children : Liste<BinomialHeap>) : BinomialHeap()

data object BHEmpty : BinomialHeap()


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun order() : Int


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun isBH() : Boolean


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun fusion(b1: BinomialHeap, b2: BinomialHeap) : BinomialHeap


// --- Extrait de Algorithmique fonctionnelle avec Kotlin.html ---
fun toBinomialHeap() : BinomialHeap


// --- Extrait de Généricité et typage avancé.html ---
public class PileTableau<E> implements Pile<E> {
    protected E [] elements ;  // les éléments contenus dans la pile
    protected int nbElem = 0 ; // le nombre d’éléments dans la pile
    protected String nom ;     // nom de la pile : information supplémentaire propre à PileTableau

    /** Constructeur qui crée une pile vide et lui donne un nom */
    @SuppressWarnings("unchecked")
    public PileTableau() {
        elements = (E[]) new Object[MAX_ELEMENTS] ;
        this.nom = "la pile";
    }

    /** Constructeur qui crée une pile vide et lui donne un nom */
    @SuppressWarnings("unchecked")
    public PileTableau(String nom) {
        elements = (E[]) new Object[MAX_ELEMENTS] ;
        this.nom = nom ;
    }

    /* IMPLEMENTATION DE L'INTERFACE PILE */

    /** teste si la pile est vide */
    public boolean vide() {
        return (nbElem == 0) ;
    }

    /** teste si la pile est pleine */
    public boolean pleine () {
        return (nbElem == MAX_ELEMENTS) ;
    }

    /** teste si la pile peut empiler x */
    public boolean peutEmpiler (E x) {
        return (!pleine()) ;
    }

    /** renvoie la valeur de l'objet sur le sommet de la pile */
    public E sommet() {
        if (vide()) return null ;
        else return elements[nbElem-1] ;
    }

    /** renvoie la valeur de l'objet sur le sommet de la pile
     * et l'enlève */
    public E depile() {
        if (vide()) return null ;
        nbElem-- ;
        return elements[nbElem] ;
    }

    /** ajoute un objet sur le sommet de la pile */
    public void empile(E o){
        if (peutEmpiler(o)) {
            elements[nbElem] = o ;
            nbElem++ ;
        }
        else System.out.println("empilation impossible");
    }

    /** vide la pile */
    public void vider() {
        nbElem = 0 ;
    }

    /** compte le nombre d'éléments présents dans la pile */
    public int nbElements() {
        return nbElem ;
    }

    public void deplacerUnElementVers(Pile<E> p) {
        if (!vide() && p.peutEmpiler(sommet())) {
            p.empile(this.depile()) ;
            if (p instanceof PileTableau)
                System.out.println("Déplacement de " + nom + " vers "
                        + ((PileTableau<E>) p).nom());
        }
    }

    /** affichage (sommet = premier) */
    public String toString() {


// --- Extrait de Généricité et typage avancé.html ---
public class Rationnel implements Comparable<Rationnel> {
    private final int  p;
    private final int  q;

    public Rationnel(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int get_p(){
        return p;
    }

    public int get_q(){
        return q;
    }

    @Override
    public int compareTo(Rationnel o) {
        return Integer.compare(p * o.get_q(), q * o.get_p());
    }

    public String toString(){
        return p + "/" + q;
    }
}


// --- Extrait de Généricité et typage avancé.html ---
public class PileTableauEntier<Integer> implements Pile<Integer> {...


// --- Extrait de Généricité et typage avancé.html ---
public class PileTableauEntier implements Pile<Integer> {
    private final Integer [] elements ;  // les éléments contenus dans la pile
    private int nbElem = 0 ; // le nombre d’éléments dans la pile
    private final String nom ;     // nom de la pile : information supplémentaire propre à PileTableau

    /** Constructeur qui crée une pile vide et lui donne un nom */
    public PileTableauEntier(String nom) {
        elements = new Integer[MAX_ELEMENTS] ;
        this.nom = nom ;
    }

    /* IMPLEMENTATION DE L'INTERFACE PILE */

    /** teste si la pile est vide */
    public boolean vide() {
        return (nbElem == 0) ;
    }

    /** teste si la pile est pleine */
    public boolean pleine () {
        return (nbElem == MAX_ELEMENTS) ;
    }

    /** teste si la pile peut empiler x */
    public boolean peutEmpiler (Integer x) {
        return (!pleine()) ;
    }

    /** renvoie la valeur de l'objet sur le sommet de la pile */
    public Integer sommet() {
        if (vide()) return null ;
        else return elements[nbElem-1] ;
    }

    /** renvoie la valeur de l'objet sur le sommet de la pile
     * et l'enlève */
    public Integer depile() {
        if (vide()) return null ;
        nbElem-- ;
        return elements[nbElem] ;
    }

    /** ajoute un objet sur le sommet de la pile */
    public void empile(Integer o) {
        if (peutEmpiler(o)) {
            elements[nbElem] = o ;
            nbElem++ ;
        }
    }

    /** vide la pile */
    public void vider() {
        nbElem = 0 ;
    }

    /** compte le nombre d'éléments présents dans la pile */
    public int nbElements() {
        return nbElem ;
    }

    public void deplacerUnElementVers(Pile<Integer> p) {
        if (!vide() && p.peutEmpiler(sommet())) {
            p.empile(this.depile()) ;
            if (p instanceof PileTableauEntier)
                System.out.println("Déplacement de " + nom + " vers "
                + ((PileTableauEntier) p).nom());
        }
    }

    /** affichage */
    public String toString() {
        StringBuilder s = new StringBuilder(nom + ": [");
        for (int i = nbElem-1; i>=0; i--) {
            s.append(elements[i].toString());
            if (i>0) s.append("; ");
            else s.append("]");
        }
        return s.toString();
    }

    // Méthode d'instance additionnelle
    public void copieDepuis(Pile<? extends Integer> p){
        this.empile(p.sommet());
    }

    public void copieVers(Pile<? super Integer> p){
        p.empile(this.sommet());
    }

    public String nom() { return nom ; }
}


// --- Extrait de Généricité et typage avancé.html ---
public class DisqueHanoi implements Disque, Comparable<Disque> {
    // le diamètre du disque
    private int diametre = 1 ;

    /** On construit une instance de DisqueHanoi en spécifiant son diamètre
     * @param d entier positif donnant le diamètre du disque */
    public DisqueHanoi(int d) { 
    diametre = d ;
    }

    /** Affichage élémentaire d'un disque
     *  @return une chaîne donnant la valeur du diamètre */
    public String toString() { 
    return "" + diametre ; 
    }

    public int diametre() {
    return diametre ; 
    }

    public int compareTo(Disque o) {
    return (diametre - o.diametre()) ;       
    }
}


// --- Extrait de Généricité et typage avancé.html ---
public class PileHanoi extends PileTableau<DisqueHanoi> {
    public PileHanoi(){
        this.elements = new DisqueHanoi[MAX_ELEMENTS];
    }

    public PileHanoi(String nom){
         this();
         this.nom = nom;
    }

    /** teste si l'empilement d'un objet o est possible */
    public boolean peutEmpiler(DisqueHanoi e)
    {
        if ((e == null) || (pleine()))
            return false ;
        else
            return (vide() || (e.compareTo(sommet()) < 0));
    }

    public String toString()
    {
        String s = "" ;
        for (int i = 0; i < this.nbElem; i++){
            s += " " + this.elements[i];
        }
        s += "\n" ;
        return nom + ":" + s ;
    }
}


// --- Extrait de Lambda expressions et streams.html ---
  public class Lambda {
      // Déclaration de la méthode calcul

      public static void main(String[] args){
          System.out.println("Il y a " + calcul(args,x->x.equals("coucou")) + " fois la chaîne \"coucou\" en argument");
          System.out.println("Il y a " + calcul(args,x->x.equals("cuicui")) + " fois la chaîne \"cuicui\" en argument");
      }
  }


// --- Extrait de Lambda expressions et streams.html ---
  @FunctionalInterface
  public interface MonInterface {
      boolean test(String s);
  }

  // import java.util.function.*;

  public class Lambda {
      // static int calcul(String[] t, Predicate<String> f) { // avec import java.util.function.*, ou bien...
      static int calcul(String[] t, MonInterface f) {
          int cpt = 0;
          for (String x : t) if (f.test(x)) cpt++;
          return cpt;
      }

      public static void main(String[] args){
          System.out.println("Il y a " + calcul(args,x->x.equals("coucou")) + " fois la chaîne \"coucou\" en argument");
          System.out.println("Il y a " + calcul(args,x->x.charAt(0) == '-') + " arguments commençant par un tiret");
          // ou bien
          // System.out.println("Il y a " + calcul(args,x->x.startsWith("-")) + " arguments commençant par un tiret");
      }
  }


// --- Extrait de Lambda expressions et streams.html ---
public abstract class Bloc {
    protected double masse_volumique;
    public Bloc(double mv) {
        masse_volumique = mv;
    }
    public double masse() {
        return masse_volumique * volume();
    }
    public abstract double volume(); // signature seule
}


// --- Extrait de Lambda expressions et streams.html ---
public class Boule extends Bloc {
    protected double r;
    public Boule(double mv, double r) {
        super(mv);
        this.r = r;
    }
    public double volume() {
        return Math.PI * r * r * r * 4 / 3;
    }
}


// --- Extrait de Lambda expressions et streams.html ---
public class Cube extends Bloc {
    protected double cote;
    public Cube(double mv, double c) {
        super(mv);
        cote = c;
    }
    public double volume() {
        return cote * cote * cote;
    }
}


// --- Extrait de Lambda expressions et streams.html ---
import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Bloc> desBlocs = Arrays.asList(new Cube(10.0,2.5), new Boule(3.0,2.1), new Cube(42.2,10.4));
        double total = 0;

        for (Bloc bloc : desBlocs) {
            total = total + bloc.volume();
        }

        double average = 0;
        if (desBlocs.size() > 0) {
            average = total / desBlocs.size();
        }

        System.out.println("moyenne = " + average);
    }
}


// --- Extrait de Lambda expressions et streams.html ---
import java.util.stream.*;
import java.util.function.*;
import java.math.BigInteger;

public class Palindrome {
    static boolean estPalin(BigInteger i) {
        String s = i.toString();
        if (s.length()<=1) return true;
        String ss = s.substring(1,s.length()-1);
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        if (ss.length()<=1) return true;
        else return estPalin(new BigInteger(ss));
    };

    public static void main(String[] args){
        Stream.iterate(BigInteger.valueOf(1),x->x.add(BigInteger.valueOf(1)))
            .map(x->x.multiply(x))
            .filter(Palindrome::estPalin)
            .limit(Integer.parseInt(args[0]))
            .forEach(System.out::println);
    }
}


// --- Extrait de Lambda expressions et streams.html ---
import java.util.stream.*;
import java.util.function.*;
import java.math.BigInteger;

public class Factoriels {
    public static void main(String[] args){
        // Version avec des int qui déborde rapidement...
        // Stream.iterate(new int[] {1,1},x -> new int[] {x[0]+1,x[1]*(x[0]+1)})
        //     .limit(Integer.parseInt(args[0]))
        //     .map(x->x[1])
        //     .forEach(System.out::println);
        BigInteger un = BigInteger.valueOf(1);
        Stream.iterate(new BigInteger[] {BigInteger.valueOf(1),BigInteger.valueOf(1)},
                       x -> new BigInteger[] {x[0].add(un),x[1].multiply(x[0].add(un))})
            .limit(Integer.parseInt(args[0]))
            .map(x->x[1])
            .forEach(System.out::println);
    }
}

