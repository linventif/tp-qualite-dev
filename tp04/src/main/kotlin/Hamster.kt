import java.io.IO.println

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

  val empty: Boolean
      get() = hamsters.size == 0

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
    println(cage.empty)
  cage.put(Hamster("Alice"))
  // cage.empty eq false
    println(cage.empty)
}