package oop.src.com.dinesh.staticExample;


// can be non-static but cannot be static
// done
public class InnerClasses { // outside class cannot be static
// done
    static void hello(){}

    // class test =>it is also static member of outer class
    static class Test { // can be static
    String name;
    static int a =  20;
    


    public Test(String name) {
         // constructor cannot be static as constructor are always tied to object
            this.name = name;
        }

        static void greeting(){
            // can be accessed by class name of outer class
        }

        void submit(){
        // cannot access
        }
    }

    public static void main(String []args){
        Test a =  new Test("Sheldon");
        System.out.println(a.name);

        /*
        InnerClasses ic = new InnerClasses();
        ic.hello();
        you're using the instance ic of InnerClasses to call the static method hello(). While this is allowed in Java, it's misleading.
         A reader might incorrectly assume that hello() is an instance method when it's actually a class (static) method.
         */

        InnerClasses.hello();
        InnerClasses.Test.greeting(); // can access by class
        // correct way to access this
        //Using the class name to call a static method makes it clear to anyone reading the code that the method being called is a static method
        // and not tied to any instance of the class.

        // InnerClasses.Test.Test() // Test is constructor


        // InnerClasses.Test.submit() // you can't use InnerClasses.Test.submit() because submit is an instance method, not a static method.

        // can be accessed
        System.out.println(InnerClasses.Test.a); // not instance variable but static varible
    }
}

// static class A {} // cannot be static, since it is outer class

/*
A static nested class (often referred to as a "static inner class") means that the nested class is a static member of the outer class
. Just like static methods and static variables of a class, t
he static nested class does not have an associated instance of the outer class.
 */

/* 1st case 
A static nested class (often referred to as a "static inner class") means that the nested class is a static member of the outer class.
Just like static methods and static variables of a class, the static nested class does not have an associated instance of the outer class.
However, this doesn't mean you cannot instantiate (create objects of) the static nested class.
It only means that you don't need an instance of the outer class to do so
*/


/*
But You can create objects (instances) of static nested classes.
You cannot create instances of a class that only has static methods and a private constructor,
but this is not because the class is "static".
The term "static" in the context of a nested class in Java just means the class does not have an implicit reference to an instance of the containing (outer) class.
It does not mean that you cannot create instances of the static nested class itself.


- hey inner class do you have  anything to run, and inner class says I need instance of Innerclass to run,
but I do not have it, so I have to create it my self, gives an error

*/


/*
- when I am putting class Test inside Innerclass and creating object in main function it is giving error because now it is non-static class inside inner class
because keeping class test inside is now dependent upon the need instance of InnerClass




if I keep static in front of class Test, not it is dependent on class itself not its objects

now real question is what will be output - rahul, rahul or kunal rahul
but, I am getting kunal and rahul, different identity but static means it should give same identity


what we have to understand here is internal class Test and main class have instances which can depend upon each other so there is different identity
static varibales does not depend upon objects ,
 and objects are created at run time hence static class variables are resolved during compile time
*/


/*
Imagine you have a company (let's call it Company).
Inside this company, you have a separate department for software development,
which we'll call SoftwareDepartment.
This department is so independent that it doesn't need the company to exist for it to function.
This is our analogy for a static nested clas

public class Company {
    // This is our "static" nested class, think of it as an independent department.
    static class SoftwareDepartment {
        void work() {
            System.out.println("Developing software...");
        }
    }

    public static void main(String[] args) {
        // Create an instance of SoftwareDepartment
        SoftwareDepartment dept = new SoftwareDepartment();
        dept.work();  // prints: Developing software...
    }
}


 */


/******* 2nd case
If Test was a non-static inner class (not marked with the static keyword),
then you would need an instance of InnerClasses to create an instance of Test.
This is because non-static inner classes have a hidden reference to the outer class instance.(hidden means implicit reference for iys outer class)

 */