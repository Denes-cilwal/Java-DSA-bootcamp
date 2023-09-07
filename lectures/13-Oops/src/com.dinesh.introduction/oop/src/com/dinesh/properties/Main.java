package oop.src.com.dinesh.properties;

class StaticOveriden{
    static void display() {
        System.out.println("This is the static method of the Parent class.");
    }

    void show() {
        System.out.println("This is the instance method of the Parent class.");
    }
}

class Child extends StaticOveriden{
    static void display() {
        System.out.println("This is the static method of the Child class.");
    }

    void show() {
        System.out.println("This is the instance method of the Child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        // For static methods, the method of the reference type is called
        StaticOveriden.display();               // Outputs: This is the static method of the Parent class.
        Child.display();                // Outputs: This is the static method of the Child class.

        // For instance methods, true overriding occurs based on the object's runtime type
        StaticOveriden parent = new StaticOveriden();
        StaticOveriden childAsParent = new Child();
        Child child = new Child();

        parent.show();                  // Outputs: This is the instance method of the Parent class.
        childAsParent.show();           // Outputs: This is the instance method of the Child class.
        child.show();                   // Outputs: This is the instance method of the Child class.
    }
}


/*
can be inherited but cannot be overiden
in Java, static methods are associated with the class itself and not with an instance.
 Therefore, when you define a static method with the same name in a subclass,
 it doesn't actually "override" the method in the superclass. Instead, it "hides" it.
 This concept is sometimes referred to as "method hiding" or "shadowing."

 */


/*
  polymorphism cannot be applied to static methods and instance variable [if both have same name it is hiding or shadowing]
   points is field access is determined by the reference type, while method invocation is determined by the runtime type of the object.
 */