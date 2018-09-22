
/*
    2) Secondary constructor - allows you to put additional initialization logic

    -> To Declare Secondary conductor Use "Constructor" Keyword followed by the simply
     define the parameter.
    -> Now if you declaring the secondary constructor make sure you give a explicit call to primary
     constructor as well because the compiler won't allow to write such code without calling
     primary constructor From secondary constructor.
    -> Unlike the primay constructor this primary constructor has its own body
     So the primary constructor does not contain its own body but you can create this init block
     as a part of this primary constructor.
    -> In kotlin you cannot declare the properties inside the Secondary constructor unlike the primary
     constructor where we declared named as a property of the class.
     So what the solution for this we have simply declare id insside the class that acces in secondary
     constructor.
     -> The body of secondary consructor is called after the init block.

    Example :

    Constructor (name : String , Id : Int ) : this(name) {


    }


 */

fun main(args: Array<String>) {

    var student = Studentt1("Peter",10)

    print(student.id)

}

class Studentt1(var name :String){

    var id : Int = -1

    init {
        println("Student got a name as $name and id $id")
    }

    constructor(name: String, id: Int)  : this(name){
        this.id
    }


}