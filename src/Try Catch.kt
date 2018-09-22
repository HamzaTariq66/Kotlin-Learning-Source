import kotlin.system.exitProcess


fun main(args : Array<String>){

looop()

}

fun looop() {
    var input: String? = null
    println("Press C for Continue and E for Exit")

        input = readLine()

        if (input == "c" || input == "C") {
            looop()
        } else if (input == "e" || input == "E") {
            exitProcess(1)
        }else {
            println("You Enter Wrong Input. Plz Try Again ! Choose option between C and E only")
            looop()
        }


}