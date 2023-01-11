import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
     arr =    [
         [
         1 2 3
         4,5,7
          ],
         [4 5 6],
         [7 8 9],
         ]
        * */

//        System.out.println(arr.length); // no of rows

//        int[][]  arr = {
//                // vary for every index of array
//                {1,2,3}, // 0th index
//                {4,5},   // 1st index
//                {7,8,9, 2},    // 2nd index - arr[2] = {7,8,9,2}
//
//        };
//        int[][] arr1 =  new int[3][3];
//        for (int row = 0; row < arr1.length; row++){
//
//        }

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows is mandatory


        // ta
        // ke input in cells
        for (int row = 0; row < arr.length; row++) {
            // in case-of row always count the row
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
             // row ko index ko length ;
               arr[row][col] =  in.nextInt(); // input
            }
        }

        // output from cells
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // 2D array from microsoft
            // for every element in arr
        for (int[] a :
                arr) {
            System.out.println(Arrays.toString(a));

        }
    }



}