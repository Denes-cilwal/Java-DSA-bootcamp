package oop.src.com.dinesh.Interface.Interfaces;

public class CDPlayer implements  Media{
    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
