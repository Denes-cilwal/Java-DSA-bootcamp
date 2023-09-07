package oop.src.com.dinesh.properties.inheritance;

public class BoxWeight extends Box{
    // inheritance
        double weight;
        double color;


    public BoxWeight() {
        this.weight = -1;
    }


    // taking other object
    BoxWeight (BoxWeight other){
        super();
        weight =  other.weight;

    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight =  weight;


    }



    // can static method be overridden ?
    // @Override
    // never been called , cannot override them even though you can inherit
    static void  greeting(){
        System.out.println("Hey I am in box weight class,Greeting!");
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this ? call the parent class constructor
        // used to initialize value present in parent class becuase intialize happens in parent class not in child class as child class will only be able to access it,
        // but it cannot access the properties of parent class that is private
        // subclass derived m base class
        this.weight = weight;

        // super(l, h, w) // child class cares about what base class contains but base class does not care about parent class
        // super.weight = weight;
        // if you can use "this" keyword why use super keyword to access w
        // the reason is simple you can access super keyword if both child and base class have same property
    }
}
