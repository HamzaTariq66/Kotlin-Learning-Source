

//Program to compute the sum of natural numbers from 1 to 100.

fun main (args : Array<String>){

    var sum = 0
    var num = 100

    while (num != 0 ){
        sum += num // sum=sum+1
        --num
    }
    println("Sum : $sum")

}