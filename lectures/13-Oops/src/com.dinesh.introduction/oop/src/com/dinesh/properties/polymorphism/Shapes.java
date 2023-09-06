package oop.src.com.dinesh.properties.polymorphism;

public class Shapes {
/*
    final void area(){
    if you don't want to override in sub class use final keyword
        System.out.println("I am in shapes");
    }

*/
    void area(){
        System.out.println("I am in shapes");
    }
}
/*
java
Copy code
public class Circle extends Shapes {
    @Override
    void area() {  // This will result in a compilation error
        System.out.println("Area of circle");
    }
}
The compiler will throw an error because you're trying to override a final method, which is not allowed in Java.
In essence, the final keyword for methods is a way for the original class designer to say, "This method's functionality is set in stone and should not be changed by any subclasses
 */

/*
method overriding itself is a runtime concept, especially when referring to the dynamic method dispatch mechanism that determines which overridden method to call during execution.

However, the process of ensuring that the method signatures match, and that you're not violating any Java rules (like trying to override a final method), happens at compile time.

Let's clarify this:

Compile Time:
The Java compiler checks the method signatures to ensure that overriding is correct. The signature includes the method name and the parameter list.
The compiler also checks for violations like:
Attempting to override a final method.
Reducing the visibility of an overridden method (e.g., changing a public method in the superclass to protected or private in the subclass).
Changing the return type to a type that's not covariant.
Throwing new or broader checked exceptions.
If any of these rules are violated, the compiler will throw a compilation error.

Runtime:
The JVM uses the vTable (or equivalent mechanism) to determine which overridden method to call for an object.
This dynamic method dispatch ensures that the method version of the actual object type (not reference type) is called.
So, in the case of the final method, when you attempt to override it, the compiler sees this as a direct violation of Java's rules and throws an error at compile time, not runtime.
 */

/*

 */