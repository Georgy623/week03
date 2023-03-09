fun main() {
    print("Enter the mass of the object (in kg): ")
    val mass = readLine()!!.toDouble()

    val weight = mass * 9.81 // 9.81 m/s^2 is the acceleration due to gravity on Earth

    when {
        weight > 1000 -> println("The object is too heavy.")
        weight < 10 -> println("The object is too light.")
        else -> println("The weight of the object is $weight N.")
    }
}
