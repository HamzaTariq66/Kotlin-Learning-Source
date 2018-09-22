import java.math.BigInteger

fun main(args: Array<String>) {

    var num : BigInteger = BigInteger("70000")
    println(fac(num))

}

fun fac(num : BigInteger) :BigInteger{
    if (num == BigInteger.ZERO)
        return BigInteger.ONE
    else
        println("HELLO" + num)
        return num * fac(num- BigInteger.ONE)
}

/*
In this program if we print 70000 number tow hoga ye k  stack overflow exception aa jaye gi.
stackOverflow Exception hoti hia like apko 5 ka factorial chye wo kia kray ga 5*4! to program kia kray
ga wo kahy ga phle mje tow solve kro then 4 ko solve krny k lye ap krogay 4*3! ixko krny k lye 3! kahy
ga mje solve kro ix trah kia hoga k values pending me chali jaye gii orr stack me values limited frames
tk ap ad kr sktay ho or jab value ux se barh jaye gi tow wo apko stackOverflow Exception de dega...


    Ab agr hum aesa kray k ux facorial! wali value ko sath sath e solve krde pending me na rakhay tow
hamara jo issue hai solve hojye ga ... ab ixk lye hum tail recursion use kray gay k sath sath e value
solve krde oending me na rakhay...

Tail recursion ki example kray gay next program me..
 */