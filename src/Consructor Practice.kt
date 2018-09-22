


fun main(args: Array<String>){

    var obj = Dog2()
    obj.breed = "MEOW"
    obj.color = "WHITE"


}

open class Animal2 {

    var color : String = ""

}

class Dog2 : Animal2(){

    var breed : String = ""

}