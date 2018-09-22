

/*

The function defination which is actually acting as a expression So this expression is simply returning some
values if a is greater than b than simply print a else b.

Now suppose you have multiple statements in case of if clause and also in case of else clause so for that
you can also convert it into a body

Suppose if you write any number under 'a' So that number will be returened instead of 'a'. So always
remember this. and this 'a' now will be redundant

So always remember inside the code block whatever you write at the end of the block will always be returned.

*/


fun main(args: Array<String>) {

    var largeNumber = max(4,6)
    println("The geater number is $largeNumber")

    var SmallNumber = small(4,2)
    println("The Smaller number is $SmallNumber")

}

fun max (a : Int , b :Int) : Int = if (a > b) a else b

fun small(a: Int , b : Int) : Int
        = if (a < b) {
            println("$a is smaller ")
            a

        } else {
            println("$b is smaller ")
            b
            98
        }