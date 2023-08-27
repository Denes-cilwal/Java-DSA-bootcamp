package oop.src.com.dinesh.properties.inheritance;

import oop.src.com.dinesh.packages.packages.a.Greeting;

public class Box {
    double l;
    double h;
    double w;

    double color;
    private int age ; // data hiding


    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box( double side){
       // super(); // but Box is not derived from any class how can we use super
        //  because super() is pointing to object class
        // object-class is main class from where every other class is derived
        // every single class you create is referring to object class
        // super means directly above it
        this.w =  side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.h = l;
        this.l = h;
        this.w = w;
    }

    public int getAge() {
        // hiding age detail under class Box under single unit - encapsulation of data
        return age;
    }

    // can static method can be over-ride?
    // the method from parent class will run no matter the object determines which method to call because static method  is never dependent upon the object
    // that is the reason static method in the child class is not being called
    static void  greeting(){
        System.out.println("Hey I am in box class,Greeting!");
    }

    public  void information(){
        System.out.println("Running the box");
    }
}
