

//Using nullable values and checking for null

/* A reference must be explicitly marked as nullable when null value is possible.
Return null if str does not hold an integer:

*/

fun parseInt(str : String): Int? {
    return str.toIntOrNull()
}

fun printproduct(args1: String , args2: String) {

    val x = parseInt(args1)
    val y = parseInt(args2)

// Using `x * y` yields error because they may hold nulls.

    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x*y)
    }
    else{
        println("either '$args1' or '$args2' is not a number")
    }
}

fun main(args: Array<String>){
    printproduct("6", "8")
    printproduct("a", "4")
    printproduct("4", "a")
}