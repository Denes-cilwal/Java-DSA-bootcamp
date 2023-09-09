package oop.src.com.dinesh.Interface;




//    In Java 8, a new feature was introduced called default methods for interfaces.
//    This allows an interface to provide a default implementation for methods.
//    This means that classes that implement this interface don't necessarily need to override the method; they'll inherit a default behavior unless they choose to provide their own.
//       Here's the potential problem: if a class implements two interfaces, and both of those interfaces provide a default method with the same signature,
//       the Java compiler cannot determine which default method the class should inherit. This causes a compile-time error.


interface Walk {
    default void action() {
        System.out.println("Walking...");
    }
}

interface Sing {
    default void action() {
        System.out.println("Singing...");
    }
}

/*
class Robot implements Walk, Sing {
    // This will raise a compile-time error because
    // both Walk and Sing have a default method named action()
}
//    In the example above, both Walk and Sing interfaces have a default method called action(). The Robot class, which implements both interfaces, will encounter a compile-time error since it's ambiguous which action() to use.
//
//        To resolve this ambiguity, the Robot class needs to provide its own implementation of the action() method:

*/

class Robot implements Walk, Sing {
    @Override
    public void action() {
        // Choose which action to take or combine them
        System.out.println("Robot action...");
        // If we want to call specific interface's default method:
        Walk.super.action();
    }
}
   //  By overriding the action() method in Robot, we've resolved the ambiguity. If we want to call a specific interface's default method, we can do so using the InterfaceName.super.methodName() syntax, as shown with Walk.super.action() in the example.





