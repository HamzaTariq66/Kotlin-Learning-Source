


class Getter(name: String , age : Int) {

    var name:String
        get() = this.name
        set(name) {

            if (!name.contains("aa")){
                println("NAME IS INVALID")
            }
            else {
                println("YOUR NAME IS $name")
            }
        }
    var age : Int
        get() = this.age
        set(age) {

            if (age > 18) {
                println("Age is : $age")
            }
            else{
                println("you are not adult")
            }

    }

    init {
        this.name = name
        this.age = age
    }


}

fun main(args: Array<String>){


    val obj = Getter("HAMZA",21)



}