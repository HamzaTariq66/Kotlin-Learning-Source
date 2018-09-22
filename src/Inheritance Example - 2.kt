import javax.jnlp.DownloadService
import kotlin.math.sqrt

/*
    Declare a class called Calculator that receives two values of type Double in the constructor.
    Make the class open to be inheritable .Define the responsibilities of adding, subtracting,
    multiplying, dividing and printing.

    Then declare a class called CalculatorCalculate that inherits from Calculator and add the
    responsibilities of calculating the square of the first number and the square root.
 */

open class calculator (val value1: Double, val value2: Double) {
    var result: Double = 0.0
    fun sum () {
        result = value1 + value2
    }

    fun sub () {
        result = value1 - value2
    }

    fun multiply () {
        result = value1 * value2
    }

    fun divide () {
        result = value1 / value2
    }

    fun print () {
        println ("Result: $result")
    }
}

class ScientificCalculator (value1: Double, value2: Double): calculator (value1, value2) {
    fun square () {
        result = value1 * value1
    }

    fun root () {
        result = Math.sqrt (value1)
    }
}

fun main (parameter: Array <String>) {
    println ("class test Calculator(sum of two numbers)")
    val calculator1 = calculator (10.0, 2.0)
    calculator1.sum ()
    calculator1.print ()

    println ("Test of Scientific Calculator class (sum of two numbers and the square and root of the first)")
    val ScientificCalculator1 = ScientificCalculator (10.0, 2.0)
    ScientificCalculator1.sum ()
    ScientificCalculator1.print ()

    ScientificCalculator1.square ()
    ScientificCalculator1.print ()

    ScientificCalculator1.root ()
    ScientificCalculator1.print ()
}