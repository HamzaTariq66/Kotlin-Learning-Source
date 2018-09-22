

fun main(args: Array<String>) {

    var dog = Dog()
    dog.breed = "Labra"
    dog.color = "Black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.color = "White"
    cat.age = 7
    cat.meow()
    cat.eat()

}

open class Animal {

    var color :String = ""

    fun eat(){
        println("Eat")
    }
}

class Dog :Animal(){

    var breed : String = ""

    fun bark(){
        println("Bark")
    }
}

class Cat :Animal() {

    var age : Int = -1

    fun meow () {
        println("Meow")
    }
}