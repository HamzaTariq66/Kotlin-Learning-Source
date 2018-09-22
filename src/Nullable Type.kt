import java.rmi.registry.LocateRegistry

/*

    Kotlin Null Safety :
    Kotlin null safety is a procedure to eliminate the risk of null reference from the code.

    Kotlin Nullable Types and Non-Nullable Types :

    Aesi type jo null values ko hold kr lay  wo nullable types hoti hian.
    Or
    Aesi Type jo null values ko handle na kr skay wo non nullable type hoti hai

    In kotlin To make string which holds null value, we have to explicitly define them by putting a ? behind the
    String as: String?


 */

//Checking for null in conditions :

fun main(args: Array<String>){
    var str: String? = "Hello"     // variable is declared as nullable
    var len = if(str!=null) str.length else -1
    println("str is : $str")
    println("str length is : $len")

    str = null
    println("str is : $str")
    len = if(str!=null) str.length else -1
    println("b length is : $len")
}