package oop.src.com.dinesh.Interface;

public class Main {
    public static void main(String[] args) {
        Engine car =  new Car();
        // what  to access is determined by car what to invoke is determined by object
        //  car.a; // which
        car.acc();
        car.start();
        car.stop();


        Media carMedia = new Car();
        carMedia.stop();
    }
}
