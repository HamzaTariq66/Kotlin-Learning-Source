
import com.sun.javafx.css.CalculatedValue
import java.sql.SQLClientInfoException
import javax.jnlp.DownloadService
import kotlin.math.cos
import kotlin.math.sqrt
import kotlin.system.exitProcess

/*
    Make Scientific Calculator
 */

class caluculator2 {

    var operation = readLine()!!.toInt()
    var value : Double = 0.0
    var value1: Double = 0.0
    var value2: Double = 0.0
    var result : Double = 0.0

    init {
        if (operation >=1 && operation <=5){
            ini()
        }
        else if (operation >= 6 && operation <=15){
            ini1()
        }
        else if(operation > 15){
            println( "You Entered A wrong Number Plz Try Again..." )
            rept()
        }
    }

    fun ini(){
        println("Enter Values :")
        println("Value 1 :")
        this.value1 = readLine()!!.toDouble()
        println("Value 2 :")
        this.value2 = readLine()!!.toDouble()
        this.result = result

        if (operation == 1) {
            println(sum())
            println(rept1())
        }
        if (operation == 2) {
            println(subtract())
            println(rept1())
        }
        if (operation == 3) {
            println(multiply())
            println(rept1())
        }
        if (operation == 4) {
            println(divide())
            println(rept1())
        }
        if (operation == 5) {
            println(remainder())
            println(rept1())
        }
    }

    fun ini1(){
        println("Enter Values :")
        println("Value :")
        this.value = readLine()!!.toDouble()
        this.result = result

        if (operation == 6) {
            println(log())
            println(rept1())
        }
        if (operation == 7) {
            println(log10())
            println(rept1())
        }
        if (operation == 8) {
            println(Square())
            println(rept1())
        }
        if (operation == 9) {
            println(Square_Root())
            println(rept1())
        }
        if (operation == 10) {
            println(tan())
            println(rept1())
        }
        if (operation == 11) {
            println(tanInverse())
            println(rept1())
        }
        if (operation == 12) {
            println(Cos())
            println(rept1())
        }
        if (operation == 13) {
            println(CosInverse())
            println(rept1())
        }
        if (operation == 14) {
            println(Sin())
            println(rept1())
        }
        if (operation == 15) {
            println(SinInverse())
            println(rept1())
        }

    }

    fun sum() : Double{
        result = value1 + value2
        println("$value1 + $value2 :")
        return result

    }

    fun subtract() :Double {
        result = value1 - value2
        println("$value1 - $value2 :")
        return result
    }

    fun multiply() : Double {
        result = value1 * value2
        println("$value1 * $value2 :")
        return result
    }

    fun divide() :Double {
        result = value1 / value2
        println("$value1 / $value2 :")
        return result
    }

    fun remainder():Double{
        result = value1 % value2
        println("$value1 % $value2 :")
        return result
    }

    fun log():Double{
        result = Math.log(value)
        println("Log($value) :")
        return result
    }

    fun log10() :Double {
        result = Math.log10(value)
        println("Log10($value) : ")
        return result
    }

    fun Square() : Double {
        result = value * value
        println("Square($value) :")
        return result
    }

    fun Square_Root() : Double {
        result = Math.sqrt(value)
        println("SquareRoot($value) :")
        return  result
    }

    fun Sin() : Double {
        result = Math.sin(value)
        println("Sin($value) :")
        return result
    }

    fun SinInverse() : Double {
        result = Math.asin(value)
        println("SinInverse($value) :")
        return result
    }

    fun Cos() : Double {
        result = Math.cos(value)
        println("Cos($value) :")
        return result
    }

    fun CosInverse() : Double{
        result = Math.acos(value)
        println("CosInverse($value) :")
        return  result
    }

    fun tan() :Double{
        result = Math.tan(value)
        println("Tan($value) :")
        return result
    }

    fun tanInverse() : Double {
        result = Math.atan(value)
        println("TanInverse($value) :")
        return value
    }


}

fun rept() {
    println("========================================================================================")
    println("                            WELCOME TO SCIENTIFIC CALCULATOR                            ")
    println("========================================================================================")
    println("PERFORM OPERATION :")
    println("1.  ADD                                           2.  SUBTRACT")
    println("3.  MULTIPLY                                      4.  DIVISION" )
    println("5.  REMAINDER                                     6.  LOG")
    println("7.  LOG10                                         8.  SQUARE" )
    println("9.  SQUARE ROOT                                   10. TAN" )
    println("11. TAN-INVERSE                                   12. COS" )
    println("13. COS-INVERSE                                   14. SIN")
    println("15. SIN-INVERSE ")

    println("Perform Operation :")
    var caluate = caluculator2()

}

fun rept1(){
    println("Press C to Continue AND E to Exit.")
    var optionn: String
    optionn = readLine()!!

    if ((optionn == "c") || (optionn == "C")) {
        rept()
    } else if ((optionn == "e") || (optionn == "E")) {
        exitProcess(1)
    }
}

fun main(args: Array<String>) {
    rept()
}

