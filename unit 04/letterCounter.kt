fun main() {
    print("Enter a string: ")
    val str = readLine()!!

    print("Enter a character: ")
    val ch = readLine()!![0]  

    val count = str.count { it == ch }
    println("The character '$ch' appears $count times in the string.")
}
