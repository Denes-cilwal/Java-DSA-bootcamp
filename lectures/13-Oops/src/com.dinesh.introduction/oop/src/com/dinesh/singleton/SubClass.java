package oop.src.com.dinesh.singleton;

import oop.src.com.dinesh.accessControl.A;

public class SubClass extends A{

    public SubClass(int num, String name, int marks) {
        super(num, name, marks);
        Object Object; // how you are able to use this since java does not allow multiple inheritance public class SubClass extends A , Object => it is doing internally
    }

    public static void main(String[] args) {
        A obj = new A(45, "Dines", 98);
        // int n = obj.marks; // has protected access and only sub-class can access it, not parent class
        /*
        // A does not know what above things are using it since it is parent class
        // base know what parent is
        // protected means only subclass can access it
        // But A is like A only // just like public class SubClass extends A = public class SubClass
        /*
        A subjClassObj =  new A(12, "Gb", "");
        String name = subjClassObj.name;
         */

    }
}

class SubSubclass extends SubClass {
// sub subclass can extend modifier
    public SubSubclass(int num, String name, int marks) {
        super(num, name, marks);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Dines", 98);
        int n = obj.marks;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name, int marks) {
        super(num, name, marks);
    }

    public static void main(String[] args) {

        SubClass2 obj = new SubClass2(45, "Dinesh", 98);
//        int n = obj.num;
        int marks = obj.marks;
        System.out.println(marks);
    }
}



