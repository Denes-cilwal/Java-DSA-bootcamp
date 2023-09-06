package oop.src.com.dinesh.properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return  a + b;
    }

    double sum(double a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return  a + b;
    }

    public static void main(String[] args) {
        Numbers obj  = new Numbers();
        obj.sum(2, 3);
        obj.sum(1,2,4); // here at compile time you will know which to run because you have pass 4 parameters
        // obj.sum(4,5,6,7); // There is no method sum in the Numbers class that takes 4 numbers

        /*
         The memory being allocated at run time ,
         but checking and everything , which method to run happens at compile time(static polymorphism, early binding)
         */


        /*
         runtime/ Dynamic polymorphism - achieved by method overriding
            - parent and class have same method name but return and input type is different
         */



    }
}
