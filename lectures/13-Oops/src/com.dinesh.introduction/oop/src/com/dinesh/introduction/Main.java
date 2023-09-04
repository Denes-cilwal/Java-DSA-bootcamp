package oop.src.com.dinesh.introduction;

import java.util.Arrays;

public class Main {
    public static  void  main(String []args) {

    /* done
     store 5 roll no
    int[] numbers = new int[5];
    // store 5 names
    String[] names = new String[5];

  int[] numbers =  new int[5];



     */

    /*
    Let say I want to store data of 5 students : {roll no, name, marks}
    create a data type to store data of 5 student , now the complexity arises here
    what are the data types included for student

    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
    */


    /*
    the problem here is I used separate data structures to store data here, but
    I want to manage it in the single data structure
    storing 5 people different data in single structure - that where Class concepts comes
    A class is named group of function and properties
    By convention class starts with Cap letter
    */


    /*
    Student dinesh ;   // dinesh here is ref variable that has  type Student which we create on own
    System.out.println(Arrays.toString(dinesh)); // null only declare

    student student1 =  new student();
    compile time           run time
    compile time is program is checking where code has error, byte code  to machine code conversion
    when all this happens, it is run time allocating memory - this is dynamic memory allocation
    */


    // create object of student
    // new does dynamic memory allocation
    Student student1 ;
    student1 = new Student();

    /*
    assigning individually
    student1.marks = (float) 93.8;
    student1.rno = 1;
    student1.name = "dunes";
     */

    System.out.println(student1.name);
    student1.greeting();
    student1.changeName("burno");


    // passing object to another
    Student Student2 = new Student(7, "Luis", 78);
    System.out.println(Student2);

    /*



     constructor overloading case here - same name diff parameters
     constructor have no return type
     Distinct Role: The primary role of a constructor is to create and initialize a new instance of a class.
                    By not having a return type, it is clearly distinguished from regular methods, which are designed to perform actions and possibly return values.

     No Ambiguity: If constructors had return types, there could be confusion between a constructor and a regular method.
                   This distinction ensures that there's no ambiguity.

    Implicit Return: In a way, a constructor does "return" something: an instance of the class. However, this return is implicit.
     When you use the new keyword with a constructor, it's understood that an instance of the class is being returned.
     Specifying an additional return type would be redundant and confusing.
    */

        // calling constructor from another constructor
        Student Student3 =  new Student(Student2);
        System.out.println(Student3);

    }






    // create a class


    /*
     create a class , class is like logical construct a template
     a real life example of Class is Car, using this Car they are creating audi, bmw, swift
     A class properties like petrol, engine, price are same, but they all differ in value.
     when you declare object of class you are creating instance(physical existence) of class.
    */


    /*
    object are stored in heap memory and reference variables in stack memory
    suppose we have class and three properties, and every object of class will have those properties
    But how to access students properties ? ? ? ?
    => The ans is using dot operator

    // we cannot access memory location or manipulate in java like pointer in c++
    */

    /*
    static type language - suppose you have only three properties that is roll no , name , marks
    now you create object and that object trying to access that properties of class
    but if you try to access properties that is not present in the class just like kunal.salary
    then it cant happens, this is why java is called static type language
    you cant change properties in run time - dynamic type.
    but dynamic can be done in python language
     */

    /*
     this refers to what object you are referring to
     primitives are not objects, so they are not stored in heap they are stored in stack
    that's why we do not use new keyword for primitives and stack memory allocation is fast
    that's why java is slow heap memory objects
    python is also slow

    Student student1  = new Employee1();
    Student student1  = student1
    change by student1 also changes student2 as pointing to same object in heap
     */



}

// create a class for every single student


class Student {
    int rno;
    String name;
    float marks ;




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
    Student(){
        // we need one word to access every object
        // but what this is referring it refers to ref variable student1
        // this.rno means internally    => student.rno means internally taking place
        /*
        The primary purpose of a constructor is to initialize the newly created object. This can involve setting up initial conditions,
         allocating resources, or simply assigning default or initial values to the object's fields.
         */
        this.name = "tech";
        this.rno = 2;
        this.marks =  98;
    }


    Student(int rno, String name, float marks){
        this.rno =  rno;
        this.name = name;
        this.marks =  marks;
    }

    // constructor overloading - compile time [what to do call upper one or lower one is decided at run time dynamic dispatch]

     Student(Student student2) {
        // returns values by default [] not have to define like other functions
         this.rno =  student2.rno;
         this.name = student2.name;
         this.marks =  student2.marks;
    }


}


