
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






