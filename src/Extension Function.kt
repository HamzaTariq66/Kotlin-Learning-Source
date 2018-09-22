
/*
    Extension Function: you can also use extension function to extend a class with new functionality.
    Basically, an extension function is a member function of a class that is defined outside the class.

    member function : The function declared inside the class are known as MF.It generally use to
    manipulate data and other object data.

    data members: the Variables declared inside the class are known an DM.DM may be private or public.

    data object  : A Data object represents a container for data values, a place where data values may be stored
    and later retrieved.

 */

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}