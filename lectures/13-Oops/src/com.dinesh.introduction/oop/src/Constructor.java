package oop.src;

public class Constructor {
    public static void  main(String[] args){
    Employee1 emp1  = new Employee1();
    // Employee1() is a special function inside the class
    // But we did not create any function inside the class
        // but where is this Employee1()  being called - this is called default
        // Constructor is a special function that runs when you create object, and it allocates
        // some varibales

        // why we want to make our own constructors and bind the args to objects

        System.out.println(emp1.name);
        System.out.println(emp1.roomNo);
        System.out.println(emp1.salary);
        emp1.changeName("TechTa");
        emp1.greeting();
//        emp1.changeName("TechTa");


      Employee1 emp2 = new Employee1(13,"david" , 234567f);
        System.out.println(emp2.name);
        System.out.println(emp2.roomNo);
        System.out.println(emp2.salary);


     Employee1 random  = new Employee1(emp2);
        System.out.println(random.name);
        System.out.println(random.roomNo);
        System.out.println(random.salary);
    }

    Employee1 random2  = new Employee1();
}

class Employee1 {
    // instance variables - inside class outside method
    int roomNo;
    String name;
    float salary ;

    // we need a way to add the values of the above properties obj by obj
    // we need one word to access every object.
    /*
    Employee1(){
        // this is constructor
        // this run when you create new obj

        this.roomNo means internally    => emp.roomNo means internally taking place
           emp1.name = "";
        emp1.salary = 23445667.89;

    }
     */

   void greeting(){
       // this is doing emp1.name == this.name
       // self keyword in python == this
        System.out.println("Hello! My Name is " + this.name);


    }

    // method

    void changeName (String newName){
        this.name =  newName;
    }
    // constructor call - default
/*
    Employee1(){

        this.roomNo = 13;
        this.name = "des";
        this.salary = 23445667.89f;

    }
*/
    // parameterized
    Employee1(int newNo, String newName, float newSalary){
        this.roomNo = newNo;
        this.name = newName;
        this.salary = newSalary;
    }

    // same method name but functionality method overloading
    // constructor overloading
    // polymorphism

    Employee1(Employee1 emp3){
       this.name =  emp3.name;
       this.roomNo = emp3.roomNo;
       this.salary = emp3.salary;
    }



    // calling constructor from another constructor
    Employee1(){
        this(10, "ghu",100.0f );
        // equivalent to Student(10, "ghu",100.0f ) =
        // internally => new Employee1(13,"david" , 234567f);
    }

}
// this refers to what object you are referring to
// primitives are not objects, so they are not stored in heap they are stored in stack
// that's why we do not use new keyword for primitives and stack memory allocation is fast
// that's why java is slow heap memory objects
// python is also slow


//    Employee1 emp1  = new Employee1();
//emp2  = emp1
// change by emp1 also changes emp2 as pointing to same object in heap