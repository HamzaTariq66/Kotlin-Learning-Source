
//program below calculates the sum of numbers entered by the user until user enters 0.

fun main(args:Array<String>){

    var sum = 0
    var input : Int

    do {
        println("Enter Number : ")
        input = readLine()!!.toInt()
        sum += input
    } while (input != 0)

    println("Sum = $sum")
}