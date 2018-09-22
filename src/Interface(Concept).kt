

/*

   Interface : Classes that have methods without bodies.

               Ineterface in not a class it is something like a listner that you want some service such as on Click of
               button something should happen and on touch of keyboard something should happen so in that case the
               listner is actually the interface. You want some short term or temporary service so in that case we
               create a interface.
               For example in android suppose someone click on a button so onclick of a button something
               should happen right so we implement the onClick method in case of android. so that is the main
               purpose of interface in case of kotlin as well.

               -> Interface cannot be instantiated (never make object)
               -> Whatever you Declare inside the interface is actually abstact and also open in nature.
               -> In case of interface nothing is final. everything is open in nature.



    Why do we need such class :

    Is because you don't a time when we need to use certain feature of a class that can be use anywhere by
    any class.

    That's very important concept so remember
    the interface allows us to create empty functions and then any class can inherit from that or implement the
    interface and then will have to override the message it's going to be forced to implement or override that the
    methods or the functions from our interface class.
    and he's allow us a lot of flexibility because now as you can see here each class that inherits fro input handler
    or interface here can create its own implementation of that function.
    That's very powerful  because it allows us to create a very extensible classes.


 */