package com.dinesh;

import java.util.Scanner;

public class caseCheckD {
    public static void main(String[] args) {

        String word = "hello";
        System.out.println(word.charAt(0));

        Scanner in = new Scanner(System.in);
        // give array at this index of this string
        // trim removes spaces
        char  ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        }

    }
}
