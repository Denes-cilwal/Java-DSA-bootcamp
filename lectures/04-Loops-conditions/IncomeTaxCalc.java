package com.dinesh;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String[] args) {
       // - Problem statement
        // income < 5L - 0 % - tax
        // income between 5-10L - 20 % - tax
        // income > 10L - 30% tax
        Scanner in = new Scanner(System.in);
        int income =  in.nextInt();
        int tax;
        if (income< 500000){
            tax = 0;
        }else if (income >= 50000 && income < 100000){
            tax = (int)(income * 0.2);
        }else{
               tax = (int)(income * 0.3);
        }
        System.out.println("your tax is :" + tax);
    }
}
