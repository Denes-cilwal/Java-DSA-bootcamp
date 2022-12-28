package com.dinesh;

public class statementsD {
    public static void main(String[] args) {
        /*
         * syntax of if statements
         * // if (boolean expressions T or F){
         * // body
         * else {
         * // do this
         * }
         */
        int salary = 25000;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // multiple if-else
        if (salary > 10000) {
            salary += 3000;
        } else if (salary > 15000) {
            salary += 2000;
        } else {
            salary += 1000;
        }

    }
}
