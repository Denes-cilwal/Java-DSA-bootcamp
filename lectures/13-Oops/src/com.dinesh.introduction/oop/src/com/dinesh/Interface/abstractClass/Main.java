package oop.src.com.dinesh.Interface.abstractClass;

/*
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // You instantiate the subclass (Dog), not the abstract superclass (Animal).
        myDog.makeSound();      // Outputs: Woof! Woof!
        myDog.breathe();        // Outputs: Breathing...
    }
}

*/

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
        myCat.breathe();
    }

    /*
    using an Animal reference for both myDog and myCat, you can use the same reference type to point to different concrete subclass objects.
    When you call the makeSound method, Java determines at runtime which version of the method to invoke based on the actual object type (this is called dynamic method dispatch).
    It's a fundamental aspect of object-oriented programming in Java.
     */
}

/*
Using the superclass type (or interface type) for the reference:

Animal myDog = new Dog();
Use-case and benefits:

Polymorphism: This approach allows for more general code that can handle any subclass of Animal (like Dog, Cat, etc.). For instance, if you have a method that operates on an Animal, you can pass in any Animal subclass without concern for its specific type.
Flexibility: If you ever change the actual object type that myDog refers to, the reference type doesn't need to change. For example, you can reassign myDog to a new Cat() later if needed, without changing the type of the reference variable.
java
public void makeItTalk(Animal animal) {
    animal.makeSound();
}
Using the specific class type for the reference:

Dog myDog = new Dog();
Use-case and benefits:

Specificity: If you know that the reference will always be of a specific type (in this case, Dog), and you want to call methods or access fields specific to that type, it makes sense to use the specific type for the reference.
Clarity: When someone reads the code, they immediately know the specific type of the object, which can be useful for understanding the code's intention.
Access to Subclass-Specific Methods: If the Dog class has methods that aren't present in the Animal class, you'll need a Dog reference to invoke those methods without casting.
In summary:

Use the superclass (or interface) type for your reference (e.g., Animal myDog) when you want to write more generic, flexible code that can handle multiple subclasses. This is particularly valuable when writing methods that can accept a wide range of object types or when you're working within frameworks or libraries that expect this level of generality.
Use the specific class type for your reference (e.g., Dog myDog) when you want to access subclass-specific features or when you're certain about the specific type of object you'll be working with. This can make the code more clear in terms of its intentions and can avoid the need for type casting in some scenarios.

 */