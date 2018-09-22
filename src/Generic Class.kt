


/*
     Generics :

     Generics, or generic programming, is a technique whereby functions can be written in terms of types that are not
     specified when the function is written, and then later used for many different types.

 */


class Login<T> (username: T , password : T){
    init {
        println("USERNAME IS: " + username + " " + "PASSWORD IS:" + password)
    }
}

class persoN(var name: String ,var age : Int){

    init {
        this.name = name
        this.age = age
        println("NAME IS : $name")
        println("AGE IS : $age")
    }
}

fun main(args: Array<String>){

    var obj= Login<String>("HAMZA" , "ABCD123")
    var obj2 = Login<Int>(23,45)
    var obj3 = Login<Boolean>(true , false)

    var pers = persoN("ALI " , 23)
    var obj4 = Login<persoN>(pers,pers)
}