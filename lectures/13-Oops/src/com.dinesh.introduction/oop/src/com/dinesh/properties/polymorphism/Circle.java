package oop.src.com.dinesh.properties.polymorphism;

public class Circle extends Shapes{
    // shapes also has area() and Circle (child class also) has area() method but diff output
    // overriding happens between two different class
    @Override // this is called annotation
    // this will run when obj of circle is created
    // hence it is overriding the parent method
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
