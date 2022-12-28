package com.dinesh;

public class countNumsD {
    public static void main(String[] args) {
//        int n = 4553565;
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n / 10;
//        }

        int n = 45556722;
        int count = 0;
        while(n > 0){

            int rem = n % 10; // gives remainder
            if (rem == 2){
//                count =  count + 1;
                count += 1;

            }
            n = n / 10;  // gives dividend
        }
        System.out.println("the count is :" + count);

    }
}
