


fun main(args: Array<String>) {

    var str :String = readLine()!!
    var num : Int = try {
        str.toInt()
            }
    catch (e : NumberFormatException){
        4
    }
    num++
    println(num)
}