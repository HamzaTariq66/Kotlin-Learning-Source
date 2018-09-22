

/* Smart cast

    for detail topic
    https://www.javatpoint.com/kotlin-smart-cast

*/

// Example
fun main(args: Array<String>){

    val obj: String? = null
    val str: String? = obj as String? // Works

    println(str)
}
