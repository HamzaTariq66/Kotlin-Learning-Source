


/*

    Extension Function :

    The Purpose of Extension function is to add a new function to the existing class.
    So it is simply adds a particular function to a predefined class without declaring it inside the class.
    The new function actually behaves like static functions in case of java.

   Few Properties of Extension Functions :

    .They can become part of  your own class
        e.g : Student , employee , Person etc.

    .They can become part of predefined classes
        e.g : String , Int , Array etc. Or any other predefined classes that comes with the kotlin SDK.


    Advantage :

    .  Reduces Code
    .  Code is much cleaner and easy to read.

   In the Example given below  :

   the output we get hey hello world . so what exactly is happening here so here i have simply defined the
   extension function of add now this extension function add is now a part of this class of String that we defined in
   main method.. Now that string is actually the predefined class whose code we have not written it is
   already written in our SDK so we dont no how to modify this class but in kotlin there is a way to do it.
   we can simply add a function inside a predefined class so this add function is now a part of this class
   and now here it takes two parameters string 1 and string 2 .

   Note :

   In kotlin everthing is a object.

   what is "this" that we seen in the function :
   The object that is calling the method is actally stored inside "this" keyword inside the function


 */


fun main(args: Array<String>) {

    val str1 : String = "Hello"
    val str2 : String = "World"

    var str3: String = "Hey"

    println(str3.add(str1,str2  ))


    val x : Int = 10
    val y : Int = 20

    val greaterval = x.GreaterNumber(y)

    println("Gretaer value is $greaterval")

}

fun String.add(s1 :String , s2 :String) : String {
    return this + s1 + s2
}

fun Int.GreaterNumber(other : Int ) : Int {
    if (this > other)
        return this
    else
        return other
}
