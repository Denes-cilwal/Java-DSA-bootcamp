package oop.src;

public class Main {
    public static  void main(String[] args) {
        // case : I - create a data type that stores 5 roll no's

        // to store 5 roll no you can create array data structure

        int[] numbers = new int[5];

        // store 5 name
        String[] names =  new String[5];

        // create a data type to store data of 5 student , now the complexity arises here
        // what are the data types included for student

        // data of 5 students : {roll no , name , marks}
        int[] rno = new int[5];
        String[] name = new  String[5];
        float[] marks =   new float[5];
        // data includes all three fields roll no name and marks but all are different
        // I want to create data structure that store all three students that where classes and object concept comes in

        // ---------------------------------********************--------------------------------------------------------

        // A class is named group of function and properties
        // By convention class starts with Cap letter

//        Student[] students = new Student[5];
    
        // just declaring
//        Student students;
//        students = new Student();
        // System.out.println(students); // this is just null


     }

     // create a class , class is like logical construct a template
        // a real life example of Class is Car, using this Car they are creating audi, bmw, swift
        // A class properties like petrol, engine, price are same, but they all differ in value.
        // when you declare object of class you are creating instance(physical) of class.


    // class is logical construct
    // object is physical reality // that is something occupying space in memory (following template and creating physical instances of it).


    class  Student {
         int rno ;
         String name ;
         float marks ;
     }


     // object are stored in heap memory and reference variables in stack memory
     // suppose we have class and three properties, and every object of class will have those properties
     // But how to access students properties ? ? ? ?
     //   -  The ans is using dot operator


    // instance variables -  name of the instance
    // dot operator - linking reference variable with instance variable(outside the method but inside the class).


    // new keywords
    // -  Student student1 ;  // declare reference variable it is not creating object, just reference to object of type Class - just in stack memory
    // new - dynamically allocates memory at run time and returns a reference to it .

//    student student1;
//    student1   = new Student(); // student1 will have reference on it.

    
        // student student1 =  new student();
//         compile time           run time


    // compile time is program is checking where code has error, byte code  to machine code conversion
    // when all this happens, it is run time allocating memory - this is dynamic memory allocation


    // static type language - suppose you have only three properties that is roll no , name , marks
    // now you create object and that object trying to access that properties of class
    // but if you try to access properties that is not present in the class just like kunal.salary
    // then it cant happens, this is why java is called static type language
    // you cant change properties in run time - dynamic type.
    // but dynamic can be done in python language

}
