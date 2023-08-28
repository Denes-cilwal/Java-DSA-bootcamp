package oop.src.com.dinesh.singleton;

import oop.src.com.dinesh.accessControl.A;

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


        A accessObj  = new A(10, "Dinesh", 98);
        accessObj.getNum();  // it is accessible

        // but I will try to access default properties
        // accessObj.name;
    }
}
