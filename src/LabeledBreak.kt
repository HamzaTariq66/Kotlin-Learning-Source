
fun main(args: Array<String>) {

    first@ for (i in 1..4) {
        second@ for (j in 1..5) {
            println("i = $i and j= $j")

            if (i==2)
                break@first
        }
    }
}