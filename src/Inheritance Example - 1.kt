


/*
Raise a class Person that contains two properties: name and age. Define as responsibilities the
builder who receives the name and age. In the main function of the program define an object of the
 Person class and call its methods.

Declare a second class called Employee who inherits from the Person class and add a wage property
and show if you must pay taxes (salary greater than 3000) Also in the main function of the program
create an object of class Employee.
 */

open class _person (val name  : String , val age : Int) {
   open fun print(){
        println("NAME IS :$name")
        println("AGE IS : $age")
    }
}

class employee(name: String, age: Int , val salary : Double) : _person(name,age){
    override fun print(){
        super.print()
        println("SALARY IS : $salary")
    }

    fun paidTax(){
        if (salary > 3000){
            println("THE $name paid the taxes")
        }
        else{
            println("The $name not paid the taxes")
        }
    }
}

fun main(args: Array<String>) {
    var person1 = _person("Hamza",20)
    println("DATA OF PERSON :")
    person1.print()

    var employe =  employee("Hamza",20,3300.0)
    println("DATA OF EMPLOYEE :")
    employe.print()
    employe.paidTax()

}