


fun main(args: Array<String>) {

    val pakistani = _pakistani()
    pakistani.eat()
    println(pakistani.name)

}

abstract class person { //You cannot creat instance of abstract class

    abstract var name :String
    abstract fun eat()               // asbtract property are "open" by default.
    open fun getHeight(){}          //  A "open" function ready to be overridden
    fun gotoSchool(){}              //  A normal function : public and final by default
}

class _pakistani () : person() {    // Sub-Class OR Derived Class
    override var name: String = "Dummy_Pakistani_Name"
    override fun eat() {
        println("This is the function Eat")
    }

}