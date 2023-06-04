package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static  long population;

    static  void message(){
        System.out.println("hello World");
//        System.out.println(this.age); - you cannot do because age is part of class and this is what pointing to object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age =  age;
        this.name =  name;
        this.salary = salary;
        this.married =  married;

        // if population is not related to object why we are using this keyword
        // we cant do that so access it using Class
//        this.population +=1;
        Human.population +=1;
        Human.message();
    }




}

/*
 whenever new obj is being created, it looks in object first , does this object have variable call population
 does main class have variable population if yes then increase by 1.
 static variable
 both works but convention is to use Class
 common to all objects
 */
