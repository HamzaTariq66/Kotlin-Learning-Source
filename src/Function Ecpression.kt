

//


fun main(args: Array<String>) {

    var result = add(10,20)
    println("Result of addition = $result")

    var result1 :Int = max(20,110)
    println("Result of max $result1")
}

fun add(a: Int , b: Int) : Int = a+b

fun max(a:Int , b:Int ) : Int = if (a>b) a else b


/*
    Method with the same name but different parameters  and that ooncept is called
    method/function overloading.
 */