
/*
    Suppose you are working with loops. It is sometimes desirable to skip the current iteration of the loop.

    In such case, continue is used. The continue construct skips the current iteration of the enclosing loop, and the
    control of the program jumps to the end of the loop body.

 */

fun main(args:Array<String>){

    for (i in 1..5){
        println("$i Always printed")

        if (i>1 && i<5 ){
            continue
        }
        println("$i Not always printed")
    }
}