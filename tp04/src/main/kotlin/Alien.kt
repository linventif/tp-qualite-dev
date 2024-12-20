import java.io.IO.println

internal class Alien(private val name: String, private val species: String, private var planet: String) {
    fun movePlanet(newPlanet: String) {
        this.planet = newPlanet
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
    val alien1 = Alien("Arthricia", "Cat Person", "PurgePlanet")
    val alien2 = Alien("Dale", "Giant", "Gearworld")

    println(alien1)
    println(alien2)

    alien1.movePlanet("Earth C-137")
    alien2.movePlanet("Parblesnops")

    println(alien1)
    println(alien2)
}