package oop.src.com.dinesh.Interface.ObjectCreation;

/*
        In Java, you cannot directly instantiate (create an object of) an interface. This means you cannot do something like this:
        MyInterface obj = new MyInterface();  // This is incorrect and will result in a compile-time error.
        However, you can use an interface reference to point to an object of a class that implements that interface. Here's an example:

*/

public interface MyInterface {
    void myMethod();
}


/*
Interfaces are designed to define the capabilities a class should have,
rather than providing the actual implementation.
When you create an object, you need concrete behavior to back that object's actions.
An interface does not provide any concrete behavior by itself.

 */


/*
In the example above, obj is a reference of type MyInterface, but it points to an object of MyClass,
 which is a concrete implementation of the MyInterface interface.
It's worth noting that using this approach, the reference variable obj can only call methods that are declared in MyInterface,
 even if MyClass has other methods not in the interface. This is a way of achieving polymorphism in Java.

 */
