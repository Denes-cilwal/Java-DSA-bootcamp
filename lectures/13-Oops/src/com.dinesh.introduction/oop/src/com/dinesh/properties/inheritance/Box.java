package oop.src.com.dinesh.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    double color;
    private int age ;


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


    public  void information(){
        System.out.println("Running the box");
    }
}
