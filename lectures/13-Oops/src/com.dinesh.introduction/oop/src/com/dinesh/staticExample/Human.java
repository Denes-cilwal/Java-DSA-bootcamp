package oop.src.com.dinesh.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static  void  message() {
        System.out.println("hello world");
       //  System.out.println(this.name); // we cannot use this inside static method which is obvious
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary =  salary;
        this.married = married;
        // this.population += 1;  // vvip -  if it is not dependent upon objects then why we are accessing using this keyword => true we need class name to access static varibale
        Human.population +=1;
        Human.message(); // static method
    }


}

/*
 Suppose we have some property whose value is same for all objects of class
 Let say Human population , population is same for all objects that means it does not depend upon objects, independent upon objects
 such properties not related to object but common to all obj are called static varibales

 point-1 : without using or reference object of class , we can create variables that is static
 point-2 : we can create static method as well one example is psvm because we need  a condition to access without creating object of that class
 // if main is the first thing we have to run, and if we do not keep static then how can we execute the function then?
 // before any object is created it should allow me to run the class



 */


