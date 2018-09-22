
fun main(args:Array<String>) {

    var birth_year: Int
    var birth_month: Int
    var birth_day: Int
    var current_year: Int
    var current_month: Int
    var current_day: Int
    var age_year: Int
    var age_month: Int
    var age_day: Int

    println("Enter Yout Current_Year :")
    current_year = readLine()!!.toInt()

    println("Enter Yout Current_Month :")
    current_month = readLine()!!.toInt()
    println("Enter Yout Current_Day :")
    current_day = readLine()!!.toInt()

    println("Enter Your Birth_Year :")
    birth_year = readLine()!!.toInt()
    println("Enter Your Birth_Month :")
    birth_month = readLine()!!.toInt()
    println("Enter Your Birth_Day :")
    birth_day = readLine()!!.toInt()

    age_year = current_year - birth_year
    age_month = current_month - current_month
    age_day = current_day - birth_day

    println("Your Age is Now : $age_year Years and $age_month month and $age_day day ")
}