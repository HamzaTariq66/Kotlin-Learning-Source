
/*
    We will implement a class called Person whose properties (variables) will be their name and age,
    and three methods (functions), one of these methods will initialize the properties of the name
    and age, another method will show on the screen the contents of properties and Last one you print
    if you are of legal age.

    Define two objects in the Person class.
 */

class Person {
    var name: String = ""
    var age: Int = 0

    fun initialize (name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun print () {
        println ( "Name: $name and has an age of $age ")
    }

    fun isMayorage () {
        if (age>= 18)
            println ("Yes Is of age $name ")
        else
            println ("No Is not of age $name ")
    }
}

fun main(args: Array<String>) {

    val person1: Person
    person1 = Person ()
    person1.initialize ("Hamza",12)
    person1.print ()
    person1.isMayorage ()

    val person2: Person
    person2 = Person ()
    person2.initialize ("ALI", 50)
    person2.print ()
    person2.isMayorage ()

}