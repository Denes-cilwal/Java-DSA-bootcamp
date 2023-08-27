package oop.src.com.dinesh.properties.polymorphism;

public class ObjectPrint {
    // but it is not extending anything // the ans is by default it will extends Object Class
    int num;
    public ObjectPrint(int num){
        this.num = num;

    }


    public  String toString(){
        return "ObjectPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
