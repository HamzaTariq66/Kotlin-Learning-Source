import kotlin.system.exitProcess


open class ATM {

    var optionn2: String = ""
    var option: Int = 0
    var pin: Int = 2343
    var amount: Int = 0
    var _pin: Int = 0
    var balance: Int = 0
    var cbalance: Int = 0
    var account: Long = 0
    var deposite: Int = 0
    var limit : Int = 20000
    var dlimit : Int = 500001
    var alength :Int = 16
    var dlimit1 : Int = 100

    fun Repeat1() {
        println("Press C to Continue AND E to Exit.")
        optionn2 = readLine()!!.toString()

        if ((optionn2 == "c") || (optionn2 == "C")) {
            Transaction()
        } else if ((optionn2 == "e") || (optionn2 == "E")) {
            exitProcess(1)
        }else {
            println("You Enter Wrong Input. Plz Try Again ! Choose option between C and E only")
            Repeat1()
        }
    }

    fun loop() {

        println("Enter Option b/w 1 and 2")
        try {
            option = readLine()!!.toInt()
            while (!(option == 1 || option == 2)) {
                println("You Entered a wrong Option. Plz try again :")
                println("Enter Option b/w 1 and 2")
                option = readLine()!!.toInt()
            }
        } catch (e: Exception) {
            println("You Entered a wrong Input Plz try again.")
            loop()
        }
    }

    fun loop1() {
        Transaction()
    }

    fun Option() {
        loop()
    }

    fun Language() {
        println("Select Language : ")
        println("1. English")
        println("2.Other")
        loop()
    }

    fun Pin() {
        println("Enter 4-digit Pin :")
        try {
            _pin = readLine()!!.toInt()
             while (!(_pin == pin)) {
                 println("You Entered a wrong pin Plz try again :")
                 println("Enter Pin Again :" +
                         "" +
                         "")
                _pin = readLine()!!.toInt()
            }
        }catch (e: Exception) {
            println("You Entered a wrong Input Plz try again.")
            Pin()
        }
    }

    fun Account() {
        println("Select Account Type :")
        println("1. Savings")
        println("2. Current")
        loop()

        if (option == 1 || option == 2 ){
            Transaction()
        }
    }

    open fun Transaction() {
        println("Select a Transaction :")
        println("1.Withdraw Money                                   2.Balance Equiry")
        println("3.Deposit Money                                    4.Transfer")

        println("Enter option b/w 1 to 4 :")
        try {
            option = readLine()!!.toInt()

            while (!(option >= 1 && option <= 4)) {
                println("You enterd wrong option. Plz Try Again.")
                Transaction()
            }
        }catch (e: Exception) {
            println("You Entered a wrong Input Plz try again.")
            Transaction()
        }

        if (option == 1) {
            Money()
            Repeat1()
        } else if (option == 2) {
            Balance()
            Repeat1()
        } else if (option == 3) {
            Deposite()
            Repeat1()
        } else if (option == 4) {
            Transfer()
            Repeat1()
        }
    }

    open fun Money() {

        println("Enter an amount less than Rs.$limit/- :")
        try {
            amount = readLine()!!.toInt()

            while (!(amount <= balance)) {
                println("You Have Insufficient Balance . Your balance is : $balance.Plz Recharge your account and" +
                        " try again")
                Repeat1()
            }

            while (!(amount <= limit)) {
                println("Enter an amount less than $limit")
                amount = readLine()!!.toInt()
            }

            while (amount <= dlimit ){
                println("For widraw Amount must be greater than Rs.$limit/- :")
                amount = readLine()!!.toInt()
            }

            balance -= amount
            println("You withdraw that amount $amount. Now Your Current Balance is ${balance}")

        } catch (e: Exception) {
            println("You Entered a wrong Input Plz try again.")
            Money()
        }
    }

    open fun Balance() {

        println("Your Current Balance = $balance")

    }

    open fun Deposite() {
        println("Enter Amount you deposite in your account . Amount must be less than Rs.$dlimit/- : ")
        try {
            deposite = readLine()!!.toInt()

            while (deposite < dlimit1 ){
                println("Amount must be OR greater than Rs.$dlimit1/- :")
                deposite = readLine()!!.toInt()
            }

            while ((!(deposite <= dlimit) && !(deposite <= dlimit1 ))) {
                println("Your amount higher than $dlimit. Plz Enter amount less than Rs.$dlimit/- :")
                deposite = readLine()!!.toInt()
            }

            println("$deposite has been added to your account")
            balance = deposite
            println("Now your current balance is $balance ")
            Repeat1()
        } catch (e: Exception) {
            println("You Entered a wrong Input Plz try again.")
            Deposite()
        }
    }

    open fun Transfer(){

        println ("Enter 16-Digit Account number where you transfer amount :" )
        try {
            account = readLine()!!.toLong()

            while (!(account.toString().length == alength)){
                println ("Your number are not in $alength digit. Plz Enter $alength Digit Account Number : " )
                account = readLine()!!.toLong()
            }
            println("Enter Amount You want transfer :")
            amount = readLine()!!.toInt()
            while(!(amount <= balance)){
                println("The Amount you want transfer is Higher than Your Balance.Your balance is : $balance. " +
                        "Plz Recharge and try again")
                Repeat1()
            }
            println("$amount has been transfer to the account# $account")
            balance -= amount
            println("Your Remaining balance is $balance")

        }catch (e:Exception){
            println("You Entered a wrong Input Plz try again.")
            Transfer()
        }
    }

}

fun main(args: Array<String>){

    println("Insert Card :")
    println("1. Debit Card")
    println("2. Credit Card")

    val atm = ATM()
    atm.Option()
    atm.Language()
    atm.Pin()
    atm.Account()


}
