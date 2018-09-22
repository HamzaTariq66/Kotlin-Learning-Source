

///Program to compute the subtraction of natural numbers from 1 to 10.

fun main(args: Array<String>){
    var sub = 0
    var num = 10

    while (num != 0) {
        sub -= num // sub = sub - num
        --num
    }
    println("Subtraction : $sub")
}


