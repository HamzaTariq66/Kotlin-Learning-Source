

/*


    Object :

    An object is nothing but a block of memory allocated and configured according to a design/definition.

    OOP :

    In object-oriented style of programming, you can divide a complex problem into smaller sets by
    creating objects.

    These objects share two characteristics:

    .state
    .behavior
    Let's take few examples:

    ->Lamp is an object
    .It can be in on or off state.
    .You can turn on and turn off lamp (behavior).

    ->Bicycle is an object
    .It has current gear, two wheels, number of gear etc. states.
    .It has braking, accelerating, changing gears etc. behavior.


    Data Member : Variables that we declare inside the class ..


    Instance of a class MEans : Current state of the class
 */

/*

    Kotlin provides full support for the points above but also supports fully the three pillars of
any modern OOP language: encapsulation, inheritance, and polymorphism.

Encapsulation : means that a group of related fields and methods are treated as an object.

Inheritance : describes the capability of creating a new class from an existing one.

Polymorphism : means you can use different classes interchangeably despite(کے باوجود) the fact that
               each one implements its methods differently.

 */


class Lamp {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }
}

fun main(args: Array<String>) {

    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class
}