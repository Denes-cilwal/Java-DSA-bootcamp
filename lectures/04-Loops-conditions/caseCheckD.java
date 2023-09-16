package com.dinesh;

import java.util.Scanner;

public class caseCheckD {
    // done
    public static void main(String[] args) {

//        String word = "hello";
//        System.out.println(word.charAt(0));

//        Scanner in = new Scanner(System.in);
//        // give array at this index of this string
//        // trim removes spaces
//        char  ch = in.next().trim().charAt(0);
//        if (ch >= 'a' && ch <= 'z'){
//            System.out.println("LowerCase");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("UpperCase");
//        }



        Scanner in =new Scanner(System.in);

        // 65 - 90 (A - Z)  ==> // 97 -122(a - z)
        //in.next().trim() => this gives string not char when we do charAt(0) it gives char at 0 index
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase");
        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }

    }
}
