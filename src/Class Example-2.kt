import com.sun.org.omg.CORBA.Initializer

/*
    Implement a class called Student that has properties like its name and its note. Define methods to
    initialize their properties by keyboard, print them and display a message if it is regular
    (note greater than or equal to 4)
    Define two objects in the Student class.
 */

class Student(){
    var name : String = ""
    var note : Int = 0

    fun Initialize() {
        println("Enter Name:")
        name = readLine()!!
        println("Eneter Age: ")
        note = readLine()!!.toInt()
    }
    fun print(){
        println("$name is regular")
    }
    fun limit(){
        if (note >= 4){
            println("$name is regular")
        }
        else{
            print("$name is Not Regular")
        }
    }
}

fun main(args: Array<String>) {
    val student = Student()
    Student().Initialize()
    Student().print()
    Student().limit()
    val student1 = Student()
    Student().Initialize()
    Student().print()
    Student().limit()
}