
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





