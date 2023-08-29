package oop.src.com.dinesh.Interface.ObjectCreation;

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyClass(); // This is correct.
        obj.myMethod();  // Outputs: Method implemented in MyClass
    }
}