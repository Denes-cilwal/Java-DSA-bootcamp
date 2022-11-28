public class EvenDigitQuestions {
    // Given an array nums of integers, return how many of them contain an even number of digits.
    /*
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    There-fore only 12 and 7896 contain an even number of digits.
     */
    // Problem Statement :1295  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
    int[] numArr = {12,345,2,6,-7896};
//        System.out.println(FindNumbers(numArr));
        System.out.println(digits(622222));
    }

 // Find the no of even count
    static int FindNumbers(int[] numArr){
        int count = 0;
        for (int num:
             numArr) {
            if (even(num)){
                count ++;
            }
        }
        return count;
    }

    // function to check Whether a number contains even  digits or not
   static boolean even(int num) {
        int numberOfDigit = digits(num);
        /*
                if (numberOfDigit  % 2 == 0){
                    return  true;
                }
                return false;
*/
                return numberOfDigit % 2 == 0;

    }

    // count number of digits in num
//    static int digits(int num){
//        // edge cases
//        if (num < 0){
//            num = num * (-1);
//        }
//
//        if (num ==0){
//            return  1;
//        }
//
//        int count = 0;
//        while (num > 0){
//            count ++;
//            num =  num /10; // num /= 10;
//        }
//        return   count;
//    }



    // 2nd way to count number of digits in num

    static int digits(int num) {
        // edge cases
        if (num < 0) {
            num = num * (-1);
        }
        return (int)(Math.log10(num)) + 1;
    }



}
