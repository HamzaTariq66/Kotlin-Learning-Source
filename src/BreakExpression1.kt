
//Calculate Sum Until User enters 0

fun main(args:Array<String>){

    var sum = 0
    var num:Int

    while (true) {
        println("Enter a number :")
        num = readLine()!!.toInt()

        if (num == 0)
            break

        sum += num
    }
        println("SUM Is $sum")
}