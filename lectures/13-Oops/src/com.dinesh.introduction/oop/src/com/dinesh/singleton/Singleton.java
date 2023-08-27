package oop.src.com.dinesh.singleton;

public class Singleton {
    // it just classes where only one object is allowed to create
    // when we create only 1 obj, you should not allow anyone  call construct
    // everytime constructor is called new object is created

    private int num = 0;
    // private means it will be used in this class only
    private Singleton(){}

    private static Singleton instance;
    public static Singleton getInstance() {
        // check whether 1 obj is created or not
        if (instance == null){
            instance =  new Singleton();
        }
        return instance;
    }
}
