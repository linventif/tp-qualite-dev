package fr.but3

fun main() {
    // 1.1. var & val (1)
    val answer = 42
    println(answer)
    // answer = 43 // Error: Val cannot be reassigned
    var answerVar = 42
    answerVar = 43
    println(answerVar)

    // 1.2. var & val (2)
    var a = 10
    val b = a
    a = 42
    println(a)
    println(b)

    // 1.3. var & val (3)
    var x = 1
    var y = 2
    val temp = x
    x = y
    y = temp
    println(x) // 2
    println(y) // 1

    // 1.4. Data types (1)
    var answerInt: Int = 42
    // answerInt = "unknown" // Error: Type mismatch
    var answerAny = 42
    // answerAny = "unknown" // Error: Type mismatch

    // 1.5. Data types (2)
    val int: Int = 10
    val double: Double = 1.1
    val boolean: Boolean = false
    val string: String = "abc"
    val character: Char = 'a'

    // Can be combined:
    val result1: String = string + int
    val result2: String = string + double
    val result3: String = string + boolean
    val result4: String = string + character

    println("The type that can be combined " + "with every other type using '+':")
    println("String")

    // Can't be combined:
    // val result5: Int = int + boolean // Error: Operator '+' cannot be applied to 'Int' and 'Boolean'
    // val result6: Double = double + boolean // Error: Operator '+' cannot be applied to 'Double' and 'Boolean'
    // val result7: Char = character + boolean // Error: Operator '+' cannot be applied to 'Char' and 'Boolean'

    // 1.6. Data types (3)
    val c1 = 'a' + 1
    val c2 = 'a' + 25
    val c3 = 'E' - 2
    println(c1) // 'b'
    println(c2) // 'z'
    println(c3) // 'C'

    // 1.7. Data types (IntelliJ 1)
    val whole = 11
    val fractional = 1.4
    val trueOrFalse = true
    val words = "A value"
    val character2 = 'z'
    val lines = """Triple quotes let
you have many lines
in your string"""
    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(character2)
    println(lines)

    // 1.8. Data types (IntelliJ 2)
    val s = "Sally" + 5.9
    println(s)

    // 1.9. Functions (1)
    fun squareInt(n: Int): Int {
        return n * n
    }
    println(squareInt(4)) // 16

    // 1.10. Functions (2)
    fun sumDoubles(a: Double, b: Double, c: Double): Double {
        return a + b + c
    }
    println(sumDoubles(1.1, 2.2, 3.3)) // 6.6


    // 1.11. Functions (3)
    fun duplicate(s: String): String {
        return s + s
    }
    println(duplicate("Hello")) // HelloHello

    // 1.12. Functions (IntelliJ)
    fun foo(): String {
        return "abc"
    }
    println(foo())

    // 1.13. If (1)
    fun checkSign(n: Int): String = when {
        n > 0 -> "positive"
        n < 0 -> "negative"
        else -> "zero"
    }
    println(checkSign(10)) // positive
    println(checkSign(-5)) // negative
    println(checkSign(0)) // zero

    // 1.14. If (2)
    fun abs(n: Int): Int = if (n < 0) -n else n
    println(abs(3)) // 3
    println(abs(-5)) // 5

    // 1.15. If (3)
    fun findMax(a: Int, b: Int): Int = if (a > b) a else b
    println(findMax(3, 5)) // 5

    // 1.16. If (IntelliJ)
    fun oneOrTheOther(exp: Boolean) =
        if (exp) "True!" else "False"
    println(oneOrTheOther(x == 1))  // True!

    // 1.17. String template (1)
    x = 3
    y = 5
    val max = findMax(x, y)
    println("The maximum of $x and $y is $max.") // The maximum of 3 and 5 is 5.

    // 1.18. String template (2)
    fun record(index: Int, status: String, message: String): String {
        return "$index [$status] $message\n"
    }
    println(record(1, "OK", "All systems go"))

    // 1.19. String template (3)
    fun show(i: Int, s: String, c: Char, d: Double) {
        println("i: $i")
        println("s: \"$s\"")
        println("c: '$c'")
        println("d: $d")
    }
    show(10, "abc", 'a', 1.0)

    // 1.20. While (1)
    fun displayContent(s: String) {
        var i = 0
        while (i < s.length) {
            println(s[i])
            i++
        }
    }
    displayContent("abc")
}