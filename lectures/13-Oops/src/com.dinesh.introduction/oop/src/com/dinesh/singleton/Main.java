package oop.src.com.dinesh.singleton;

public class Main {
    public static void main(String[] args) {
       //  Singleton obj = new Singleton(); // is not allowed since it is private
        Singleton obj =  Singleton.getInstance();
        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();

        // all 3 ref variables are pointing to just one object
        /*
        Singleton obj =  Singleton.getInstance();
        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();
         */
    }
}
