
/*

    "ANY" class contains fuction such as :
    ->equal():Boolean
    ->Hashcode:Int
    ->toString():String

    When we use data classes the kotlin simply provides a "copy method" for us.
    The data classes simply provides mentioned methods implementation. So we can make effective use of these method
    inside the data classes.

    Definition:
    Data class is a simple class which is used to hold data/state and contains standard functionality.
    A data keyword is used to declare a class as a data class.

    In case of data classes the primary constructor should only contains the property parameter.
    e.g data class user(var name:String)
    it does not contain only parameters e.g
    data class user (name :String)


    Kotlin Data Class Requirements
    Here are the requirements:

    The primary constructor must have at least one parameter.
    The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).
    The class cannot be open, abstract, inner or sealed.
    The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1, the
    class can only implement interfaces.

   FOR DETAILED TOPIC GO TO THIS LINK:
   https://www.programiz.com/kotlin-programming/data-class


 */