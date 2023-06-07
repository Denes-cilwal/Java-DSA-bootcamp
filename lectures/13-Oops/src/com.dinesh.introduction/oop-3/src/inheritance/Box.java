package inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;

    Box(){
        super();// box class is not derived from any other class, how are we able to keep super constructor here
        // because super() is also derived from object() class
        this.l =  -1;
        this.h =  -1;
        this.w =  -1;
    }

    // cube
    Box(double side){
        this.w =  side;
        this.h =  side;
        this.l =  side;
    }


    Box(double l, double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h  =  old.h ;
        this.l =  old.l;
        this.w =  old.w;
    }

    public  void  information(){
        System.out.println("running the box!");
    }

}

