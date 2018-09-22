
/*
    In normal recursion, you perform all recursive calls first, and calculate the result from return
    values at last (as show in the above example). Hence, you don't get result until all recursive calls
     are made.

    In tail recursion, calculations are performed first, then recursive calls are executed
    (the recursive call passes the result of your current step to the next recursive call).
    This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.


 */



import java.math.BigInteger

fun main(args: Array<String>) {

    var num : BigInteger = BigInteger("70000")
    println(facto(num,BigInteger.ONE))

}

tailrec fun facto(num : BigInteger , result: BigInteger) :BigInteger{
    if (num == BigInteger.ZERO)
        return result
    else{
        return facto(num- BigInteger.ONE , num*result)
    }
}
