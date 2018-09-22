
 class Student2 {

     var name : String  = "Hamza"
     private var age : Int = 22
     public var ages : Int = 23

    public fun getAge() {
         println("hey: "+ age);
    }

     public fun setAge(num : Int) {
         age = num;
     }

}

fun main(args: Array<String>) {

    var sudent = Student2()
    sudent.setAge(24);
    sudent.getAge();
    println("heya: "+ sudent.ages);
}

