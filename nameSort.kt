fun main() {
    // Get user input
    print("Enter the first name: ")
    val name1 = readLine()
    print("Enter the second name: ")
    val name2 = readLine()
    print("Enter the third name: ")
    val name3 = readLine()

    // Sort the names
    val sortedNames = listOf(name1, name2, name3).sorted()

    // Display the sorted names using a for loop
    println("The names in ascending order are:")
    for (name in sortedNames) {
        println(name)
    }
}
