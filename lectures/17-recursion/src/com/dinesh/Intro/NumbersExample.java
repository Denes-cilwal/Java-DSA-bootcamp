package src.com.dinesh.Intro;

public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print1(1);
        /*

        // cannot do like this
        print2(2);
        print3(3);
        print4(4);
        print5(5);
        print6(6);
         */
    }

    static void print1(int n) {
        // you cannot modify this function to print all numbers
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    // func body here changes because it is just printing here
    static void print5(int n) {
        System.out.println(n);
    }
}

// what is happening here ?
// This is function calling another function that is recursion
// body and definition is same => taking one parameter and doing same
// Can't we do something like this in recursion number problem?
// I am making repetition what if number is 1 Lakh, creating separate one lakh function is not proper solution