package oop.src.com.dinesh.singleton;

public class Singleton {
    // it just classes where only one object is allowed to create
    // when we create only 1 obj, you should not allow anyone  call construct
    // everytime constructor is called new object is created
    // you task is to avoid calling constructor

//    private int num = 0;
    // private means it will be used in this class only cannot be accessed from main method as well
    private Singleton(){} //  Private constructor ensures no one else can create a new object of Singleton


    // returning only single instance
    // after first time object is created object is created here which is pointing to obj in main class
    private static Singleton instance;

    // create a function that gives only single instance
    public static Singleton getInstance() {
        // why static here, because class is accessing ti
        // check whether 1 obj is created or not
        // you're accessing the getInstance() method directly on the class, not on an instance.
        // This is possible because the method is static.
        if (instance == null){
            instance =  new Singleton();
        }
        return instance;
    }
}
