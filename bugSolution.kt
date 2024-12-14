fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }.toMutableList() //Creates a new list
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }.toMutableSet() //Creates a new set
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 3, 5]
    
    //Alternative for Sets (using toSet instead of toMutableSet if you don't need mutability)
    val set3 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet2 = set3.filter { it % 2 != 0 }.toSet() 
    println(set3) // Output: [1, 2, 3, 4, 5]
    println(newSet2) // Output: [1, 3, 5]
} 