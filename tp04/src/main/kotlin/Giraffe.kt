import java.io.IO.println

class Giraffe {
    var id = 0

    fun displayID() {
        return println("ID: $id")
    }
}

fun main() {
    val giraffe1 = Giraffe()
    val giraffe2 = Giraffe()
    val giraffe3 = Giraffe()
    giraffe1.displayID()
    giraffe2.displayID()
    giraffe3.displayID()
}
