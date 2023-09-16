package cyclicsort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // check swap move
        int[] cyclicSortArr = {3,0,1};
        CyclicSortArr(cyclicSortArr);
        System.out.println(Arrays.toString(cyclicSortArr));

    }

    static  void CyclicSortArr(int[] arr){
        int i = 0;
        while (i < arr.length){
            // find correct index first
            int CorrectIndex = arr[i]; // 3-1 => 2

            if (arr[i] != arr[CorrectIndex]){
                swap(arr , i, CorrectIndex);
            }else {

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

