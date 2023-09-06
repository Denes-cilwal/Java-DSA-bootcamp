package oop.src.com.dinesh.properties.polymorphism;

public class ObjectPrint extends Object {
    // case if string method is provided oop.src.com.dinesh.properties.polymorphism.ObjectPrint@2f92e0f4
    // case if string method is overrided in my class, it will call string method in line no 17
    // but it is not extending anything // the ans is by default it will extends Object Class
    int num;

    public ObjectPrint(int num){
        this.num = num;

    }

    // case is if to string is not provides it will use object class toString() method but it if I use toString()
    // it is using mystring not object class toString() method

    @Override
    public  String toString(){
        return "ObjectPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
