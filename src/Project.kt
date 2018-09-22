import kotlin.math.sign
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import kotlin.system.exitProcess

var option: Int = 0
var network: Int = 0
var num: Long = 0
var jamount = 0
var wamount = 0
var uamount = 0
var tamount = 0
var amount1 = 0
var option1: String = ""
var i: Int = 0
var number :Long = 0

fun main(args:Array<String>) {
    rep()
}

fun rep() {
    println("1. Easy Load ")
    println("2. Balance Share")
    println("3. Check Balance")
    println("CHOOSE OPTION : ")

    option = readLine()!!.toInt()

    if (option == 1) {
        rep1()
    }
    if (option == 2) {
        rep2()
    }

    if (option == 3) {
        rep3()
    }
    else if (option > 3) {
        println("You Entered Wrong Option . Try Again")
        rep()
    }
}

fun rep1() {
    println("1. Jazz")
    println("2. Warid")
    println("3. Ufone")
    println("4. Telenor")
    println("Choose Network :")

    network = readLine()!!.toInt()

    if (network == 1 ) {
        println("Enter Your Jazz Number: ")
        num = readLine()!!.toLong()

         while(!validatePhone(num)) {
            println("Please enter valid number ")

        }

        println("Enter Amount :")
        jamount = readLine()!!.toInt()

        println("Rs. $jamount has been transfered to your number $num")

        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 2 ) {
        println("Enter Your Warid Number: ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        wamount = readLine()!!.toInt()

        println("Rs. $wamount has been transfered to your number $num")

        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!


        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 3 ) {
        println("Enter Your Ufone Number: ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        uamount = readLine()!!.toInt()

        println("Rs. $uamount has been transfered to your number $num")

        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 4 ) {
        println("Enter Your Telenor Number: ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        tamount = readLine()!!.toInt()

        println("Rs. $tamount has been transfered to your number $num")

        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    else {
        println("You Entered a wrong Option .. Try Again")
        rep1()
    }
}

fun rep2() {

    println("1. Jazz")
    println("2. Warid")
    println("3. Ufone")
    println("4. Telenor")
    println("Choose Network: ")

    network = readLine()!!.toInt()

    if (network == 1) {

        println("Enter Jazz Number : ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        amount1 = readLine()!!.toInt()

        if (amount1 < jamount) {
            println("Rs. $amount1 has been Shared to your number")
            jamount = jamount - amount1
            println("Rs. Remaining amount in your account is : $jamount")
        } else if (amount1 > jamount) {
            println("Your current balance is $jamount . plz recharge for sharing that amount.")
        }
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!
        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 2) {

        println("Enter Warid Number : ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        amount1 = readLine()!!.toInt()

        if (amount1 < wamount) {
            println("Rs. $amount1 has been Shared to your number")
            wamount = wamount - amount1
            println("Rs. Remaining amount in your account is : $wamount")
        } else if (amount1 > wamount) {
            println("Your current balance is $wamount . plz recharge for sharing that amount.")
        }
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!
        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 3) {

        println("Enter Ufone Number : ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        amount1 = readLine()!!.toInt()

        if (amount1 < uamount) {
            println("Rs. $amount1 has been Shared to your number")
            uamount = uamount - amount1
            println("Rs. Remaining amount in your account is : $uamount")
        } else if (amount1 > uamount) {
            println("Your current balance is $uamount . plz recharge for sharing that amount.")
        }
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!
        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 4) {

        println("Enter Telenor Number : ")
        num = readLine()!!.toLong()

        println("Enter Amount :")
        amount1 = readLine()!!.toInt()

        if (amount1 < tamount) {
            println("Rs. $amount1 has been Shared to your number")
            tamount = tamount - amount1
            println("Rs. Remaining amount in your account is : $tamount")
        } else if (amount1 > tamount) {
            println("Your current balance is $tamount . plz recharge for sharing that amount.")
        }
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!
        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    else {
        println("You Entered a wrong Option .. Try Again")
        rep2()
    }
}

fun rep3() {

    println("1. For Jazz (*111#)")
    println("2. For Warid (*100#)")
    println("3. For Ufone (*124#)")
    println("4. For Telenor (*444#")
    println("Choose Network: ")

    network = readLine()!!.toInt()
    if (network == 1 ) {
        println("Your current balance is $jamount")
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 2 ) {
        println("Your current balance is $wamount")
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 3 ) {
        println("Your current balance is $uamount")
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    if (network == 4 ) {
        println("Your current balance is $tamount")
        println("Press C to Continue AND E to Exit.")
        option1 = readLine()!!

        if ((option1 == "c") || (option1 == "C")) {
            rep()
        } else if ((option1 == "e") || (option1 == "E")) {
            exitProcess(1)
        }
    }

    else {
        println("You Entered a wrong Option .. Try Again")
        rep3()
    }
}

fun validatePhone(number: Long): Boolean {
    if(number.toString().length == 11) {
        return true;
    }
    return false;
}