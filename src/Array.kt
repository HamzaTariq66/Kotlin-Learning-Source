

/*

Concept: When You have a collection of element so if you have a number of variables and
         if you want to work them together instead of creating four to five variables seperately
         we can create one array. So instead of five variables we can create an array of five element.

*/



fun main(args: Array<String>) {

    var nums = intArrayOf(10, 12, 14, 16)
    nums[1] = 13
    /*
    see if in java arrays are objects and when you say array are objects it should have some methods
    using which you can set the values and get the value because working with the square bracket is
    not comfortable for everyone there are some people they believe when you want to fetch(assign) when you
    want to assign the value we should be using a method like mayebe something like set or get.
 */
    nums.set(2,15)

    /*
    so as you can see we got the value of 15 so we can either use a square bracket or we can use
    a method which is set.
     */


   //to print all the values in an array we use for loop.

    for (i in nums) {
        println(i)
    }

    //if you want to print a soecific value then don't need to use for loop
    println("Print a specific value :" + nums[3])

    // we can also print specific value using set method
    println("using Get method : "  + nums.get(3))

    //another method using last()
    println("using last() method : " + nums.last() )



}