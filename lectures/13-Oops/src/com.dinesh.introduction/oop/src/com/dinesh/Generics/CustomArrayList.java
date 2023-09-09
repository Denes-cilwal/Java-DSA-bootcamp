package oop.src.com.dinesh.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data ; // this is custom arrayList of Integer only how can we created arrayList of any type we want - using generics
    private int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add (int num){
        if(isFull()){
            resize();
        }
        data[size++] =  num;
    }

    private void resize() {
        int[] temp =  new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }

        // scope of temp is only within this function
        data =  temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }


    public int get(int index) {
        return data[index];
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

        for (int i = 0; i < 14; i++) {
                list.add(i);
        }
        System.out.println(list);


        // only Integer type is allowed here
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);


    }

}
