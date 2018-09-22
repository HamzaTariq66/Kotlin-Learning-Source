

// Create a loop that prints out all the numbers from 0 to 100 that are divisible by both 3 and 5

fun main(args: Array<String>) {

    for(value in 3..100 step 3){
        if(value % 5 == 0){
            println(value)
        }
    }
}