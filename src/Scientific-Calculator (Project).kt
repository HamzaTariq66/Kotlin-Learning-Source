
import java.util.*
import kotlin.system.exitProcess

/*
    Scientific Calculator
 */

class Scientific_Calculator {

    var value : Double = 0.0
    var value1: Double = 0.0
    var value2: Double = 0.0
    var operation: Int = 0
    var result: Double = 0.0

    fun Op() {
        operation = readLine()!!.toInt()
        if (operation >= 1 && operation <= 4) {
            println("Enter First Value :")
            value1 = readLine()!!.toDouble()
            println("Enter 2nd Value")
            value2 = readLine()!!.toDouble()

        }
        else if (operation >=5  && operation <=12){
            println("Enter Value :")
            value = readLine()!!.toDouble()
        }
    }

    fun choose() {

        if (operation == 1){
            println(sum())
        }
        else if (operation == 2){
            println(sub())
        }
        else if (operation == 3){
            println(multiply())
        }
        else if (operation == 4){
            println(divide())
        }
        else if (operation == 5) {
            println(square())
        }
        else if (operation == 6) {
            println(root())
        }
        else if (operation == 7) {
            println(Sin())
        }
        else if (operation == 8) {
            println(SinInverse())
        }
        else if (operation == 9) {
            println(Cos())
        }
        else if (operation == 10) {
            println(CosInverse())
        }
        else if (operation == 11) {
            println(tan())
            println(rept1())
        }
        else if (operation == 12) {
            println(tanInverse())
            println(rept1())
        }
        else {
            println("You Enetered Wrong Oprtion. Plz Try Again")
            Rep()
        }
    }

    fun sum() : Double {
        println("$value1 + $value2 :")
        return value1 + value2
    }

    fun sub() : Double {
        println("$value1 - $value2 :")
        return value1 - value2
    }

    fun multiply() : Double {
        println("$value1 * $value2 :")
        return value1 * value2
    }

    fun divide() : Double {
        println("$value1 / $value2 :")
        return value1 / value2
    }

    fun square() : Double {
        println("Square($value) :")
        return value * value
    }

    fun root() : Double {
        println("SquareRoot($value) :")
        return Math.sqrt(value)
    }

    fun Sin() : Double {
        println("Sin($value) :")
        return Math.sin(value)
    }

    fun SinInverse() : Double {
        println("SinInverse($value) :")
        return Math.asin(value)

    }

    fun Cos() : Double {
        println("Cos($value) :")
        return Math.cos(value)
    }

    fun CosInverse() : Double {
        println("CosInverse($value) :")
        return Math.acos(value)
    }

    fun tan() : Double {
        println("Tan($value1) :")
        return Math.tan(value)
    }

    fun tanInverse() : Double{
        println("TanInverse($value) :")
        return Math.atan(value)
    }

    fun Rep1(){
        println("Press C to Continue AND E to Exit.")
        var optionn: String
        optionn = readLine()!!

        if ((optionn == "c") || (optionn == "C")) {
            Rep()
        } else if ((optionn == "e") || (optionn == "E")) {
            exitProcess(1)
        }
    }

}

fun Rep() {
    println("========================================================================================")
    println("                            WELCOME TO SCIENTIFIC CALCULATOR                            ")
    println("========================================================================================")
    println("PERFORM OPERATION :")
    println("1.  ADD                                           2.  SUBTRACT")
    println("3.  MULTIPLY                                      4.  DIVISION")
    println("7.  SQUARE                                        8.  SQUARE ROOT")
    println("9.  SIN                                           10. SIN-INVERSE")
    println("11. COS                                           12. COS-INVERSE ")
    println("13. TAN                                           14. TAN-INVERSE")

    println("Perform Operation :")

    val obj =Scientific_Calculator()
    obj.Op()
    obj.choose()
    obj.Rep1()
}

fun main (parameter: Array <String>) {
    Rep()
}

