

/*

   Companion object : are same as 'object' but they are declared within a particular class.

 */

class myClass() {
    companion object {
        var count :Int = 100

        fun typeOfcustomer() :String{
            return "Hamza"
         }
    }
}

fun main(args: Array<String>) {

    myClass.count
    myClass.typeOfcustomer()

    println(myClass.count)
    println(myClass.typeOfcustomer())

}