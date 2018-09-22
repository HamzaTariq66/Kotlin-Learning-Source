import java.awt.Color

fun main(args: Array<String>) {

    var dog = doG("black" , "pug")
}

open class animaL{
    var color : String = ""

    constructor(color: String ) {
        this.color  = color

        println("From Dog : $color")
    }
}

class doG: animaL {
    var breed : String =""

    constructor(color: String , breed : String) :super(color){
        this.breed = breed

        println("From Dog: $color and $breed")
    }
}