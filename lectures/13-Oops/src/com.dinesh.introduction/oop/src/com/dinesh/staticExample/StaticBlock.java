package oop.src.com.dinesh.staticExample;

// this is demo to show initialisation of static varibales
public class StaticBlock {

    // all static varibales and static method are accessible using StaticBlock not its object
    static  int a = 4;
    static  int b ;

    // will only run once, when first obj is created
    // i.e. when class is loaded for first time and when first object is created
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj  = new StaticBlock(); // when ever class is loaded , it will run all above properties
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2  = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
