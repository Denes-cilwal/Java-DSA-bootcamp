package oop.src.com.dinesh.Interface.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine acc");
    }
}
