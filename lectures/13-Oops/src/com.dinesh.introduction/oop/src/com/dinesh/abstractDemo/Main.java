package oop.src.com.dinesh.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(26);
        son.career();

        // daughter object creation
        Daughter daughter = new Daughter(20);
        daughter.career();
        daughter.partner();
        /*
        this is just a run time polymorphism determines which to call based on dynamic method dispatching
         */


        // can we create object for abstract class Let try it
        // no we cannot create abstract class object we need to override method inside of abstract class
        // because it is just a method
        /*
        Parent mom = new Parent(45) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
        */

        // even though we cannot create abstract object, but we can do that
        Parent daughter1 = new Daughter(30);
        daughter1.career();

        Parent.hello();


        // check final abstract method cannot be inherited but check final abstract method can be over-ridden or not ?
        // check can we do multiple inheritance with abstract method ?
    }
}
