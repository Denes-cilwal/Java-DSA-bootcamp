package oop.src.com.dinesh.accessControl;

public class A {
    private int num;   // data is hiding for security, and it means it can be accessed anywhere inside this class but not from outside even if it is main class
// but it can be accessed by getters and setters
    String name;
    // Default one - if no modifier given then, can be accessed inside class,
    // inside same package, inside same package subclass
    // try to access name in different singleton package , won't be able to access;

    protected int marks;
    int[] arr;


    // using getters to access this private and since this is public it can be accessed in the main function
    public int getNum() {
        return num;
    }

    public A(int num, String name,int marks) {
        super();
        this.num = num;
        this.name =  name;
        this.marks =  marks;
    }
}
