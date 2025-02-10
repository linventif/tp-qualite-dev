# Mega Cheat Sheet Kotlin


# Introduction à Kotlin

BUT Informatique - S5 - Qualité de développement



Dans ce TP vous allez utiliser IntelliJ. Vous pouvez réaliser tous les exercices
dans un seul fichier. Vous avez simplement à créer un nouveau projet en
sélectionnant Kotlin comme langage.




## 1. Exercices d’échauffement




Ces exercices sont extraits du livre [Atomic Kotlin](https://leanpub.com/AtomicKotlin). Il s’agit d’exercices très
simples dont l’unique objectif est de mémoriser et vous familiariser avec la
syntaxe et la sémantique des éléments de base de Kotlin.





### 1.1. `var` & `val` (1)




Define a val answer and set its value to 42. Display the value of answer on the
console.




On the next line, try to reassign answer to 43. What error does Kotlin produce?
Fix the error by replacing val with var. Display the new value of answer on the
console.






### 1.2. `var` & `val` (2)




Define `var a = 10`.




Now define a `val b = a`.




Now assign 42 to `a` and display both `a` and `b` on different lines.






### 1.3. `var` & `val` (3)




Define two vars: `x` and `y`. Swap their contents. First try `x = y, y = x`, then fix the erroneous solution:





```
var x = 1
var y = 2
// Perform swap here
println(x) // 2
println(y) // 1

```





### 1.4. Data types (1)




Declare a `var` called `answer` of type `Int` and set its value to 42. In the next
line try to reassign `answer` to the `String "unknown"`. What error does Kotlin
produce ?




Remove the `Int` type specification. Does the error change ?






### 1.5. Data types (2)





```
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

```



Attempt to combine various vals of different types using the + operator. Only
combine two at a time, and assign each combination to a (explicitly typed) `val` result. See which
types combine. On the console, display the name of the type that can be combined
with any other type if it goes first.




Replace the lines containing `TODO()` in the solution code with working code. If
you don’t remove these lines, you’ll see an error saying « Operation is not
implemented. »






### 1.6. Data types (3)




Guess the results of the following expressions and then check your guesses using Kotlin:





```
val c1 = 'a' + 1
val c2 = 'a' + 25
val c3 = 'E' - 2

```





### 1.7. Data types (IntelliJ 1)





```
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

```



If you put the caret on an identifier and press `Ctrl+Q`, you’ll check the type
Kotlin infers for this identifier.




Press `Echap` to close the pop-up.




Check the types of all declared variables in the example.






### 1.8. Data types (IntelliJ 2)





```
fun main() {
  val s = "Sally" + 5.9
  println(s)
}

```



IntelliJ IDEA helps you automatically add type specifications for vals and vars.
Put the caret right after `s` and press `Alt+Entrée`. This is the shortcut for `Show
intention actions`. Choose `Specify type explicitly` in the dropdown menu.




Different intention actions are available in different contexts, depending on
where you put the caret.






### 1.9. Functions (1)




Create a function `squareInt()` that takes an `Int` parameter and returns its
mathematical square. Test it.






### 1.10. Functions (2)




Create a function `sumDoubles()` that takes three `Double` parameters and returns
their sum. Test it.






### 1.11. Functions (3)




Create a function `duplicate()` that takes a `String` parameter and returns that
`String` repeated twice. Test it.






### 1.12. Functions (IntelliJ)





```
fun foo(): String {
  return "abc"
}

fun main() {
  println(foo())
}

```



You can automatically convert a function with a **block body** to a function with an
**expression body**, and vice versa. Put the caret somewhere on the `return` keyword,
press `Alt+Entrée` to call the intention actions menu, and choose `Convert to
expression body`. After the conversion the type remains highlighted, which is
convenient because you can either remove the type declaration by pressing `Delete`
or leave it by moving the caret to the right.




To apply the reverse intention, press `Alt+Entrée` on the equal sign on the
function with expression body and choose the reverse conversion.






### 1.13. If (1)




Create a function `checkSign()` **with an expression body** that checks whether an
integer number is positive, negative, or zero, and returns a `String` `"positive"`,
`"negative"` or `"zero"` as a result.






### 1.14. If (2)




Create a function `abs()` **with an expression body** that returns the absolute value
of its parameter: for example, `abs(3)` is `3` and `abs(-5)` is `5`.






### 1.15. If (3)




Create a function `findMax()` that finds the maximum value when given two integer arguments.






### 1.16. If (IntelliJ)





```
fun oneOrTheOther(exp: Boolean) =
  if (exp)
    "True!"
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))  // True!
}

```



To navigate to a function definition, put the caret on the usage and press
`Ctrl+B`. Alternatively, you can click on the symbol while holding the `Ctrl` key
(or the Command key on Mac).




Put the caret on the `oneOrTheOther()` function call in `main()` and navigate to the
function definition.






### 1.17. String template (1)




Display the result of the function `findMax()` (from the exercises in the previous
atom) on the console in the form `"The maximum of x and y is max."` Use a String
template to perform the substitution of `x`, `y` and the maximum value.






### 1.18. String template (2)




Implement a `record()` function that returns a `String` in the form: `index [status]
message` , where `index`, `status` and `message` are passed into `record()` as parameters. `record()` should
add a line break (`\n`) at the end of the `String`.






### 1.19. String template (3)




Write a function `show()` with parameters `i: Int, s: String, c: Char` and `d:
Double`. On the console, `show()` displays the value of each parameter on its own
line: first the name of the identifier, then a colon and a space, and then the
value of that identifier. Surround the `String` value with double quotes and the
`Char` value with single quotes.




Sample output for `show(10, "abc", 'a', 1.0)`:





```
i: 10
s: "abc"
c: 'a'
d: 1.0

```





### 1.20. While (1)




Using a `while` loop, write a function `displayContent()` that takes a `String`
parameter and displays each character on its own line (`s[i]` denotes the
character of index `i` in string `s`).






### 1.21. While (2)




Using a `while` loop, write a function `sum` that sums the integral numbers from zero up
to and including a given number (the parameter).






### 1.22. While (3)




Using a while loop, write a function `sumEven` that sums only even numbers up to and
including a given number (the parameter).






### 1.23. While (IntelliJ)





```
fun getFooResult(): Int = 736

fun main() {
  println("Foo result is: ${getFooResult()}")
}

```



IntelliJ IDEA can extract a `val` or `var` automatically. Select the expression
`getFooResult()` inside a string template, then do one of the following:



* Invoke Find action (by pressing `Ctrl+Maj+A`), then type `Extract variable` to find the corresponding action
* Press `Ctrl+Alt+V`
* Choose `Refactor | Extract | Variable...` in the application menu.



Type the name of the new variable. IntelliJ IDEA tries to suggest a name based
on the expression. Press `Entrée` to finish.






### 1.24. Looping and range (1)




Using a `for` loop, create a function `factorial` that calculates the factorial of its
parameter (n!=1×2×⋯×n).




Put an `L` at the end of a number literal or use `.toLong()` to convert an integer
constant or expression to type `Long`.






### 1.25. Looping and range (2)




Using a `for` loop, create a function `sumOfFactorials` that sums the factorials up to its parameter
(1!+2!+...+n!).






### 1.26. Looping and range (3)




Using a `for` loop, create a function that sums up only even numbers up to its parameter.






### 1.27. Looping and range (4)




Display half of a triangle. For an argument of 6 the function showHalfTriangle() should display the following:





```
#
##
###
####
#####
######

```



You can rewrite the function to use `repeat`.






### 1.28. Looping and range (IntelliJ)




IntelliJ IDEA rapidly creates frequent-used expressions using `Live templates`.
Type `iter` and then press `Tab`. This live template expands into a `for` expression.
You type the expression you want to iterate over, along with the name for the
index variable. IntelliJ IDEA automatically suggests the variable name to
iterate over if it’s available in the context.





```
iter + tab

for (i in iterable) {

}

```





### 1.29. The `in` keyword (1)




Create a `String` by iterating over a range of characters 
that you define. The resulting String should contain all English letters
 in alphabetical order: « abc…z ».






### 1.30. The `in` keyword (2)




Use `step` to write a function `sumOfEven` that sums only even numbers up to a given number (the parameter).






### 1.31. The in keyword (3)




Write a function `isLowerCase` that checks whether a character is a lowercase letter.






### 1.32. The in keyword (4)




Write a function `isValidIdentifier` that checks whether its `String` parameter is a
valid identifier. A valid identifier is a non-empty `String` that starts with a
letter or underscore and consists of only letters, digits and underscores.




Use `s.isEmpty()` to check whether `s` is an empty `String`.






### 1.33. The in keyword (5)




The `main` live template automatically produces the `main()` function declaration.
Type `main`, and then press `Tab`.






### 1.34. Expressions & Statements (1)




Display the return value of `println(1)`. Explain the result!






### 1.35. Expressions & Statements (2)




Write three functions using expression body syntax:



* `f()` takes two Int parameters and returns the sum.
* `g()` takes two String parameters and returns them, concatenated.
* `h()` calls `println()` to display `"h()"`



In `main()`, assign the result of each function to a val, and specify the type.
Then print on the console the value of each val. Explain the result!






### 1.36. Expressions & Statements (2)




Guess what the following code will display and then check yourself using Kotlin:





```
var i = 1
println(i-- - --i)

```






## 2. Algorithmique en Kotlin




Dans cette partie du TP nous allons reprendre quelques algorithmes vus en cours
de Qualité Algorithmique et étudier des variants. Vous utiliserez exclusivement
des listes (mutables et non mutables). Vous aurez besoin d’explorer les méthodes
disponibles sur les listes. La complétion automatique de Kotlin vous aidera à
trouver les méthodes adéquates. Notez qu’en mettant le curseur sur une méthode,
une fenêtre pop-up donnera la documention de la méthode. Vous aurez en
particulier besoin des méthodes permettant de récupérer les premier et dernier
éléments d’une liste, ainsi que d’extraire une liste contenant les n permiers
ou n derniers éléments.





### 2.1. Recherche linéaire





#### Version itérative




Implantez en Kotlin, **de façon itérative**, la recherche linéaire d’un élément
`e` dans une liste `liste` qui renvoie l’indice de `e` dans `liste`, si `e` est
présent, et -1 sinon:





```
fun recherche\_lineaire\_iterative(e:Int, liste:List<Int>) : Int

```





#### Version récursive




Même question mais cette fois en version récursive à l’aide de la clause `when`.







### 2.2. Recherche dichotomique





#### Version itérative




Implémentez la version itérative de la recherche dichotomique:





```
fun recherche\_dicho\_iterative(e: Int, liste:List<Int>) : Int

```





#### Version récursive avec indices




Implémentez la version récursive de la recherche dichotomique avec indices:





```
fun recherche\_dicho\_rec(e : Int, liste : List<Int>, bas : Int, haut : Int) : Int

```





#### Version récursive sans indices




Réimplémentez la version récursive mais cette fois sans indices:





```
fun recherche\_dicho\_rec(e : Int, liste : List<Int>) : Int

```



Il s’agira cette fois de rappeler la fonction sur chacune des deux moitiés de
liste (il ne s’agit évidemment pas de simplement faire appel la fonction
précédemment implémentée!)







### 2.3. Tri par insertion





#### Version mutable




Implémentez le tri par insertion à l’aide de listes mutables:





```
fun tri\_insertion\_mutable(liste : List<Int>) : List<Int>

```





#### Version non mutable




Implémentez le tri par insertion en utilisant uniquement des listes non mutables!





```
fun tri\_insertion\_non\_mutable(liste : List<Int>) : List<Int>

```









# Programmation objet avec Kotlin

BUT Informatique - S5 - Qualité de développement



## 1. Exercices d’échauffement





### 1.1. Creating Classes (#1)




Create a class named `SomeClass` with three member functions: `a()` which displays
`42` on the console when you call it, `b()` which calls `a()`, and `c()` which calls `b()`
by qualifying it (ie. that is specifying its object).






### 1.2. Creating Classes (#2)




Create a class `Giraffe` with a single member function `displayID()` that displays
the address of the object. Call `Strings substringAfter()` to extract the address
from the default object representation. Run the following code and compare the
addresses:





```
val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()

```





### 1.3. Creating Classes (#3)




Create a `Robot` class with the following four member functions: `right(steps:
Int), left(steps: Int), down(steps: Int) and up(steps: Int)`. Each function
should display one of the following phrases on the console:





```
Right N steps
Left N steps
Down N steps
Up N steps

```



where `N` is the provided number of steps.






### 1.4. Properties (#1)




Create a class `X` that contains three `Int` properties: `a` and `b` are vals and `c` is a
var. Initialize `a` to 3, `b` to 42, and `c` to zero. Create an `add()` member function
that sums `a` and `b` and assigns the result to `c`, then returns `c`. Write a `main()` to
test `X`.






### 1.5. Properties (#2)




A Robot object starts in the (0, 0) cell and can move right, left, up and down.
Its location is stored as a pair of coordinates (x, y), where (0, 0) is the
top-left corner:





```
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)

```



Moving right increases the x coordinate, moving down increases the y coordinate,
while moving left and up decrease the x and y coordinates.




Implement Robot’s member functions `right()`, `left()`, `up()` and `down()`, each of
which takes a steps parameter. Also implement `getLocation()` which returns the
Robot’s coordinates as a `String` in the form `(x, y)`.






### 1.6. Properties (#3)




A Robot can move within a square field of size 100x100. The borders of this
field are « looped »: if the robot is in cell (0, 0) and moves up one step, it
arrives in cell (0, 99).





```
(0, 0)
// up(1)
(0, 99)
// left(10)
(90, 99)

```



Modify `right()`, `left()`, `up()` and `down()` to implement this behavior.






### 1.7. Constructors (#1)




Create a class `Floating` that contains a val `d` of type `Double`. Initialize `d` in
the constructor. Include a `toString()` member function that returns the contents
of `d`. Write a `main()` to exercise the `Floating` class.






### 1.8. Constructors (#2)




Continue developing the `Robot` class from the previous exercises.
Convert the properties storing the size of the field and the current coordinates
into Robot constructor parameters.






### 1.9. Constructors (#3)




Add a `toString()` function that returns the `String` « Robot(x=…, y=…) » where
the actual values of `x` and `y` are substituted for the ellipses. For example, if `x`
is 1 and `y` is 2 it should return `Robot(x=1, y=2)`.






### 1.10. Constraining Visibility (#1)




Create an `Alien` class with a constructor that initializes `public val name` and
`public val species` properties. Add a private `var planet` property initialized by
the constructor. `planet` can be modified with the `movePlanet()` member function.
`movePlanet()` takes the planet the Alien is moving to as its parameter. All
properties and parameters are of type `String`. Override `toString()` to return the
name, species and planet in the format `"Alien $name, $species: $planet"`.




In `main()`, create two Aliens and move them from an origin planet to a
destination planet, testing them using `toString()` along with the data:










| name | species | Origin | Destination |
| --- | --- | --- | --- |
| Arthricia | Cat Person | PurgePlanet | Earth C-137 |
| Dale | Giant | Gearworld | Parblesnops |



Note that a val property is safe to access directly as a public property rather than making it private.






### 1.11. Constraining Visibility (#2)




Continue developing the `Robot` class from the previous exercises.
Use private on all the properties, and verify that you can’t
access the private members outside of the class.






### 1.12. Property Accessors (#1)




Add the property `empty` to the `Cage` class with a getter that returns a `Boolean`
indicating whether the `Cage` contains any Hamsters:





```
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

```





### 1.13. Property Accessors (#2)




Create a class `Accessible` containing `String` properties `mutable` and `readOnly`. Add
the appropriate custom property accessors to make each property fit its name.




Initialize the `mutable` property with an empty `String`. Its accessors should
display `mutable:get` and `mutable:set`. The `readOnly` property should display
`readOnly:get` and return the value of mutable.




The following `main` function:





```
fun main() {
  val accessible = Accessible()
  accessible.mutable = "abc"
  println(accessible.readOnly)
}

```



should display:





```
mutable:set
readOnly:get
mutable:get
abc

```





### 1.14. Property Accessors (#3)




Create a class `AccessCounter` containing a property `val accesses` which tells how many
times this property was accessed:





```
class AccessCounter {

  val accesses: Int
    get() = TODO()
}

```





### 1.15. Extension Functions




Implement `isOdd()` and `isEven()` as `Int` extension functions that produce a `Boolean`
indicating whether that `Int` is odd or even, respectively. We assume that the
input number is positive.






### 1.16. Data classes (#1)




Create a data class called `AirlineTicket` containing the following fields:



* `firstName: String`
* `lastName: String`
* `ticket: Int`
* `origin: String`
* `destination: String`





### 1.17. Data Classes (#2)




Create an extension function called `transferTicket()` that copies an `AirlineTicket` object, replacing `firstName` and `lastName` with the new values during the copy:





```
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket {
    TODO()
}

```





### 1.18. Destructuring Declarations




The starter code below contains a data class `Person` with two properties:
`name:String` and `age:Int`. Write a `displayPersonInfo()` function that takes a
parameter of `person: Person` and display the corresponding values on the console:





```
Name: $name
Age: $age

```



Add a new second property `surname` between `name` and `age` in `Person`. The first
property should be `name` and the third property should be `age`. Don’t modify
`displayPersonInfo()`. In `main()`, show that `displayPersonInfo()` now works
incorrectly.





```
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
// val person = Person("Alice", "Johnson", 30)
  displayPersonInfo(person)
}

```





### 1.19. Companion Objects (#1)




Begin with these two interfaces:





```
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

```



Create two classes, `Checkers` and `Chess`, which inherit `BoardGame`. Give them
both **private constructors** with no arguments. Each class should contain a
companion object `Factory: GameFactory` that calls `createBoard()` in its
constructor. Each companion object contains a `const val max` that is used within
`move()`. The definitions of `playGame()` and `main()` are:





```
fun playGame(factory: GameFactory) {
  val s = factory.create()
  while (s.move())
    ;
}

fun main() {
  playGame(Checkers.Factory)
  playGame(Chess.Factory)
}

```



Write the classes `Checkers` and `Chess` so as to obtain the following output:





```
BoardGame.createBoard()
Checkers move 0
Checkers move 1
Checkers move 2
BoardGame.createBoard()
Chess move 0
Chess move 1
Chess move 2
Chess move 3

```






## 2. Concepts objets en Kotlin




Dans cette partie vous écrirez chacune des classes dans un fichier à part entière.





### 2.1. Creation de classe




Écrire une classe `Personne` avec des attributs `nom`, `age`, et `email`, et une méthode `presentation()` qui affiche une présentation courte de la personne (par exemple, `"Bonjour, je suis Albert et j'ai 22 ans"`).




Exemple d’utilisation:





```
val personne = Personne("Turing", "Alan", 112, "alan.turing@cam.ac.uk")
personne.presentation()

```




```
Bonjour, je m'appelle Alan Turing, j'ai 112 ans, et je suis joignable à alan.turing@cam.ac.uk.

```





### 2.2. Héritage




Écrire une classe `Etudiant` qui hérite de la classe `Personne`. Ajoutez les
attributs suivants:



* `netu`, attribut **privé** de type `Int` pour le numéro d’étudiant;
* `diplome`, le diplôme préparé de type `String`.



Réécrire la méthode `presentation` pour *compléter* la présentation de l’étudiant.
Le cas échéant, vous adapterez la classe `Personne` pour permettre
l’implémentation de `Etudiant`.




Exemple d’utilisation:





```
val jimmyPage = Etudiant1("Page", "Jimmy", 79, "Jimmy.Page.etu@univ-lille.fr", 53498, "BUT Guitare")
jimmyPage.presentation()

```




```
Bonjour, je m'appelle Jimmy Page, j'ai 79 ans, et je suis joignable à Jimmy.Page.etu@univ-lille.fr.
Mon numéro d'étudiant est 53498 et je prépare le diplôme de BUT Guitare.

```





### 2.3. Abstraction




Écrire une classe **abstraite** `Universite` d’attributs



* `nom`, le nom de l’université de type `String` (par expl. `Université de Lille`);
* `nom_domaine`, le nom de domaine de type `String` de l’université (par expl.
`univ-lille.fr`).



Écrire ensuite une classe `Composante` qui hérite d’`Universite` avec les attributs
complémentaires suivants:



* `nom`, le nom de la composante (par expl. `IUT de Lille`);
* `batiment`, le bâtiment qui héberge la composante (par expl. `bâtiment A`).



Par ailleurs, l’attribut `nom` de la classe `Universite` héritée devra être
accessible à travers un attribut `universite`.




Exemple d’utilisation:





```
val iut = Composante("Université de Lille", "univ-lille.fr", "IUT de Lille", "A")
println(iut)

```




```
Composante IUT de Lille de Université de Lille, située dans le bâtiment A.

```





### 2.4. Héritage et attributs




Modifier la classe `Etudiant` pour y inclure les attributs suivants:



* `etablissement` de type `Composante`;
* `identifiant`, de type `String`, l’identifiant de connexion sur l’intranet, qui
sera toujours composé du prénom suivi d’un point et du nom (par expl. `Bob.Dylan`)



Enfin, on fera en sorte que l’email soit toujours de la forme `<identifiant>.etu@<nom_domaine>` (par expl. `Bob.Dylan.etu@univ-lille.fr`).




Exemple d’utilisation:





```
val guyDebord = Etudiant("Debord", "Guy", 92, iut, 12345, "BUT Spectacle")
    guyDebord.presentation()

```




```
Bonjour, je m'appelle Guy Debord, j'ai 92 ans, et je suis joignable à Guy.Debord.etu@univ-lille.fr.
Mon numéro d'étudiant est 12345, je prépare le diplôme de BUT Spectacle.

```





### 2.5. Data classe




On aimerait que la liste des diplômes délivrés par une composantes soit une propriété de la composante.
Définir une *data* classe `Diplomes` ayant 3 attributs:



* un `grade` (ie. Licence, Master ou Doctorat) de type `Grade` (ie. une énumération des grades sus-cités)
* un `nom` de type `String` (par expl. « BUT »)
* une `mention` de type `String` (par exemple « Informatique »)



Ajouter ensuite à la classe `Composante` un attribut `diplomes` qui stocke les
diplômes délivrés par la composante, et une méthode `lesDiplomes` qui affiche, pour un grade passé en paramètre, les diplomes délivrés dans cette composante pour ce grade.




Exemple d’utilisation:





```
val diplomes = listOf(Diplome("BUT", "Informatique", Grade.Licence),
                      Diplome("Master", "QUALITÉ, HYGIÈNE, SÉCURITÉ", Grade.Master),
                      Diplome("BUT", "Biologie", Grade.Licence))

val iut = Composante("Université de Lille", "univ-lille.fr", "IUT de Lille", "A", diplomes)
iut.lesDiplomes(Grade.Licence)

```




```
BUT Informatique
BUT Biologie

```





### 2.6. Constructeur




Il convient maintenant de modifier la classe `Etudiant` pour que l’attribut `diplome` soit de type `Diplome` (et non pas `String`).




Le constructeur vérifiera que le diplome (non null) passé en paramètre 
du contructeur soit en effet un diplôme délivré par la composante. 
Sinon, `null` sera affecté à l’attribut `diplome`.




Exemple d’utilisation:





```
val josephSifakis = Etudiant("Sifakis", "Joseph",77, iut, 9999, Diplome("BUT", "Informatique", Grade.Licence))
josephSifakis.presentation()

```




```
Bonjour, je m'appelle Joseph Sifakis, j'ai 77 ans, et je suis joignable à Joseph.Sifakis.etu@univ-lille.fr.
Mon numéro d'étudiant est 9999, je prépare le diplôme de BUT Informatique.

```



alors que…





```
val jimmyPage = Etudiant("Page", "Jimmy",79,iut, 53498, Diplome("BUT", "Guitare", Grade.Licence))
jimmyPage.presentation()

```




```
Bonjour, je m'appelle Jimmy Page, j'ai 79 ans, et je suis joignable à Jimmy.Page.etu@univ-lille.fr.
Mon numéro d'étudiant est 53498, je prépare le diplôme de null.

```






## 3. Test Kotlin




Reprennez les exercices de la deuxième partie du TP4. Terminez-les si ce n’est
pas déjà fait et écrivez des tests JUnit pour chacune de vos fonctions
(recherche linéaire et dichotomiques, et tris par insertion). Pour générer les
tests, vous pouvez cliquer droit sur une classe puis `Generate...` et `Test...`.
Sélectionnez éventuellement les méthodes que vous souhaitez tester et générer le
fichier de test. Dans ce fichier, IntelliJ signalera `Unresolved reference:
junit`. Utilisez le menu contextuel `Show Quick-Fixes` puis `Add 'JUnit5.8.1' to
classpath` et `Ok`.








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
de `product` pour les listes vides ?




####    solution





```
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

```






### 2.2. Tête et queue




Écrire les fonctions de destructuration `head(l)` et `tail(l)` qui permettent,
respectivement, de récupérer le premier élément et la queue de la liste `l`. Pour
les cas problématiques, on déclenchera une exception `IllegalStateException`. En
Kotlin, les exceptions sont déclenchées avec `throw` (voir rapidement cette
[documentation](https://kotlinlang.org/docs/exceptions.html)).





####    solution





```
        /* Destructurations: head et tail */
        fun <A> head(l : Liste<A>) : A = when (l) {
            is Nil -> throw IllegalStateException("head: Nil n'a pas de tête")
            is Cons -> l.head
        }

        fun <A> tail(l : Liste<A>) : Liste<A> = when (l) {
            is Nil -> throw IllegalStateException("tail: Nil n'a pas de queue")
            is Cons -> l.tail
        }

```






### 2.3. Remplacer la tête




Écrire la fonction `setHead(l,x)` qui renvoie liste `l` dont le premier élément est
remplacé par `x`.





####    solution





```
        /* Remplace le premier élément d'une liste par une autre valeur */
        fun <A> setHead(l : Liste<A>, x : A) : Liste<A> = when (l) {
            is Nil -> throw IllegalStateException("setHead: Nil n'a pas de tête")
            is Cons -> Cons(x, tail(l))
        }

```






### 2.4. Supprimer les n premiers éléments




Écrire la fonction `drop(l,n)` qui renvoie la liste `l` amputée de ses `n` premiers
éléments.





####    solution





```
        /* Supprime les n premiers éléments d'une liste. */
        fun <A> drop(l : Liste<A>, n : Int) : Liste<A> = when {
            n<0 -> throw IllegalStateException("drop: n doit être positif ou nul")
            n == 0 -> l
            else ->  when (l) {
                Nil -> throw IllegalStateException("drop: liste trop petite")
                else -> drop(tail(l), n-1)
            }
        }

```






### 2.5. Suppression avec prédicat




Écrire la fonction `dropWhile(l,p)` qui renvoie la liste `l` amputée des premiers
éléments de `l` qui satisfont le prédicat `p` jusqu’au premier élément (exclus) qui
ne satisfait pas `p`.





####    solution





```
        /* Supprime les premiers éléments d'une liste tant qu'ils satisfont une prédicat */
        fun <A> dropWhile(l: Liste<A>, p: (A) -> Boolean) : Liste<A> = when (l) {
            is Nil -> Nil
            is Cons -> if (p(l.head)) dropWhile(l.tail,p) else l
        }

```






### 2.6. Longueur totale de chaînes




En suivant le modèle des fonctions `sum` et `product` écrire une fonction
`lengthOfStrings(l)` qui calcule la somme des longueurs des chaînes de caractères
contenues dans la liste `l`.





####    solution





```
        /* Longueur cumulée des chaînes de caractères contenues dans une liste */
        fun lengthOfStrings(l : Liste<String>) : Int = when (l) {
            is Nil -> 0
            is Cons -> l.head.length + lengthOfStrings(l.tail)
        }

```






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




####    solution





```
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

```







## 3. Récursion terminale




![functional_xkcd.png](Programmation%20fonctionnelle%20avec%20Kotlin_files/functional_xkcd.png)






### 3.1. Calculs terminaux



* Écrire la fonction `sumTerm` version récursive terminale de la fonction `sum`.
Pour ce faire, vous utiliserez une fonction locale auxiliaire pourvue d’un
accumulateur et qui sera effectivement la fonction récursive terminale.
* Même question pour `product` et `lengthOfStrings`




####    solution





```
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

```






### 3.2. Pliage terminal



* La fonction `foldRight` écrite plus haute n’est pas récursive terminale.
Implémentez la fonction `foldLeft` version récursive *terminale* de `foldRight`
comme généralisation des fonctions précédentes.
* Implémentez la fonction `sumTerm2`, fonction identique à `sumTerm` mais
implémentée à l’aide de `foldLeft`.
* Même question pour `productTerm` et `lengthOfStringsTerm`.




####    solution





```
        /* foldLeft */
        tailrec fun <A,B> foldLeft(l : Liste<A>, z : B, f : (B,A) -> B) : B = when (l) {
            is Nil -> z
            is Cons -> foldLeft(l.tail, f(z,l.head), f)
        }

        fun sumTerm2 (l : Liste<Int>) : Int = foldLeft(l, 0, { a, b -> a + b })
        fun productTerm2(l : Liste<Double>) : Double = foldLeft(l, 1.0, { a, b -> a * b })
        fun lengthOfStringsTerm2(l : Liste<String>) : Int = foldLeft(l, 1, { a, b -> a * b.length })

```







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





####    solution





```
    fun <A> head(): A = when (this) {
        is Empty -> throw IllegalStateException("head: Nil n'a pas de tête")
        is Cons -> this.head()
    }

```






### 4.2. Conversion en liste




Pour afficher correctement les stream, le plus simple est de les convertir en listes.
Implémenter la fonction `toList` qui convertie une `Stream` en `Liste`.





####    solution





```
    /* Convertie une stream en liste */
    fun toList(): Liste<A> = when (this) {
        is Empty -> Nil
        is Cons -> ConsL(this.head(), this.tail().toList())
    }

```






### 4.3. Suppression d’éléments



* Implémenter la fonction `take(n)` qui renvoie la stream composée des `n`
premiers éléments de la stream.
* Implémenter la fonction `drop(n)` qui renvoie la stream amputée de ses `n`
premiers éléments.
* Implémenter la fonction `takeWhile(p)` qui renvoie la stream composée des
éléments de la stream initiale jusqu’au premier élément qui ne satisfait pas
le prédicat `p`.




####    solution





```
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

```






### 4.4. Existence




Implémenter la fonction `exists(p)` qui teste l’existence d’un élément dans la
stream qui statisfait le prédicat `p`.





####    solution





```
    /* teste l'existance d'un élément dans la stream qui statisfait le prédicat p */
    fun exists(p: (A) -> Boolean): Boolean = when (this) {
        is Empty -> false
        is Cons -> if (p(this.head())) true else this.tail().exists(p)
    }

```






### 4.5. `foldRight` paresseux



* Implémenter une version paresseuse de `foldRight`.
* Réimplémenter la fonction `exists` (nommée cette fois `exists2`) à l’aide de `foldRight`.
* Réimplémenter la fonction `takeWhile` (nommée cette fois `takeWhile2`) à l’aide de `foldRight`.




####    solution





```
    /* foldRight */
    fun <B> foldRight(z: () -> B, f: (A, () -> B) -> B): B = when (this) {
        is Empty -> z()
        is Cons -> f(this.head()) { this.tail().foldRight(z, f) }
    }

    /* exists avec foldRight */
    fun exists2(p: (A) -> Boolean): Boolean = this.foldRight( { false }, { a, b -> if (p(a)) true else b() } )

    /* takeWhile avec foldRight */
    fun takeWhile2(p: (A) -> Boolean): Stream<A> = this.foldRight( { Empty as Stream<A> } , { a, b -> if (p(a)) cons({ a }, b) else Empty })

```






### 4.6. Filtre et recherche



* Implémenter la fonction `filter(p)` qui renvoie la stream des éléments qui
satisfont le prédicat `p`. Pour ce faire, vous utiliserez `foldRight`.
* À l’aide de `filtre` implémentez la méthode `find(p)` qui trouve le premier
élément de la stream qui satisfait le prédicat `p`.
* Bien que `filtre` extrait tous les éléments de la stream qui satisfont `p`, `find`
se contente d’inspecter uniquement les premiers éléments jusqu’au premier
qui satisfait `p`. Pourtant `find` utilise `filtre`!! Pourquoi ?




####    solution





```
    /* Trouver les éléments d'une Stream qui satisfont un prédicat */
    fun filter(p : (A) -> Boolean) : Stream<A> = this.foldRight( { Empty as Stream<A> }, { a, b -> if (p(a)) cons({ a }, b) else b() } )

    /* Premier élément qui satisfait un prédicat */
    fun find(p : (A) -> Boolean) : A = filter(p).head()

```









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









# Généricité et typage avancé

BUT Informatique - S5 - Qualité de développement



## 1. Préliminaires




Une pile est une structure de données dont les caractéristiques sont les suivantes:



* tous les éléments sont de même type;
* le nombre d’éléments peut être éventuellement limité;
* le seul **élément accessible est celui du sommet** de la pile: on peut le lire,
l’enlever, ou poser un nouvel élément au sommet.



Dans ce TP, nous chercherons à réaliser une pile qui puisse stocker
indifféremment des chaînes de caractères, des entiers, et des nombres
rationnels. Nous utiliserons donc un *type générique*. On donne ci-dessous
l’interface `Pile` qui devra être implémentée par toute classe censée
représenter une pile:





```
public interface Pile<E> {
    int MAX\_ELEMENTS = 100 ;    // nombre maximal d’éléments
    boolean vide() ;            // teste si la pile est vide
    boolean pleine() ;          // teste si la pile est pleine
    boolean peutEmpiler(E x) ;  // teste si la pile peut empiler x
    E sommet() ;                // référence de l’objet au sommet
    E depile() ;                // enlève et retourne l’objet au sommet
    void empile(E x) ;          // place un objet au sommet
    void vider() ;              // vide la pile
    int nbElements() ;          // compte le nombre d’éléments empilés
    void deplacerUnElementVers(Pile<E> p) ;// déplace un élément de la pile courante vers p
    String toString() ;         // affichage de tous les éléments depuis le sommet
}

```





## 2. Une première implantation de l’interface `Pile<E>`





### 2.1. `PileTableau<E>`




Écrivez une classe `PileTableau<E>` qui implémente l’interface `Pile<E>`
au moyen des attributs suivants:





```
private E [] elements ;  // les éléments contenus dans la pile
private int nbElem = 0 ; // le nombre d’éléments dans la pile
private String nom ;     // nom de la pile : information supplémentaire propre à PileTableau

```



N’oubliez pas que pour compiler `PileTableau.java`, vous devrez avoir écrit
**toutes les méthodes** de l’interface `Pile`: pour pouvoir les tester une par
une, le plus simple est donc d’écrire dans un premier temps des méthodes « vides
» (qui ne font rien et lève l’exception `UnsupportedOperationException`), puis de compléter
chaque méthode successivement. **Veillez impérativement à éliminer tous les
avertissements de compilation.**




> 
> 
> **Remarque sur les tableaux de types génériques:** Attention ! Comme vu en
> cours, en java on ne peut instancier un type générique, c’est-à-dire il
> est interdit d’écrire : `elements = new E[MAX_ELEMENTS]`! En pratique, il
> vaut mieux utiliser une classe générique telle que `ArrayList` mais ici
> on instanciera un tableau d’`Object` transtypé comme suit : `elements`
> (E[]) new Object[MAXELEMENTS]=. Cette méthode génère un avertissement à
> la compilation que l’on pourra désactiver à l’aide de l’annotation
> `@SuppressWarnings("unchecked")`. **Il s’agit du seul avertissement que
> vous êtes autorisés à éliminer avec cette annotation**.
> 
> 
> 
> 




####    solution





```
public class PileTableau<E> implements Pile<E> {
    protected E [] elements ;  // les éléments contenus dans la pile
    protected int nbElem = 0 ; // le nombre d’éléments dans la pile
    protected String nom ;     // nom de la pile : information supplémentaire propre à PileTableau

    /** Constructeur qui crée une pile vide et lui donne un nom */
    @SuppressWarnings("unchecked")
    public PileTableau() {
        elements = (E[]) new Object[MAX\_ELEMENTS] ;
        this.nom = "la pile";
    }

    /** Constructeur qui crée une pile vide et lui donne un nom */
    @SuppressWarnings("unchecked")
    public PileTableau(String nom) {
        elements = (E[]) new Object[MAX\_ELEMENTS] ;
        this.nom = nom ;
    }

    /* IMPLEMENTATION DE L'INTERFACE PILE */

    /** teste si la pile est vide */
    public boolean vide() {
        return (nbElem == 0) ;
    }

    /** teste si la pile est pleine */
    public boolean pleine () {
        return (nbElem == MAX\_ELEMENTS) ;
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

```






### 2.2. Tests




Testez la classe `PileTableau`, en créant des instances dans lesquelles vous
placerez respectivement des entiers et des chaînes de caractères.






### 2.3. Affichage du nom




On veut maintenant que la méthode `deplacerUnElementVers` affiche le nom de la
pile de départ et le nom de la pile d’arrivée. Quels problèmes se posent ?
Comment procéder ?





####    solution




Le problème est que l’attribut `nom` est privé et qu’aucune méthode de l’interface `Pile` ne permet d’y accéder. Il faut donc créer une méthode d’instance `nom()`:





```
    public String nom() { return nom ; }

```



et transtyper le paramètre `p` de `deplacerUnElementVers` avec `PileTableau`
(après avoir vérifier que `p` est bien une instance de cette classe) pour
pouvoir faire appel à la méthode `nom` (voir code de `PileTableau` ci-dessus).





```
    public void deplacerUnElementVers(Pile<E> p) {
        if (!vide() && p.peutEmpiler(sommet())) {
            p.empile(this.depile()) ;
            if (p instanceof PileTableau)
                System.out.println("Déplacement de " + nom + " vers "
                        + ((PileTableau<E>) p).nom());
        }
    }

```






### 2.4. Rationnels




On veut représenter par des objets les nombres rationnels, c’est-à-dire les
nombres pouvant s’écrire sous la forme pq où p est un entier
relatif et q un entier naturel non nul (i.e. strictement positif).



1. Implantez la classe `Rationnel` des nombres rationnels et sa méthode
`toString()`.
2. 
Modifiez ensuite la classe `Rationnel` pour qu’elle implémente l’interface `Comparable` (du package `java.lang`). L’interface `Comparable<T>`
 est utilisée lorsque l’on souhaite pouvoir comparer des instances d’une
 même classe (consultez la documentation de l’API pour voir ce qu’il en 
est des classes `Integer` et `String` par exemple).





```
public interface Comparable<T> {
   public int compareTo(T o) ;
}

```



La méthode `compareTo` retourne :



	* une valeur strictement négative si l’instance courante est « plus petite » que l’objet `o`;
	* 0 si elle est « égale » ;
	* une valeur strictement positive si l’instance courante est « plus grande » que l’objet `o`.
Par exemple: `(Integer.valueOf(5)).compareTo(Integer.valueOf(3))` renvoie 1.







####    solution




La classe `Rationnel` doit implémenter l’instance de l’interface `Comparable<Rationnel>`:





```
public class Rationnel implements Comparable<Rationnel> {
    private final int  p;
    private final int  q;

    public Rationnel(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int get\_p(){
        return p;
    }

    public int get\_q(){
        return q;
    }

    @Override
    public int compareTo(Rationnel o) {
        return Integer.compare(p * o.get\_q(), q * o.get\_p());
    }

    public String toString(){
        return p + "/" + q;
    }
}

```






### 2.5. Pile de `Comparable`




Peut-on créer une instance de `PileTableau` qui permette de stocker n’importe
quels objets qui implémentent l’interface `Comparable<T>` ? Testez votre
solution avec une pile dans laquelle vous placerez à la fois des entiers, des
chaînes de caractères et des rationnels.





####    solution




Oui, on peut créer une pile de `Comparable<T>` avec une variable de type `Pile<Comparable<?>>`:





```
        Pile<Integer> p1 = new PileTableau<>("[p1] Pile d'entiers");
        System.out.println("Entrez 3 entiers :");
        for (int i=1; i<=3; i++)
            p1.empile((int)(Math.random()*10)) ;
        System.out.println(p1);
        Pile<String> p2 = new PileTableau<>("[p2] Pile de chaînes");
        for (String s : Arrays.asList("un", "deux", "trois"))
            p2.empile(s);
        System.out.println(p2);
        Pile<Rationnel> p3 = new PileTableau<>("[p3] Pile de rationnels");
        for (int i=1; i<=3; i++)
            p3.empile(new Rationnel((int)(Math.random()*10), (int)(Math.random()*10))) ;
        System.out.println(p3);

        /* test de pile de comparables */
        Pile<Comparable<?>> p4 = new PileTableau<>("[p4] Pile d'objets comparables") ;
        for (Pile<? extends Comparable<?>> p : Arrays.asList(p1,p2,p3))
            while (!p.vide())
                p4.empile(p.depile());
        System.out.println(p4);
        System.out.println();

```






### 2.6. Copie depuis une autre pile



* Écrire et tester une méthode d’instance `copieDepuis` qui copie sur la pile
courante le sommet de la pile passée en paramètre. Il faudra bien sûr
ajouter la signature de cette méthode à l’interface `Pile<E>`.
* Modifier cette méthode pour que la pile passée en paramètre ne soit pas
nécessairement du même type que la pile courante. Tester votre solution pour
copier le sommet d’une pile d’`Integer` sur une pile de `Number`.




####    solution




Le type du paramètre de la méthode doit être un sous-type de `E`:





```
    public void copieDepuis(Pile<? extends E> p){
        this.empile(p.sommet());
    }

```



Il faut aussi ajouter la signature de cette méthode à l’interface `Pile<E>`:





```
        public void copieDepuis(Pile<? extends E> p);

```






### 2.7. Copie vers une autre pile




Même question, mais cette fois pour copier sur la pile passée en paramètre, le
sommet de la pile courante.





####    solution




Le type du paramètre de la méthode doit cette fois être un sur-type de `E`:





```
    public void copieVers(Pile<? super E> p){
        p.empile(this.sommet());
    }

```



Il faut aussi ajouter la signature de cette méthode à l’interface `Pile<E>`:





```
        public void copieVers(Pile<? super E> p);

```







## 3. Quelques méthodes statiques




Pour la déclaration de méthodes statiques, on ne peut pas faire directement
référence au paramètre de types de la classe générique. En effet, ça ne ferait
pas de sens d’y faire référence car le paramètre de type n’est concrétisé qu’à
l’instantiation de la classe alors que les méthodes statiques sont indépendantes
des instances.





### 3.1. Permuter le sommet




Écrire une méthode statique `swap` qui prend en paramètre une `Pile`
et permute les deux éléments en son sommet.





####    solution




Il faut implémenter une méthode générique:





```
    public static <E> void swap(Pile<E> p){
        E tmp1, tmp2;
        tmp1 = p.depile();
        tmp2 = p.depile();
        p.empile(tmp1);
        p.empile(tmp2);
    }

```






### 3.2. Empiler sur une pile




Écrire une méthode statique `empileSur` qui prend en paramètre une valeur `v`
d’un certain type et une pile `p` dont les éléments ont le même type que `v`, et
qui empile la valeur `v` sur `p`. Votre méthode n’accepte-t-elle vraiment que des
valeurs du même type que ceux de `p` ? Pourquoi ?





####    solution





```
    public static <E> void empileSur(E v, Pile<E> p){
        p.empile(v);
    }

```



On peut en fait passer à cette méthode une valeur `v` de n’importe quel
sous-type de `E`. Ainsi, si la pile courante est une pile de `Comparable<?>`, la
variable de type `E` est `Comparable<?>` et `v` peut-être un `Integer` car c’est un
sous-type de `Comparable<?>`. On peut donc écrire:





```
PileTableau.empileSur(0,p4);

```



où `p4` est de type `Pile<Comparable<?>>`.







### 3.3. Copier depuis une pile vers une autre pile




Écrire une méthode `copieDeVers` avec deux paramètres de pile `src` et `dest`
qui copie le sommet de la pile `src` vers la pile `dest`. Faites en sorte que
votre méthode soit la plus générique possible. Trouver trois déclarations de types différentes pour cette méthode!





####    solution





```
    public static <E> void copieDeVers(Pile<? extends E> src, Pile<E> dest){
        dest.empile(src.sommet());
    }

```



Dans ce cas, si `p1` est un pile de `Integer` et `p2` une pile de `Number`, et qu’on réalise l’appel





```
copieDeVers(p1,p2);

```



alors la variable de type `E` est instanciée avec `Number` et le jocker `?` est
instancié avec `Integer`.
On peut aussi écrire:





```
public static <E> void copieDeVers(Pile<E> src, Pile<? super E> dest){
        dest.empile(src.sommet());
    }

```



et dans ce cas, `E` est instancié avec `Integer` et `?` avec `Number`. On peut aussi
combiner les deux paramétrages.





```
public static <E> void copieDeVers(Pile<? extends E> src, Pile<? super E> dest){
        dest.empile(src.sommet());
    }

```






### 3.4. Empiler toute une pile sur une autre




Écrire une méthode `empileToutDeVers` avec deux paramètres de pile `src` et `dest` qui
empile tous les éléments de la pile `src` vers la pile `dest` **de façon récursive**.
Faites en sorte que votre méthode soit la plus générique possible.





####    solution





```
    public static <E> void empileToutSur(Pile<? extends E> p1, Pile<E> p2){
        if (!p1.vide()) {
            empileSur(p1.depile(),p2);
            empileToutSur(p1,p2);
        }
    }

```







## 4. Pile d’Entiers





### 4.1. `PileTableauEntier`




Adapter la classe `PileTableau` (c’est-à-dire en la recopiant dans un nouveau
fichier), pour implémenter une classe `PileTableauEntier` qui implémente `Pile<Integer>`
et qui soit donc spécialisée pour les piles d’entiers.





#### Solution   solution




Attention, la solution est une classe **non générique**. L’erreur courante est de déclarer `PileTableauEntier` ainsi:





```
public class PileTableauEntier<Integer> implements Pile<Integer> {...

```



qui déclare une classe générique dont le paramètre de type est `Integer` qui
porte le même nom que la classe `Integer` de l’API java! Dans le corps de
cette classe, `Integer` fera référence à une variable de type et non à la classe
`Integer`! La solution consiste simplement à essentiellement remplacer toutes
les occurrences de `E` du corps de la classe `PileTableau<E>` par `Integer`:





```
public class PileTableauEntier implements Pile<Integer> {
    private final Integer [] elements ;  // les éléments contenus dans la pile
    private int nbElem = 0 ; // le nombre d’éléments dans la pile
    private final String nom ;     // nom de la pile : information supplémentaire propre à PileTableau

    /** Constructeur qui crée une pile vide et lui donne un nom */
    public PileTableauEntier(String nom) {
        elements = new Integer[MAX\_ELEMENTS] ;
        this.nom = nom ;
    }

    /* IMPLEMENTATION DE L'INTERFACE PILE */

    /** teste si la pile est vide */
    public boolean vide() {
        return (nbElem == 0) ;
    }

    /** teste si la pile est pleine */
    public boolean pleine () {
        return (nbElem == MAX\_ELEMENTS) ;
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

```






### 4.2. Tests



* Peut-on instancier une variable de type `Pile<Number>` avec une instance de
`PileTableauEntier` ? Tester et expliquer pourquoi cela fonctionne ou non.
* Peut-on instancier une variable de type `Pile<Integer>` avec une instance de
`PileTableauEntier` ? Tester et expliquer pourquoi cela fonctionne ou non.




####    solution



* 
On ne peut pas écrire:





```
Pile<Number> p = new PileTableauEntier("Pile de Number");

```



En effet, pour pouvoir réaliser cette affectation, il faudrait que `PileTableauEntier` soit un sous type de `Pile<Number>` ce qui n’est pas le cas, car `Pile<Number>` est un type générique et que, en java, les types génériques ne sont pas co-variants.



* 
On peut par contre écrire:





```
Pile<Integer> p = new PileTableauEntier("Pile de Number");

```



car `PileTableauEntier` implémente l’interface `Pile<Integer>` qui induit la
relation de sous-typage entre `PileTableauEntier` et `Pile<Integer>`.










## 5. Les tours de Hanoï




Vous aller implémenter les tour de Hanoï à l’aide de votre classe `PileTableau`. On considère
l’interface `Disque`:





```
/** Un Disque est un objet ayant un diamètre */
public interface Disque 
{
    /** Méthode donnant le diamètre du disque */
    int diametre() ;    
}

```




### 5.1. `DisqueHanoi`




Écrire la classe `DisqueHanoi` qui implémente les interfaces `Disque` et `Comparable<Disque>`.





#### Solution   solution





```
public class DisqueHanoi implements Disque, Comparable<Disque> {
    // le diamètre du disque
    private int diametre = 1 ;

    /** On construit une instance de DisqueHanoi en spécifiant son diamètre
 * @param d entier positif donnant le diamètre du disque */
    public DisqueHanoi(int d) { 
    diametre = d ;
    }

    /** Affichage élémentaire d'un disque
 * @return une chaîne donnant la valeur du diamètre */
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

```






### 5.2. `PileHanoi`




Écrivez la classe `PileHanoi` qui est une pile de disques de Hanoï qui respecte les règles suivantes:



* l’empilement ne peut avoir lieu que si le disque à empiler est plus petit que celui du sommet;
* le déplacement d’un disque vers une autre pile ne peut donc se faire qu’aux mêmes conditions;
* l’affichage de la pile commence par la base, et on se contente d’afficher le diamètre des disques.



La méthode `toString` affichera le nom de la pile et la liste des diamètres des
disques empilés de la base au sommet. Ainsi, une pile « A » ayant un disque de
diamètre 1 empilé sur un disque de diamètre 2 lui-même empilé sur un disque de
diamètre 3 sera affiché comme ceci:




```
A: 3 2 1

```



#### Solution   solution




Il faut hériter de `PileTableau` en réinstanciant le tableau `elements` dans le
constructeur pour s’assurer que les éléments de ce tableau sont bien de type
`DisqueHanoi`. Dans le cas contraire, ils seront de type `Object` et des erreurs
de transtypage seront produites à l’exécution. Il faut aussi réécrire la méthode
`peutEmpiler` pour garantir les contraintes d’empilement de disques.





```
public class PileHanoi extends PileTableau<DisqueHanoi> {
    public PileHanoi(){
        this.elements = new DisqueHanoi[MAX\_ELEMENTS];
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

```






### 5.3. Jeu




Récupérez également `Hanoi.java` pour tester votre classe `PileHanoi`. Ce
programme initialise les trois piles nécessaires et les affiche, puis attend des
ordres de déplacement d’une pile à l’autre en affichant le résultat à chaque
fois.




Exemple d’exécution:




```
A : 4 3 2 1
B:
C:
Déplacement de : A
Vers : B
Je déplace un disque de A vers B
A : 4 3 2
B: 1
C:
Déplacement de : A
Vers : B
Impossible !
A : 4 3 2
B: 1
C:
Déplacement de : STOP
OK ! Terminé...

```




### 5.4. Résolution automatique




Écrivez dans `PileHanoi` une méthode récursive





```
void deplacerDesDisques(int n, PileHanoi dest, PileHanoi interm)

```



qui déplace `n` disques (un par un), de la pile courante vers la pile `dest` en passant si besoin par la pile `interm`. Puis testez cette méthode!





#### Solution   solution





```
public void deplacerDesDisques(int n, PileHanoi dest, PileHanoi interm)
{
    if (n>1)
        {
            deplacerDesDisques(n-1, interm, dest) ;
            deplacerDesDisques(1, dest, interm) ;
            interm.deplacerDesDisques(n-1, dest, this) ;
        }
    else
        deplacerUnElementVers(dest) ;
}

```









# Lambda expressions et streams

BUT Informatique - S5 - Qualité de développement



Commencer par récupérer le cours sur Moodle et le relire intégralement!




## 1. Lambda expressions et interfaces fonctionnelles




On considère la classe incomplète suivante:





```
  public class Lambda {
      // Déclaration de la méthode calcul

      public static void main(String[] args){
          System.out.println("Il y a " + calcul(args,x->x.equals("coucou")) + " fois la chaîne \"coucou\" en argument");
          System.out.println("Il y a " + calcul(args,x->x.equals("cuicui")) + " fois la chaîne \"cuicui\" en argument");
      }
  }

```



Ce programme doit afficher le nombre de fois que les chaînes `coucou` et `cuicui` sont
passées en argument.



1. Définissez votre propre interface fonctionnelle et la méthode `calcul` qui
complètent ce programme.
2. En alternative à votre propre interface, quelle interface de
`java.util.function` pourriez-vous utilisez ? Essayez.
3. Complétez, en une ligne, votre programme pour qu’il affiche en plus le nombre
d’arguments commençant par un tiret `-`.




### 1.1. Solution   solution





```
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

```






## 2. Manipulation de base des streams



1. Créez une stream de chaînes de caractères et affichez en les éléments.
2. Comment n’afficher que les chaînes non vides ?
3. Comment trouver (et afficher) la première chaîne de longueur 5 ?
4. Écrire une lambda expression qui transforme une chaîne « `chaine` » en
« `C...e` », i.e. qui ne garde que les premier et dernier caractères, en
mettant le premier en majuscule et en remplaçant les caractères
intermédiaires par la chaîne `...`. Écrire ensuite un programme qui
utilise cette lambda expression pour l’appliquer à chaque mot d’une stream
de chaîne de caractères et l’afficher. On fera en sorte que les mots de
moins de 2 caractères soient ignorés.
5. Transformer une stream de chaînes de caractères en la triant suivant la
longueur de ses chaînes.
6. Même question mais en triant suivant l’ordre lexicographique.
7. Lisez la documentation de la classe `Files` et trouvez un moyen de
récupérer dans une stream la suite des lignes d’un fichier texte.
8. Afficher les 15 premières lignes de ce fichier à partir de la stream.
9. Afficher la plus longue ligne.
10. Afficher combien de lignes contiennent le chaîne « begin ».




### 2.1. solutions   solution





```
  Stream<String> s = Stream.of("toto", "", "titi", "cuicc")
  /* 1: afficher les éléments */
  s.forEach(System.out::println);
  /* 2: afficher les chaîne non vides */
  s.filter(x -> x.length() != 0).forEach(System.out::println);
  /* ou bien... */
  s.filter(x -> !x.isEmpty()).forEach(System.out::println);
  /* 3: première chaine de longueur 5 */
  s.filter(x->x.length()==5).findFirst().orElse("")
  /* 4: transformation de "chaine" en "C...e" */
  s.filter(x->x.length()>1)
   .map(x->{ return (Character.toUpperCase(x.charAt(0))+"..."+x.charAt(x.length()-1)); })
   .forEach(System.out::println)
  /* 5: tri de chaine suivant leurs longueurs */
  s.sorted((x,y)->(y.length()-x.length()))
   .forEach(System.out::println)
  /* 6: tri de chaine suivant l'ordre lexicographique */
  s.sorted((x,y)->x.compareTo(y)).forEach(System.out::println)
  /* ou bien... */
  s.sorted(String::compareTo).forEach(System.out::println)
  /* 7: récupérer les lignes d'un fichier */
  Stream<String> s = Files.lines(FileSystems.getDefault().getPath("./fichier.txt");
  /* 8: Afficher les 15 premières lignes */
  s.limit(15).forEach(System.out::println);
  /* 9: Afficher la plus longue ligne */
  s.max((x,y) -> (x.length()-y.length())).orElse("")
  /* 10: Nombre lignes contenant la chaine "begin" */
  s.filter(x->x.indexOf("begin")!=-1).count()

```






## 3. Des listes et tableaux aux streams



1. 
Le programme suivant remplit un tableau avec les 50 premiers carrés parfaits
à l’aide d’une itération. Réécrivez ce code pour remplir le même tableau avec
des carrés parfaits mais en utilisant une stream au lieu d’une itération.





```
     int[] carres = new int[50];
     for (int i = 0; i < carre.length; i++) {
         carres[i] = i * i;
     }

```


2. 
On considère les classes suivantes:





```
public abstract class Bloc {
    protected double masse\_volumique;
    public Bloc(double mv) {
        masse\_volumique = mv;
    }
    public double masse() {
        return masse\_volumique * volume();
    }
    public abstract double volume(); // signature seule
}

```




```
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

```




```
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

```




```
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

```



Réécrire le code de la classe `Main` pour que la moyenne du volume des blocs
soient calculée à l’aide de `Stream` de la façon la plus concise possible.







### 3.1. Solution   solution





```
    /* 1: remplissage de tableau avec liste de carrés */
    int[] carres = IntStream.range(0, 50).map(i -> i * i).toArray();
    /* 2: Volume moyen de blocs */
    double average = desBlocs.stream().mapToDouble(b -> b.volume()).average().orElse(0);

```






## 4. Suites



1. Écrire un programme qui, pour un entier n passé en paramètre, affiche les
n premiers carrés parfaits qui sont des palindromes (tels que 4 et 121).
Faites en sorte que votre programme fonctionne pour n’importe quel n!
2. Écrire un programme qui produit une stream infinie qui contient les
factorielles 1!,2!,3!, etc. et qui affiche les n premiers (n étant un
paramètre de votre programme). *Indication:* On produira dans un premier
temps la stream [1,1!],[2,2!], etc.




### 4.1. Solution palindromes   solution





```
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

```





### 4.2. Solution factorielles   solution





```
import java.util.stream.*;
import java.util.function.*;
import java.math.BigInteger;

public class Factoriels {
    public static void main(String[] args){
        // Version avec des int qui déborde rapidement...
        // Stream.iterate(new int[] {1,1},x -> new int[] {x[0]+1,x[1]*(x[0]+1)})
        // .limit(Integer.parseInt(args[0]))
        // .map(x->x[1])
        // .forEach(System.out::println);
        BigInteger un = BigInteger.valueOf(1);
        Stream.iterate(new BigInteger[] {BigInteger.valueOf(1),BigInteger.valueOf(1)},
                       x -> new BigInteger[] {x[0].add(un),x[1].multiply(x[0].add(un))})
            .limit(Integer.parseInt(args[0]))
            .map(x->x[1])
            .forEach(System.out::println);
    }
}

```






## 5. Terminaisons



1. Étant donnée une stream de chaînes de caractères, afficher, sous forme
d’une chaîne de caractères, ses `n` premiers éléments séparés par des
virgules. Vous proposerez deux solutions:
	* d’abord avec la méthode `collect`,
	* puis avec la méthode `reduce` (attention: la chaîne obtenue ne doit ni
	commencer ni terminer par une virgule!).
2. Étant donnée une stream de chaînes de caractères, afficher la liste des mots
commençant par la lettre `'a'` . Indication: voir la méthode
`Collectors.groupingBy` de l’API java.
3. Étant donnée une stream de chaînes de caractères, afficher combien de mots
de chaque longueur celle-ci comporte.




### 5.1. Solution   solution





```
  /* 1: Stream to String */
  Stream.of("atoto","ci", "coco", "aaaa")
        .collect(Collectors.joining(","))
  Stream.of("toto","titi","pouet","coco")
        .reduce("",(x,y)->x+((x!="")?",":"")+y)
  /* 2: liste des mots d'une Stream commençant par 'a' */
  Stream.of("atoto","ci", "coco", "aaaa")
        .collect(Collectors.groupingBy(x->x.charAt(0))) // hypothèse: la stream ne comporte pas de chaine vide
        .get('a')
  /* 3: nombre de mots d'une stream de chaque longueur */
  Stream.of("toto","ci","", "coco", "aaaa")
        .collect(Collectors.groupingBy(x->x.length(),Collectors.counting()))
        .toString()

```







