package oop.src.com.dinesh.abstractDemo;

 public abstract class  Parent {

    // llegal combination of modifiers: 'final' and 'abstract' = final public abstract class  Parent [if I keep final infront of abstract class because I want that to be inherited]
    // 1st
    // abstract class method is child class responsibility, not the parent class , parent class just defines it
    // all child class must override it to use abstract method of parent class
    // abstract void career (String name);
    // to use abstract method class must be abstract
    // but why are we doing this ? because it looks much cleaner
    // if function in the parent needs to override just define it abstract
        abstract void career ();
        abstract void partner  ();

        abstract void divorce();


        // can we have variable abstract yes
        int age;
        final  int VALUE;

        // can we use static property here check that




    // can we create abstract constructor - it is allowing to create constructor

    public Parent(int age) {
        this.age = age;
        VALUE =  32567;
    }

    /* abstract Parent() ; no we cannot create abstract Parent() constructor*/



    // can we create static method on abstract method - yes because there will be no object for abstract classes

    static void hello(){
        System.out.println("take");
    }


    void  greet(){
        System.out.println("I am normal function");
    }
    // abstract contains normal methods and can be overridden
}
