fun celsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}
fun main() {
    println("Fahrenheit\tCelsius")
    for (i in 0..20) {
        val fahrenheit = i.toDouble()
        val celsius = celsius(fahrenheit)
        println("$fahrenheit\t\t$celsius")
    }
}
