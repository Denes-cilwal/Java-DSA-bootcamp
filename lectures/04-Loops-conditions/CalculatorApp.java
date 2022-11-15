package com.dinesh;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // operations = + - * / %
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        System.out.println("Enter Operator :");
        char operator =  sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a *b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("no operation performed");
        }
    }
}
