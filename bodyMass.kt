fun main() {
    print("Enter your weight in kilograms: ")
    val weight = readLine()!!.toDouble()

    print("Enter your height in meters: ")
    val height = readLine()!!.toDouble()

    val bmi = weight / (height * height) // calculate BMI

    println("Your BMI is: $bmi")

    if (bmi < 18.5) {
        println("You are underweight")
    } else if (bmi < 25) {
        println("You have optimal weight")
    } else {
        println("You are overweight")
    }
}
