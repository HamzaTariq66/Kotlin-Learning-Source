

//Program to compute the addition  of natural numbers from 1 to 10 and subtraction of other 10 natural numbers.

fun main(args:Array<String>){

    var sum = 0
    var num = 10
    var sub = 10
    var num1 = 20
    while (num != 0 ){
        sum += num // sum=sum+1
        --num
    }
    println("Sum : $sum")

    while (num1 !=10){
        sub -= num1 //sub = sub - 1
        --num1
    }

    println("sub : $sub")
}
