package oop.src.com.dinesh.Interface.abstractConcrete;

// Concrete class
public class Dog extends Animal {
    // Concrete implementation of the abstract method
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}