package oop.src.com.dinesh.abstractDemo;

public class Son extends  Parent{
    // Class 'Son' must either be declared abstract or implement abstract method 'career(String)' in 'Parent'


    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        // all the child class must over-ride parent class,
        // because parent class only contains method declaration no body part
        System.out.println("I am going to be a pilot");
    }

    @Override
    void partner(){
        System.out.println("I  love planes");
    }


    @Override
    void divorce(){
        System.out.println("She is having divorce");
    }


    // can we create constructor of abstract class


    @Override
    void greet(){
        System.out.println("normal method of abstract class be overridden");
    }


}
