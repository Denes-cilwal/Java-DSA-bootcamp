package oop.src.com.dinesh.abstractDemo;

public class Son extends  Parent{
    // Class 'Son' must either be declared abstract or implement abstract method 'career(String)' in 'Parent'


    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a pilot");
    }

    @Override
    void partner(){
        System.out.println("I  love planes");
    }


    // can we create constructor of abstract class




}
