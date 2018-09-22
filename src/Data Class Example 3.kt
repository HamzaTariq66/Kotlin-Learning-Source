

/*
    toString() method:
    The toString() function returns a string representation of the object.
 */

data class User1(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("John", 29)
    println(u1.toString())
}