package oop.src.com.dinesh.introduction;

public class WrapperClass {
    public static void main(String[] args) {
        // case - I
        int a = 10;    // it is only properties
        Integer num = 45;  // it is created or treated as object => num.toString() - Integer is a class - wrapper here and num variable is accessing it methods
        swap(10, 23); // this will not swap because in java there is only called pass by value, no such called pass by reference



        // STILL NOT SWAPPED, although it is Class pass by object
        // this is due to final
        Integer x = 20;
        Integer y = 30;
        swap1(x , y);
        System.out.println(x );
        System.out.println(y );


        final  int bonus = 3; // always initialize when declaring it
        // bonus =  4; // Cannot assign a value to final variable 'bonus' - cannot change

       final  A dipesh = new A("David");
       dipesh.name =  "other name"; // this is allowed

        // when a non primitive is final , you cannot re-assign it
       //  dipesh = new A("new object"); // Cannot assign a value to final variable 'dipesh'


        A obj;
        for (int i = 0; i < 1000000000; i++) {
            // obj is destroyed and new value is pointed
            obj =  new A("random name");

        }
    }

    static  void  swap(int a, int b){
        //  this a and b is in scope only,
        //  also pass by value
            int temp  = a;
            a = b;
            b = temp;
    }

    // this is passing reference variable, still not swapping
    static  void  swap1(Integer a, Integer b){
        // will it swap
        int temp  = a;
        a = b;
        b = temp;
    }




}



/*
final is keyword preventing data to be modified , just like making constant in golang
final variable has to been always initialized
while declaring it.
final in primitives vs non-primitives,

final student dnes = new Student()
dnes.name =  "new name"  // this is valid but as discussed earlier we cannot change value so this is for non-primitives
dnes =  other object (X not valid)
 */


class  A {
    final  int num = 10;
    String name;

    public A(String name) {
        // shortcut ^ + return
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }

}

/*
 garbage collection is automatically handled by java whenever it is free
 // we cannot destroy object manually,
 // but we can , what to do after object is destroyed

 */