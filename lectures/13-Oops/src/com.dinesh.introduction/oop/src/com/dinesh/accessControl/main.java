package oop.src.com.dinesh.accessControl;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        A obj  = new A(10, "Dinesh", 98);
        /*
         Need to do few things
         1. access the data members
         2. modify the data members
         */

        /*
        ArrayList<Integer>  list = new ArrayList<>();
        list.DEFAULT_CAPACITY;  // cannot access as DEFAULT_CAPACITY is private
        */


        // obj.num   // num has private access how to access then using getters and setters

        obj.getNum();
        String naam = obj.name;
        System.out.println(naam); // can access no modifiers | variable inside the same package

        // protected inside same package can be accessed
        System.out.println(obj.marks);

    }
}

/*
   protected - when you only want
   no modifier - you use no modifier, when you do not want to use outside that particular package
   private - you use private so that member can be accessed only with  class or that file
   public - when you want to access anywhere, but it is dangerous


 */