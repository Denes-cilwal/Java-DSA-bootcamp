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



