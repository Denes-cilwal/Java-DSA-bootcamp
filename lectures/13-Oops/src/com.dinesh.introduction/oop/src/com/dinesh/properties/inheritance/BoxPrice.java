package oop.src.com.dinesh.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost =  -1;
    }

    BoxPrice(BoxPrice other){
        super();
        this.cost =  -1;
    }



    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);  // super class properties pass like this
        this.cost = cost; // base class properties access this
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
