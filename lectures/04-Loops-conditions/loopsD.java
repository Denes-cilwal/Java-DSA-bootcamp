package com.dinesh;

import java.util.Scanner;

public class loopsD {
    // done
    public static void main(String[] args) {
        /* Q : Print numbers from 1 to 6
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        */

        /* Q. Print number from 1 to 5
        for (initial; condition; increment){
            // body
        }
        */
//         for (int i = 1; i<=5; i+=1){
//        System.out.println(i);
//    }



        // print numbers from 1 to n (n is number that user inputs)

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int i = 1; i<=n; i++){
//            System.out.println(i);
//        }



//        int num =1 ;
//        while (num <=5){
//            //
//            System.out.println(num);
//            num ++;
//        }




        // While loops
        // converting for loops to while loops
        /*
         Syntax:
         While(conditions){
             // body
        int num = 1;
            // 6<=5 is it will not go inside loop
            // use for loop when you know number of times loops will run
            // use while loop when you do not know the number of times loop does not run
            while(num <= 5){
                System.out.println(num);
                num+=1;



        }
        */

        // do while
        /*
         do{
         // one time loop running use do while
         // in do while loop it will execute at least once
         // it will execute the body and then makes the check
         // body
         } while(condition)
        int n = 1;
        do{
            System.out.println("Hello world");
        }while (n!=1);
         */
    }
}