import java.io.IO.println

class X {
    private val a: Int = 3
    private val b: Int = 42
    private var c: Int = 0

    fun add(): Int {
        c = a + b
        return c
    }
}

fun main() {
    val x = X()
    println(x.add())
}
