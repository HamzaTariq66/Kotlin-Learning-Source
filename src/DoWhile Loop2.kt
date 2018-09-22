
fun main(args: Array<String>){
    var sum = 0
    var num = 10

    do {

        sum += num //sum = sum + 1
        --num

    } while (num != 0)

    println(" Sum Of First 10 natural number is : $sum")
}