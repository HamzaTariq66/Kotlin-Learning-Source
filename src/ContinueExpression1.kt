
//Calculate Sum of Positive Numbers Only

fun main(args:Array<String>){

    var num :Int
    var sum = 0

    for (i in 1..6) {
        print("please Enter an integer: ")
        num = readLine()!!.toInt()

        if (num <= 0)
            continue

        sum += num
    }

    println("Sum : $sum")

}