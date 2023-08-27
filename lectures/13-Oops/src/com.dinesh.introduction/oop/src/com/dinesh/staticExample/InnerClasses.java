package oop.src.com.dinesh.staticExample;

public class InnerClasses { // outside class cannot be static
    static class Test { // can be static
    String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String []args){
        Test a =  new Test("Sheldon");
        System.out.println(a.name);
    }
}

// static class A {} // cannot be static, since it is outer class


/*
when I am putting class Test inside Innerclass and creating object in main function it is giving error because now it is non-static class inside inner class
because keeping class test inside is now dependent upon the need instance of InnerClass
hey inner class do you anything to run, and inner class says I need instance of Innerclass to run, but I do not have it, so I have to create it my self, gives an error


if I keep static in front of class Test, not it is dependent on class itself not its objects

now real question is what will be output - rahul, rahul or kunal rahul
but, I am getting kunal and rahul, different identity but static means it should give same identity


what we have to understand here is internal class Test and main class have instances which can depend upon each other so there is different identity

static varibales does not depend upon objects , and objects are created at run time hence static class variables are resolved during compile time
*/
