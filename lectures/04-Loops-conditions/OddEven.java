package com.dinesh;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // check if input number is odd or even
        // divide by 2 or multiple of 2

        Scanner  sc =  new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("ODD");
        }
    }
}
