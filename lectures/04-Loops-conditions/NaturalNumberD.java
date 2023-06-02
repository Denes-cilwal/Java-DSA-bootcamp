package com.dinesh;

import java.util.Scanner;

public class
NaturalNumberD {
    public static void main(String[] args) {
        // Number > 0 are natural numbers, excluding decimal fraction
        Scanner input = new Scanner(System.in);
        int num =  input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
                sum = sum + i;
        }
        System.out.println(sum);

    }



}
