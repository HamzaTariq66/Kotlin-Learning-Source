


/*
    Scientific Calculator
 */



open class calculator3 (val value1: Double, val value2: Double) {

    var result: Double = 0.0

    fun sum () {
        println("$value1 + $value2 :")
        result = value1 + value2
    }

    fun sub () {
        println("$value1 - $value2 :")
        result = value1 - value2
    }

    fun multiply () {
        println("$value1 * $value2 :")
        result = value1 * value2
    }

    fun divide () {
        println("$value1 / $value2 :")
        result = value1 / value2
    }

    fun print () {
        println ("Result: $result")
    }
}

class ScientificCalculator2(var value: Double) : calculator3( 0.0,0.0) {

    fun square() {
        println("Square($value) :")
        result = value * value
    }

    fun root() {
        println("SquareRoot($value) :")
        result = Math.sqrt(value)
    }

    fun Sin() {
        println("Sin($value) :")
        result = Math.sin(value)
    }

    fun SinInverse() {
        println("SinInverse($value) :")
        result = Math.asin(value)
    }

    fun Cos() {
        println("Cos($value) :")
        result = Math.cos(value)
    }

    fun CosInverse() {
        println("CosInverse($value) :")
        result = Math.acos(value)
    }

    fun tan() {
        println("Tan($value1) :")
        result = Math.tan(value)

    }

    fun tanInverse() {
        println("TanInverse($value) :")
        result = Math.atan(value)

    }

}

fun main (parameter: Array <String>) {
    println ("class test Calculator")
    val calculator1 = calculator3 (10.0, 2.0)
    calculator1.sum ()
    calculator1.print ()
    calculator1.multiply()
    calculator1.print()

    println ("Test of Scientific Calculator class")
    val ScientificCalculator1 = ScientificCalculator2 (11.0)

    ScientificCalculator1.square ()
    ScientificCalculator1.print ()

    ScientificCalculator1.root ()
    ScientificCalculator1.print ()

}