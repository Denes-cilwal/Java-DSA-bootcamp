package oop.src.com.dinesh.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    // Generics is about the concept of type safety
    private Object[] data ;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

//    public CustomArrayList(){
//        // type checking happens at compile time but this memory allocation happens at run time
//        // byte code get executed, and it has no idea , but in run time we do not know what T is , what value type it stores
//
//        // this.data = new T[DEFAULT_SIZE]; // compile time error
//        // cannot instate Type paramters
//    }


    public CustomGenericsArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add (int num){
        if(isFull()){
            resize();
        }
        data[size++] =  num;
    }

    private void resize() {
        Object[] temp =  new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }

        // scope of temp is only within this function
        data =  temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }


    public T get(int index) {
        // assigning lower to higher class
        return (T)data[index];
    }

    public void set(int index, int value) {
        data[index]=  value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';

        // here size is the no of elements inserted
    }

    public static void main(String[] args) {
        // ArrayList list =  new ArrayList();
        CustomArrayList list =  new CustomArrayList();
        // this is non-generic can be added object of any type
//    list.add(3);
//    list.add(5);
//    list.add(9);
//    list.add(19);
//    list.add(29);
//    list.add(39);
//    list.add(49);
//    list.add(59);
//    list.add(69);
//    list.add(79);
//    list.add(89);
//    list.add(99);

//        for (int i = 0; i < 14; i++) {
//            list.add(i);
//        }
//        System.out.println(list);


        // only Integer type is allowed here
        ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(1);


        CustomGenericsArrayList<Integer> list3 =  new CustomGenericsArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);
    }
}
