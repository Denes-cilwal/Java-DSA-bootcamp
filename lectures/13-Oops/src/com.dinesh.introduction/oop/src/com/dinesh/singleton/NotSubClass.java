package oop.src.com.dinesh.singleton;

import oop.src.com.dinesh.accessControl.A;

public class NotSubClass {
    public static void main(String[] args) {
        A obj =  new A(1,"", 98);
        // obj.name // this is diff package not accessed in the not subclass default
        obj.getNum(); // can be accessed using getter functions



    }
}
