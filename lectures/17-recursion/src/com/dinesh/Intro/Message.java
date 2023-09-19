package src.com.dinesh.Intro;

public class Message {

    public static void main(String[] args) {
        // write a function that prints hello world
        message();
    }

    static void message() {
        System.out.println("Hello World");
        message1();
    }

    static void message1() {
        System.out.println("Hello World");
        message2();
    }

    static void message2() {
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
    }

}

/*
 while the func is not finished execution it will remain in the stack
 which is the first function that will go to the stack => the main function is the first and Last to out from the stack
 every time the function is taking separate memory space


 // it helps in solving bigger and complex problem into the simpler solution
 // you can convert recursion solution to iteration and the vice versa
 // first convert to recursion and try using  iteration (for the optimised solution)

 // space complexity - each function is taking some space so space complexity is not constant [not constant because of recursive calls]


// when message is finished it will come out from the body from where it is called
 */