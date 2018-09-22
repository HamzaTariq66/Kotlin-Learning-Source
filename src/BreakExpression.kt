
/*
    Suppose you are working with loops. It is sometimes desirable to terminate the loop immediately without checking
    the test expression.
    In such case, break is used. It terminates the nearest enclosing loop when encountered (without checking the test
     expression).
 */

fun main(args:Array<String>){

    for (i in 1..10){
        if(i == 5){
            break
        }
        println(i)
    }

}