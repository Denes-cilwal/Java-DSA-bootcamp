package oop.src.com.dinesh.properties.encapsulation;

import java.util.ArrayList;

public class Main {
    // encapsulation means wrapping up the implementation of data members and methods inside the class
    // hiding the data under single unit


    // what is abstraction : hiding unnecessary details and showing only valuable information
    // for example :- Let say you have a car, put in the key and start the car, how that car is being started when you put the key(how the engine start, how petrol pumps)
    // Do you need any of this mechanics of car to start the car?
    // No you just need key

    public static void main(String[] args) {
        System.out.println(""); // this is example of abstract data type // abstraction // how println is working we do not care so that is abstraction
        ArrayList  list = new ArrayList(); // we are using ArrayList but do you care how it is defined and how it is working internally I do not care
       // list.get() // you are able to access and modify this using some method but how these are working internally I do not care () its internal mechanism that is abstract data type
    }
}



