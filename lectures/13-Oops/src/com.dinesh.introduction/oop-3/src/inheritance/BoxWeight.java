package inheritance;


public class BoxWeight extends Box{
    double weight;
    BoxWeight(){

    this.weight =  -1 ;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this ? call the parent class constructor

        // used to initialize values present in parent class
        this.weight = weight;
        this.l =  l;
        this.h = h;
        this.w =  w;

//        super(l, h, w); - call super first in constructor body as parent class donot care what child class contain
        // but child class do care what parent class contains

        // super.weight = weight; // if you can use "this" keyword why use super keyword to access w
        // the reason is simple you can access super keyword if both child and base class have same property
    }


}
