package com.dinesh;

import java.util.Scanner;

public class FindReverse {
    //done
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int ans = 0 ;
        while (num > 0) {
           int  rem = num % 10;
           num /=   10;

        ans = ans * 10 + rem;
        }

    }
}
