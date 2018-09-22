

/*
   SingleTon :

            Concept :In kotlin whenever we declare class that we are doing so far we create insatnce for that class
            and than access all the variables and methods but in case of singleton we have  just one instance of the
            class in the whole application.so once we defina a class as singleton then we just have one instance
            and that instance is just created by kotlin internally that is we do not have any control over creating
            the instance of that singleton class.
            We have also "init" block inside the object ..


            Definition: when we have just ONE INSTANCE of a class in whole application.

            Meaning : if class student is declared singleton then we cannot create objects for this class.
                      .there exist only one object for this class by default.
                      .And we cannot create objects like student1 and student2 etc.

            In java we define Singleton by using keyword "Static"
            Such ass we have static variable and static methods present inside a class.
            So in that case static variables and static methods are not a part of the class.they are just part
            of class definition not the objects.

            In Kotlin we cannot declare "static" variables and methods compare to java .
            So we have alternative to that:
            .Declare "object"
            .This creates a Singleton object when programs runs.


     SUMMERIZE PROPERTIES OF "OBJECT".

     When we use keyword 'object'
     . Kotlin internally , creates a class and an object/instance.
     These objecrts :
     .Can have properties, method and initializers
     .Cannot have Constructors.
        .as we cannot create object/instance manually

     ."object" can also have super Class
        .Support Inheritance
 */