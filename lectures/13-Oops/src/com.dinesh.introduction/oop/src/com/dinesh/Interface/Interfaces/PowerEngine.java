package oop.src.com.dinesh.Interface.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stops");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine acc");
    }
}
