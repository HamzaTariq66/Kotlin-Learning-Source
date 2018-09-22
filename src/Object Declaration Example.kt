


open class MySuperClass(){

    open fun myMethod(str :String){
        println("My Super Class")
    }

}


object customerData : MySuperClass(){

    var count:Int = 98                             //Behaving like STATIC variable
    fun typeOfCustomer() :String {                 //Behaving like STATIC Mehods
        return "Pakistani"
    }

    override fun myMethod(str: String) {          //Currently Behaving like static method
        super.myMethod(str)
        println("object customerDATA : " + str)
    }

    init {
        //CODE
    }

}

fun main(args: Array<String>) {
    customerData.count
    customerData.typeOfCustomer()

    println(customerData.count)

    customerData.count = 109
    println(customerData.count)

    customerData.myMethod("Hamza")


}