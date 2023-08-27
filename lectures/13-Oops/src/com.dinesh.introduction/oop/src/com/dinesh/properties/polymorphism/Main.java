package oop.src.com.dinesh.properties.polymorphism;

public class Main {
    // polymorphism  = poly(many) + morphism(ways to represent) single entity or item
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        // what it is able to access it determined by the type of the reference and which one to access or which version to access it determined by the type ogf object
        //  Shapes circle =  new Circle()
        //  we know Shapes can access sum() method but which version to  access is determined by Circle object
        Square square  = new Square();


        // overriding concepts
        shape.area();
        circle.area();  // depends upon which is called
        square.area();
    }


    /*
    How do we know which is called
    if the type is parent class and object is of child class
    Shapes circle =  new Circle()



    Parent obj = new Child();
    here which method will be called depends on child ();
    this is known as Upcasting => the entire is called overriding that's how overriding works ?



    How Java will know which method to run ? memory management => the object type determines which one to access

    how java determines this ?
    The java determines with something called Dynamic method dispatch - it is just a mechanism that a call to method is resolved at runtime rather than compile time
     - when it is actually calling it the run time
     */

}


/*
There are two types of polymorphism in Java:

Compile-time (or static) polymorphism: This is achieved through method overloading.
Runtime (or dynamic) polymorphism: This is achieved through method overriding and is the focus of your code.
Method Overriding and Upcasting
Method overriding means defining a method in a child class that already exists in the parent class with the same signature (name and parameters). The child class method must have the same return type or a subtype of the return type of the parent class overridden method.
When you create an object of the child class and assign it to a reference of the parent class (upcasting), the overridden method of the child class is called. This is because the type of object (child class) determines which method to call, not the type of reference (parent class).

For example:
Parent obj = new Child();
obj.someMethod();
If someMethod is overridden in Child, then the Child class's version of someMethod will be executed.

 */


/*
Dynamic Method Dispatch
Dynamic method dispatch is a mechanism in Java that determines which method to call at runtime (not compile time).
Java uses an internal reference (like a pointer) to the actual object to determine which version of an overridden method to call.
The type of the reference variable doesn't matter; what matters is the actual object type.

Your Code
In your code:

java
Copy code
Shapes shape = new Shapes();
Circle circle = new Circle();
Square square = new Square();

shape.area();
circle.area();
square.area();
You have three objects: shape, circle, and square. When you call the area method on each object:

For shape, the area method of Shapes class will be called.
For circle, the area method of Circle class will be called (assuming Circle overrides this method from Shapes).
For square, the area method of Square class will be called (assuming Square overrides this method from Shapes
 */