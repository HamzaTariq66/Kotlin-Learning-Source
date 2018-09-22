

/*
    Recursion:
    A function that calls itself is known as recursive function. And, this technique is known as recursion.
 */

fun main(args: Array<String>) {

    var num = 7
    println(fact(num))

}

fun fact(num : Int) :Int {
    if (num == 0)
        return 1
    else
        return num * fact(num-1)
}

/*
 In this program if you find the factorial of 70 you will get the input 0 because the factorial of
 70 is very big that INT cant handle .To handle big Number We use "BigInteger" which is the class of java.

 In next program we will use BigInteger.
 */