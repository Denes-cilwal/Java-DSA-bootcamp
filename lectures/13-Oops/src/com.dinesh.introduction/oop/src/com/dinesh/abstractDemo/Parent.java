package oop.src.com.dinesh.abstractDemo;

public abstract class Parent {

    // abstract class method is child class responsibility, not the parent class , parent class just defines it
    // all child class must override it use abstract method of parent class
    // abstract void career (String name);
    // to use abstract method class must be abstract
    // but why are we doing this ? because it looks much cleaner
    // if function in the parent needs to override just define it abstract
        abstract void career ();
        abstract void partner  ();

        int age;
        final  int VALUE;

        // can we use static property here check that

    public Parent(int age) {
        this.age = age;
        VALUE =  32567;
    }


    // can we create abstract constructor
    /* abstract Parent() ; no we cannot create*/



    // can we create static method on abstract method

    static void hello(){
        System.out.println("take");
    }


    // abstract contains normal methods and can be override
}
