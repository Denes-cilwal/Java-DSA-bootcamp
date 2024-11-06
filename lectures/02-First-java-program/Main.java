import java.util.Scanner;


public class Main {
    /*
    * entry point main func
    * this should be always public as this is the things we want to execute first
    * every file that ends with .java is class
    * staring with cap letter means this is class this is convention
    * making public means this can be executed from anywhere
    * whenever we create class we need object to use that class,but also we want to execute
    * main class without using objects that is why use static
    * since it is static, we want to run this main function without creating objects of main class
    * since this is first things | entry point we want to run, so we do not create objects
    * class name should be same as psv - name
    * psvm p is public means it must be run from any-where
    * for me and all people population of world is same, do we need separate objects no
    * when function finishes it return some value, but in our case we do not need any return value
    * that's why we use void
    * javac is executable command located in your os (where javac)
    * echo $PATH
    * env var is just folder address where your computer will check if your executable file exist or not
    * package com.dnes -> package means where your java files lies (SOP)
     */


    public static void main(String[] args) {
        // take input from system from keyboard
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter some Input:");
        // scans input as int
        int rollNo = Input.nextInt();
        System.out.println("Your roll no is:" + rollNo);

        // string , integer also have class wrapper class
        String name = Input.nextLine();
        System.out.println(name);

        System.out.println("HelloWorld!");

    }
}













// this can be accessed from anywhere
 class Main1 {
    // static because
    public static void main(String[] args){

    }

}














