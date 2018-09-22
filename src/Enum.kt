

/*

    Enum Classes: allow us to represent collection of information  (fixed or static information)

    why we use them :

    Anytime you have fixed items or fixed variables that you know the values are always fixed and you want
    to  enumerate them or put them in one class you should use enum class or anytime you want flexibility
    you should always use enum class.

 */

enum class Suits {

    HEARTS,
    SPADES,
    DIAMOND,
    CLUBS

}

enum class Directions {

    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main(args : Array<String>){

    var cardPlayer = Suits.DIAMOND

    if (cardPlayer == Suits.DIAMOND) {
        println("You are doing great!")
    }
    else if (cardPlayer == Suits.CLUBS) {
        println("HELLO THERE ! THINGS ARE NOT SO WELL")
    }

    var direction = Directions.EAST
    if ( direction == Directions.EAST){
        println("YOu are going to east")
    }
    else if (direction == Directions.WEST){
        println("You ARe Going wrong")
    }
}

