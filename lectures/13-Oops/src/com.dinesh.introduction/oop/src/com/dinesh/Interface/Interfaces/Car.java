package oop.src.com.dinesh.Interface.Interfaces;

// case Let we create car and car needs to have brake and engine interface and implements all its methods

public class Car implements Brake, Engine, Media{

    int a = 30;
    @Override
    public void brake() {
        System.out.println("I brake like normal car");

    }


    // the question is which start() is it using is it from brake or Engine which one it is overriding don't care that
    @Override
    public void start() {
        System.out.println("I start engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like normal car");
    }
}
