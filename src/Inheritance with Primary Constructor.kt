

fun main(args: Array<String>) {

    var dog = _DoG("Black","pug")
}

open class _AnimaL(var color : String){
    init {
        println("From Animal Init : $color")
    }
}

class _DoG(color: String, var breed :String) : _AnimaL(color) {
    init {
        println("From Animal Init : $color and $breed")
    }
}
