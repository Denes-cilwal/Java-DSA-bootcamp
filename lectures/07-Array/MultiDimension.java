import java.lang.reflect.Array;
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
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // take input in cells
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
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

        for (int[] a :
                arr) {
            System.out.println(Arrays.toString(a));

        }
    }



}