package com.dinesh;

import java.util.Scanner;

public class SwitchD {

     // different button , different value
     public static void main(String[] args) {
         /*
         Scanner in  = new Scanner(System.in);
         String fruit = in.next();
         if (fruit.equals("Mango")){
             // comparing only value
             System.out.println("Mango is my fav");
             return;
         } else if (fruit.equals("Banana")) {
             System.out.println("banana is my fav");
             return;
         }
*/

         Scanner in  = new Scanner(System.in);
         String fruit = in.next();
         switch (fruit){
             case "Mango":
                 System.out.println("King of fruits");
                 break;
             case "Apple":
                 System.out.println("apple juice");
                 break;
             default:
                 System.out.println("please enter valid fruit");
         }

         int num = 2;
         // switch(variable) > compare with case num
         // type must be same
         // duplicate case are not allowed
         // break is used to terminate case

         // break condition not required in new switch case statement



         switch (num){
                 case 1:
                 System.out.println("burger");
                 break;
                 case 2:
                 System.out.println("mango shake");
                 break;
                 default:
                 System.out.println("wake up get coffee");
         }
         int day = in.nextInt();
         switch (day) {
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("Tuesday");
             case 3 -> System.out.println("Thursday");
             case 4 -> System.out.println("Friday");
             case 5 -> System.out.println("sat");
         }

     }
}

/*
return, break, continue Instructions

The return instruction is used either to return a function value or to terminate the execution of a function. The exit may be from anywhere within the function body, including loops or nested blocks. If the function returns a value, the return instruction is required, furthermore it contains the expression of the appropriate type. <return> ::= return [<expression>]

{ ... fornum i, 100 { if error { return 0 // terminating the execution of the function } ... } ... return a + b }

The break instruction terminates the execution of the loop. break is likely to be located within nested blocks. If a program contains several nested loops, break will exit the current loop.

while b > c { for i = 100, i > 0, i-- { if !myfunc( i ) { break //terminating the execution of for loop } } b++ }


 */



