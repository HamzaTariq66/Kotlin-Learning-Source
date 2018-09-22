
fun main(args:Array<String>){
    var num = 10
    var num1 = 20
    var sum = 0
    var sub = 10

    do {
        sum += num //sum =sum+num
        --num
    }while (num!=0)

    println("Sum of First 10 Natural Number : $sum")

    do{
        sub -= num1 //sub=sub-num
        --num1
    }while (num1!=10)

    println("Subtraction of Other 10 natural number : $sub")
}