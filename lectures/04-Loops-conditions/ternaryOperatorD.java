package com.dinesh;

public class ternaryOperator {
    // 3 operands
    // variable = condition ? statement1 : statement2
    public static void main(String[] args) {
        int larger = (5>3) ? 5 : 3;
        System.out.println(larger);
        int marks = 54;
        String output = (marks > 33) ? "PASS":"FAIL";
        System.out.println(output);

        int age = 17;
        String result = (age > 18) ? "Is Eligible to vote":"Is not Eligible to vote";
        System.out.println(result);
    }
}
