fun main() {
    print("Enter a number between 1 and 10: ")
    val input = readLine()!!.toInt()

    var romanNumeral = ""

    when (input) {
        1 -> romanNumeral = "I"
        2 -> romanNumeral = "II"
        3 -> romanNumeral = "III"
        4 -> romanNumeral = "IV"
        5 -> romanNumeral = "V"
        6 -> romanNumeral = "VI"
        7 -> romanNumeral = "VII"
        8 -> romanNumeral = "VIII"
        9 -> romanNumeral = "IX"
        10 -> romanNumeral = "X"
    }

    if (romanNumeral != "") {
        println("Roman numeral version: $romanNumeral")
    } else {
        println("Error: number must be between 1 and 10")
    }
}
