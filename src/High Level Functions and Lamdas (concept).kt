

/*

    High Level functions :

    In kotlin we have functions that accepts functions as a parameter . so instead of passing a string or integer
    we can simply pass a function as a parameter to some other function .
    and then From a function we can also return a particular function
    and also atlast we can have function that can either accept the functions as a parameter and return of function
    as a value so if a function can satisfy any of these three criteria then that function is known as
    High level functions.

    Key Points :

    .Can accept function as parameter
    .Can return a Function
    .Or Can do both


    Lambdas :
    . It is just a function without name.


    How to define a lambda expression :

    use the curly braces open and close and then you have to define a variable let's say let's call it 's'
    now follow by dash and arrow  and then the body
    e.g { s -> println(s) }
    now whatever we have written inside these two curly braces are actually the lambda function or expression.
    so the lambda expression is nothing but just a function .
    now what do we call it as a function now just because this({ s -> println(s) }) is the function without any name.

    now inside curly braces .
    s is actaully a parameter and then right after this operator of arrow you will find the body of the method.



    lambda exoression can also be assigned some variables
    e.g  val mylambda : (Int) -> unit = { s : Int -> println(s) }

    Acha is example me hum ne dekha k humne aik variable pass krwaya mylambda name ka or ussay parameter dia and print
    krdi body ab according to baki variables hum jesa k define krtay hian k string hai ye int ha ya etc
    ixi trah humne b idr aese e kia phle dekha parameter kix type ka hia uxay bracket me likh dia then arrow and
    check krna ab k humain return me kia millay ga Int , float , string ya unit .
    in this case humain return me milay ga unit so thats why humne unit likha hua....

    and this example completes our statement as lambda.


    fun addTwoNumber ( a : Int , b : Int , action : (Int) -> unit)
    this is the high level function because ix me function ko as a parameter le rhay hian...
    

 */