


fun main(args: Array<String>) {
 fun hasPreix(x:Any) = when (x){
    is String -> x.startsWith("prefix")
     else -> false
 }
}
