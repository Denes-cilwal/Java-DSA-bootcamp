package com.dinesh;

import java.util.Scanner;

public class SwitchProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID =  in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("rahul");
                break;

            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid empID");
        }

        // following statement is printed but current loop is broken
        System.out.println(" // using break => following statement after loop is printed but current loop is broken");
    }





}
