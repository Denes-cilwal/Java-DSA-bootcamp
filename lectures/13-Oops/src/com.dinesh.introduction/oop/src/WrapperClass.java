package oop.src;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
//        num.toString() - Integer is a class - wrapper here and num variable is accessing it methods
        swap(10, 23); // this will not swap because in java there is nothing called pass by value



        // STILL NOT SWAPPED, although it is Class pass by object
        // this is due to final
        Integer x = 20;
        Integer y = 30;
        swap1(x , y);
        System.out.println(x );
        System.out.println(y );

//        final int bonus = 2;
//        bonus  =  4; // cannot modify
    }

    static  void  swap(int a, int b){
        // this a and b is in scope only,// also pass by value
            int temp  = a;
            a = b;
            b = temp;
    }
    static  void  swap1(Integer a, Integer b){
        // will it swap
        int temp  = a;
        a = b;
        b = temp;
    }


}


// final is keyword preventing data to be modified , just like making constant
// final variable has to been always initialized
//  while declaring it.


// final in primitives vs non-primitives