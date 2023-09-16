package com.dinesh;

import java.util.Scanner;

public class largestD {
    // done
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q. find the largest of three input numbers
        /*
         * a = 10 ,
         * b = 20,
         * c = 30
         */
        /*
         * way:1
         * int max = a;
         * if (b > max){
         * max = b;
         * }
         * if (c > max){
         * max = c;
         * }
         * System.out.println(max);
         */

        // no need to check a > b , a > c
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        //
        int maxNumber = Math.max(c, Math.max(a, b));
        System.out.println(maxNumber);
    }

}
