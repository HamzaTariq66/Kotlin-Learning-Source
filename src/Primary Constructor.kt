

/*
    Constructor : A constructor is a concise way to initialize class properties.
    In Kotlin, there are two constructors:

    1) Primary constructor - concise way to initialize a class

    Example :

    class Customer (name : String) {

           init {
                // Your class initializer block
           }

    }

    So this name is actually the string and it is actually the primary constructor so this is
    the way we can define the primary constructor .  now if you notice here this constructor  does
    not contain any body now can we initialize all the field variables so for this we have a
    "init" block inside this we can  simply initialize  all the properties or the field variables .


    -> field Variables : the varibales we declare inside the class is called Field Variables or
                         Properties.

 */


fun main(args: Array<String>) {

    var student = Studentt("Hamza")

}

class Studentt (var name: String){


    init {

        println("student has got a name as $name")
    }

}