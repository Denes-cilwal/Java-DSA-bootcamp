package staticExample;

public class Main {
    public static void main(String[] args) {
        Human dinesh =  new Human(26, "dinesh", 10000000,false);
        Human david =  new Human(26, "david", 20000000,true);
        Human suman =  new Human(26, "suman", 20000000,true);

        /*
        System.out.println(david.population);
        System.out.println(dinesh.population);
        System.out.println(suman.population);
*/
        System.out.println(Human.population);

//        greeting(); -- it will gives us error  non-static method cannot be accessed inside static method.
    }

     // suppose population for object - Dinesh of Human class is let say 7 billion means it will also be same for david
     // It is not related to object, object independent- those are called static variables
    // whenever accessing or modifying always use by class
    // even if you do not create object you can access


    // why is main declared as static method
    // because you need to access main method without using object of class




    void greeting(){
        fun();// static method can be called inside static methods
        // dependent on objects
    }


    static  void  fun(){
        // not dependent on objects


        // you cannot access non-static stuff without referencing it
        // hence here I am referencing it.

        Main obj= new Main();
        obj.greeting();
    }
}
