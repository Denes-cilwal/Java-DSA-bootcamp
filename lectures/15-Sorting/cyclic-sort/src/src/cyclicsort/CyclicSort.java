package cyclicsort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
         // check swap move
        int[] cyclicSortArr = {3,5,2,1,4};
        CyclicSortArr(cyclicSortArr);
        System.out.println(Arrays.toString(cyclicSortArr));

    }

    static  void CyclicSortArr(int[] arr){
        int i = 0;
        while (i < arr.length){
            // find correct index first
            int CorrectIndex = arr[i] - 1; // 3-1 => 2

            if (arr[i] != arr[CorrectIndex]){
                    swap(arr , i, CorrectIndex);
            }else {
                /*
                Without this else block,
                the while loop would become an infinite loop for any number that's already in its correct position.
                The else block ensures that once a number is confirmed to be in its correct position, the loop moves forward to check the next index.
                So, in short, the else block is used to advance the loop when the current number is already in its correct position.
                 */
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] =  temp;
    }
}

// 4 swaps made + 5 check made after it is in correct position[] => n-1 + n => (2n-1) swaps => O(N) => linear