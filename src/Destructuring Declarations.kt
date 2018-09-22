

// You can destructure an object into a number of variables using destructing declaration. For example:

data class usr(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {
    val u1 = usr("John", 29, "Male")

    val (name, age, gender) = u1
    println("name = $name")
    println("age = $age")
    println("gender = $gender")
}

