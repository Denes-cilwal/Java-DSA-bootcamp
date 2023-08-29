package oop.src.com.dinesh.abstractDemo;
/*
In Java, static methods are associated with the class, not with an instance (or object) of the class.
This is why we can call them without creating an instance of the class. Because they are associated with the class and not an instance, the concept of overriding (which pertains to instance methods and behavior) doesn't apply to them.

Here's why static methods cannot be overridden:

Method Binding: Instance methods are bound at runtime (dynamic binding), and this allows Java to use a mechanism called late binding or method overriding.
On the other hand, static methods are bound at compile time (static binding).
 So, the method binding is done based on the reference type, and there's no way to determine which version of a static method will be called just by looking at the reference alone during runtime.

Polymorphism: Overriding supports polymorphism, which allows us to reference an object by its superclass and execute the overridden method in the subclass.
This concept is built around instance methods, and static methods are not part of this polymorphic behavior.

Method Resolution: When you try to put what seems like an "overridden" static method in a subclass, you're not really overriding it. Instead, you're hiding it.
The term for this is method hiding. So, both the superclass and subclass methods can coexist, and the method that gets called is determined by the reference type.

 */

class SuperClass {
    static void display() {
        System.out.println("Static method from SuperClass");
    }
}

class SubClass extends SuperClass {
    static void display() {
        System.out.println("Static method from SubClass");
    }
}

public class StaticmethodOveriden {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.display(); // This will print "Static method from SuperClass", not from SubClass because static method cannot be override
    }
}
