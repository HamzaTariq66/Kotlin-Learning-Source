

/*


    Hashcode Definition : A hash code is a numeric value that is used to identify an object during equality
                          testing.

    hashCode() and equals()
    The hasCode() method returns hash code for the object. If two objects are equal, hashCode() produces the same
    integer result.

    The equals() returns true if two objects are equal (has same hashCode()). If objects are not equal, equals()
    returns false.

 */

data class _User1(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("John", 29)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "Amanda")

    println("u1 hashcode = ${u1.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")

    if (u1.equals(u2) == true)
        println("u1 is equal to u2.")
    else
        println("u1 is not equal to u2.")

    if (u1.equals(u3) == true)
        println("u1 is equal to u3.")
    else
        println("u1 is not equal to u3.")
}