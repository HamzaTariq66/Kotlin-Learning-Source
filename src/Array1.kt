

/*
 last program you see that is the array which has static values we know the values were 10,12,14,16
 so it was working .
 but what if you want to create an array where you don't know the size or you don't know the values
 you know the size will be 4 but you don't know the value now how do we create an array where you don't know
 the values.

 In that senorio what we will use is well you will not use intArrayOf because intArrayOf imagine that you
 will pass the parameters at the same time instead of that will use a special class in kotlin called "IntArray"
 and in this "IntArray" in this bracket of mention 4 so when you say 4 it means you have an array of 4 values.

  */

fun main(args: Array<String>) {

    var nums = IntArray(4)
    nums.set(0, 10)
    nums.set(1, 12)
    nums.set(2, 14)
    nums.set(3, 16)

    for (i in nums) {
        println(i)
    }
/*
    now what if you want to create an array of string in that senerio what you do is we have to says
    arrays that is not just for string we use it for other type as well so we'll say  "arrayOfNull"
    so we can see we have a option of array of nulls because if you dont know the values ofcourse are you
    cannot specify that. so specify the arrayOfNull and in this <> we specify the class name so if you
    want to create an array of string we can say sring and in the bracket you specify the size.

 */

    var str = arrayOfNulls<String>(5)
    str.set(0,"HAMZA")
    str.set(1,"SHAHZAIB")
    str.set(2,"HASSAN")
    str.set(3,"ANSAB")
    str.set(4,"AWAIS")

    for (a in str){
        println(a)
    }

}


