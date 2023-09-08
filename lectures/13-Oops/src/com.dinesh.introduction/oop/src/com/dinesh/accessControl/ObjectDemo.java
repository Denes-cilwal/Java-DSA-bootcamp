package oop.src.com.dinesh.accessControl;

public class ObjectDemo {
    int num;
   float  gpa;

    // constructor
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    // gives string representation
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    // in hashmap concepts
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,  56.7f);
        ObjectDemo obj2 = new ObjectDemo(45,  78.9f);
        System.out.println(obj.hashCode());
        // unique representation of number by value // hashcode is not address


        /*

        if (obj < obj2 ){

            // java will get confused since obj has two variable num and gpa which one to compare
            System.out.println("obj1 is less than obj2");
        }
         */

        if (obj == obj2 ){
            // points to same obj
            System.out.println("obj1 is equal obj2");
        }

        if (obj.equals(obj2)){
            // checking contain of it [explore in string builder concept]
            System.out.println("obj1 is equal obj2");
        }
    }
}
