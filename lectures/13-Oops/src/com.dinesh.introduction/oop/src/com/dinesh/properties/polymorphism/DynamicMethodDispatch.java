package oop.src.com.dinesh.properties.polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Outputs: Dog barks
        myCat.sound();  // Outputs: Cat meows
    }
}
/*
    Dynamic Method Dispatch
        In Java, when you have a superclass and one or more subclasses, and both superclass and subclass have a method with the same name (overridden method), then Java has to decide which method to call when that method is invoked using a reference. The mechanism that Java uses to decide this during runtime (when the program is executing) is called Dynamic Method Dispatch.

        How It Works:
        The type of reference (whether it's a superclass or subclass reference) determines what methods and fields are accessible.
        The type of the actual object (whether it's an instance of the superclass or subclass) determines which version of the method is called.
        Simple Example:
        Imagine a scenario:
      Even though myDog is a reference of type Animal, the actual object it points to is a Dog. So, when you call myDog.sound(),
     Java looks at the actual object (which is Dog) and calls the Dog class's sound method.
     The same goes for myCat.
     This decision of which method to call (Animal's sound method or Dog's sound method or Cat's sound method) is made at runtime, based on the actual object.
     This runtime decision-making process is the Dynamic Method Dispatch in action.
 */

/*
 When you compile your Java code,
 the Java compiler generates bytecode, which is a set of instructions for the Java Virtual Machine (JVM).
 The JVM uses this bytecode to execute your program.
  The bytecode retains information about the objects and their class hierarchy, which is essential for polymorphism.

The Role of the Method Table (vTable)
For every class,
the JVM maintains something called a method table or vTable (virtual table).
This table holds the addresses of all the methods defined in that class.
If a method is overridden in a subclass,
the address in the vTable for that method points to the overridden method of the subclass,
not the method from the superclass.

Runtime Resolution Process:
Object Creation: When you create an object, say of type Dog (from our previous example), the JVM allocates memory for that object. This memory contains an implicit reference (or pointer) to the method table of its class.

Method Invocation: When you try to invoke a method using a reference (e.g., myDog.sound()), the JVM looks at the type of the actual object that myDog is pointing to. Remember, myDog might be an Animal reference, but it's pointing to a Dog object.
Looking Up the vTable: The JVM accesses the vTable for the Dog class (because myDog is pointing to a Dog object). It then finds the address for the sound method and executes the method from there.

Because this resolution process happens when your program runs (not when it's compiled), it's called runtime polymorphism.
Key Point:
The JVM doesn't need to figure out which method to call by scanning through your classes during runtime. Instead, it simply follows the pointers in the vTable, which already have the information about which method addresses to go to. This makes the method resolution process at runtime efficient.
 */

/*
visually represent the concept of Dynamic Method Dispatch and how it works in Java.

plaintext
Copy code
+--------+            +----------------+
| Animal |            | vTable for     |
| +sound()----->------| Animal         |
+--------+            | +sound()       |
                      |   -> Animal's  |
                      |      sound     |
                      +----------------+

          |
          |
          V

+--------+            +----------------+
|  Dog   |            | vTable for     |
| +sound()----->------| Dog            |
+--------+            | +sound()       |
                      |   -> Dog's     |
                      |      bark      |
                      +----------------+

          |
          |
          V

    +-------+         +----------------+
    | myDog |-------->| vTable for     |
    +-------+         | Dog            |
                      | +sound()       |
                      |   -> Dog's     |
                      |      bark      |
                      +----------------+
Description:

The classes Animal and Dog each have a method called sound.
They each have their own vTables.
In the vTable for Animal, the sound method points to Animal's sound.
In the vTable for Dog, the sound method points to Dog's bark.
The myDog object, which is an instance of Dog, refers to the vTable for Dog.
When you invoke the sound method on the myDog object, the JVM looks into the vTable for Dog and finds that the sound method should execute Dog's bark.
 */