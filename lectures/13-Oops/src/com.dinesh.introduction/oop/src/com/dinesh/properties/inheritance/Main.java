package oop.src.com.dinesh.properties.inheritance;

public class Main {
    // base class => child class [inheriting from base class]

    public static void main(String[] args) {
        // case without inheritance
   /* case - I
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);

        // with inheritance
        BoxWeight box3 =new BoxWeight();
        System.out.println(box3.weight);


        /* case [VVIMP]: II [parent class cannot access properties of child class that is ok but what is determining that what can be accessed or not]
        child class can access properties of parent class using the object of child class
        if you create object of itself,parent class cannot access properties of child class with object of parent class
         */

/*
        // concept -- referencing child to parent is possible
        // the object type is boxWeight, but it is referencing by Box type its parent
        Box box5 = new BoxWeight(2,3,4,8);

        // vim - it is not the type of object that determines what properties, members can be accessed ,
        it's the type of reference variable that determines what properties can be accessed
        // when reference to subclass object is assigned to super class reference variable like in this e.g.
        System.out.println(box5.l); // it is obvious that it can be accessed
        System.out.println(box5.Weight) // cannot be accessed because it is properties of child class _, only able to access data of super class not sub class
*/

    /*
    concept - referencing parent to child  - cannot do
         there are many variables in both parent and child classes
         you are given access to variables that are in the ref type i.e. BoxWeight
         hence, you should have access to weight variable
         this also means, that the ones you are trying to access should be initialised
         but here, when the obj itself is of type parent class, how can you call the constructor of child class
         parent cannot access property of child class
         this is why error
     */
         // BoxWeight box6 =  new Box(2,3,4); // you can access that but parent class has no idea about weight
        // System.out.println(box6.weight); // cannot be access


        Box box5 = new BoxWeight(2,3,5,6);


        // multilevel inheritance
        BoxPrice box = new BoxPrice(5, 6, 200);
        box.getAge(); // abstraction



        // with args
        BoxWeight boxArgs =new BoxWeight(10, 11,12, 13);
        System.out.println(boxArgs.l + " " + boxArgs.w + " " + boxArgs.h + " " + boxArgs.weight);

    }
}

/*
 single inheritance
 multi-level inheritance
  box
  |
  Box  weight
  |
  Box Price
 multiple inheritance - class extending more than one class

 a (n=2)             B(n=10)
 |                   |
  -------   c -------
  c obj = new c ()
  c.n // ? ie. not possible // always look in your and look into parent object // ambiguity

  but if I want to access these types of use cases it then how can I do it ? using interfaces

  hierarchical interface

           A
|          |          |
B          c          D

hybrid inheritance - combination of single and multiple - since no multiple in java so no hybrid inheritance - check interface lecture.

 */