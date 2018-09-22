

/*
   Abstract class :

   A class which is declared with abstract keyword is known as abstract class. An abstract class cannot be
   instantiated. Means, we cannot create object of abstract class. They also can have a mixture of fuctions declared
   with or without implementation.

   ->All the abstract method are open in nature.
   ->Classes are abstract in nature.
   ->The Role of abstract class is to just provide set of methods and properties.
   ->Abstract Method have no body when declared.
   ->Abstract Property cannot be initialized when declared

   Conclusion :
   You cannot create instance/object of ABSTRACT Class.
   You need to override ABSTRACT methods, properties inside the derived class.

 */



/*

    When we improved our code by making our person class open and inheriting it . We actually came across the
    situation where you would usually use abstract classes instead of just open class. And it really depends on
    whether you want to allow creating object from the Person class itself.or only from its child classes.
    So with this particular solution where the person class is simply just open class we could still create object
    from it .

    But in some cases you may not want this .
    because for example you just extracting parent class to avoid code duplication.


 */
