package oop.src.com.dinesh.Interface.ObjectCreation;

public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        // this is concrete implementation backing that object's actions.
        System.out.println("Method implemented in MyClass");
    }
}

