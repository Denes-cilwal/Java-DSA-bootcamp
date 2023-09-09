package oop.src.com.dinesh.Interface.Interfaces;

public class Main {
    public static void main(String[] args) {

        // what interface solves they disconnect the hierarchy from the methods from upper class parent class
        // solving the problem of hierarchy of classes
        // they do not care about whether two classes are related or not

//       Engine car =  new Car();
//        car.start();
//        car.stop();
//        car.acc();


       // car.a //

        /*
        Media carMedia =  new Car();
        carMedia.stop(); // this is weird I am trying to stop car music player but car engine stops // solution is create separate class
            */


//        NiceCar car  = new NiceCar();
//        car.start();
//        car.startMusic();
//        car.upgradeEngine();


        Engine electricEngine = new ElectricEngine();
        NiceCar car = new NiceCar(electricEngine);
        car.start();

    }
}
