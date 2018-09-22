
/*
    Default parameter : Aese parameters jinki hum default values set kr sktay hain ...
                        e.g fun add ( a: Int = 2 , b : Double  0.02)

    why we use Named Parameters  : let's say if you are passing two values now sometimes you know when you
    read your code it looks difficult to understand what is the first parameter what is the second parameter
    I mean you can see the code here itself but let's say if you have a very big application and the function
    you have mentioned here is somewhere else how would you know in which sequence to pass the parameter so
    in that case if you are writing the name of the parameter it will be easier for you to remember

    e.g: var finalAmt = calcAmount(amt = 50 , interest = 0.03)

    the advantage is it is more readable and even if you don't know the sequence that's fine . it means you
    can change the sequence

     e.g: var finalAmt = calcAmount(interest = 0.03, amt = 50)

 */

fun main(args: Array<String>) {

    var finalAmt = calAmt(interest = 0.03 , amt = 50) // Named Paramete
    println(finalAmt)

}

fun calAmt (amt : Int , interest : Double = 0.04)  :Int { //Default Parameter

    return (amt + amt*interest).toInt()
}