package oop.src.com.dinesh.accessControl;

public class A {
    private int num;   // data is hiding for security, and it means it can be accessed anywhere inside this class
    String name; // no modifier can be accessed inside class, inside same package, inside same package subclass
    // try to access name in singleton package , won't be able to access;

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
