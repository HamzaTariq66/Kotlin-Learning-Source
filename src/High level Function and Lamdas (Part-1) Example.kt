

fun main(args: Array<String>) {

    val program = Program()

    program.addTwoNumber(2,7) // Simple Way .. for Better Understanding

    program.addTwoNumber(2,7 , object : _myInterface{
        override fun excute(sum: Int) {
            println(sum)        // Body
        }
    })

    val test : String = "Hello"

    val myLambda = {s : Int -> println(s) }        // Lambda Expression [ Function ]

    program.addTwoNumber(2,7,myLambda)

}


class Program {


    fun addTwoNumber (a : Int , b : Int , action:  (Int) -> Unit ) {           // High Level Function with lambdas as Paramete
        val sum = a+b
        action(sum)    //println(sum)
    }

    fun addTwoNumber (a : Int , b : Int, action: _myInterface) {  // Using Interface / Object Oriented Way
        val sum = a+b
        action.excute(sum)

    }

    fun addTwoNumber (a : Int , b : Int) {           // Simple Way .. for Better Understanding
        val sum = a+b
        println(sum)
    }

}

interface _myInterface {
    fun excute(sum : Int)
}