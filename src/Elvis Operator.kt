

/*

   Elvis Operator :

   Jab b ap kissi varible ki ya object ki value ko null specify krtay hain yaani k wo value null accept krskti hia
   runtime hai..
   lekin ap chahty hain incase agr apki value null arhi hai tow ap uxme kuch default value add krna chahtay hian
   then ap elvis operator use krtay hain.

                                                    OR

   ye basically hai k ap nullable value ko koi default value dena chahtay hain agr wo null ho tow then we use this
   operator.
                                                    OR
   hamri nullable variable ki value agr null hai tow wo null ki bajye hum koi default value set kr sktay hian ..

    For Example :

    ab ye jo humne example solve ki hia ixme hoga kia :

    sbse phle tow wo kia kray ga chck kray ga k apne jo variable ko value assign ki hia wo null to nahi agr null
    hogi tow wo by default humne value add ki hai elvis operator k sath wo show jaye gi or agr null nahi hai tow
    wo hamri variable wali value ko show krwa de ga..

 */

fun main(args: Array<String>) {

    var name : String ? = "ALI"

    println(name ?: "Hamza")

    var age : Int? = null

    println(age ?: 20)

}

