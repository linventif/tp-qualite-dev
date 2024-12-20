import java.io.IO.println

class Robot(private var areaSize: Int = 100, private var posX: Int = 0, private var posY: Int = 0) {

    fun right(steps: Int) {
        posX += steps
        posX %= areaSize
    }

    fun left(steps: Int) {
        posX -= steps
        posX %= areaSize
    }

    fun down(steps: Int) {
        posY -= steps
        posY %= areaSize
    }

    fun up(steps: Int) {
        posY += steps
        posY %= areaSize
    }

    private fun getLocation(): String {
        return "($posX, $posY)"
    }

    override fun toString(): String {
        return "Robot at ${getLocation()}"
    }
}

fun main() {
    val robot = Robot()
    println(robot)
    robot.right(10)
    println(robot)
    robot.down(5)
    println(robot)
    robot.left(3)
    println(robot)
    robot.up(2)
    println(robot)
}
