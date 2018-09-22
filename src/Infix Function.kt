

/*

    Infix Function :

   1. Infix function can be a member function or extension function.
   2.They have Single Parameter
   3.They have Prefix of "infix".


  --> ALL infix functions are extension function
     BUT all extension function are not Infix
  --> Infix Function just have ONE parameter.


    The Benifit of using Infix function is we use x GreaterVal y instead of x.GreaterVal(Y)

 */

fun main(args: Array<String>) {

    val x : Int = 10
    val y : Int = 20

    val greaterval = x GreaterVal y  // x.GreaterVal(Y)

    println("Gretaer value is $greaterval")

}


infix fun Int.GreaterVal(other : Int ) : Int {
    if (this > other)
        return this
    else
        return other
}