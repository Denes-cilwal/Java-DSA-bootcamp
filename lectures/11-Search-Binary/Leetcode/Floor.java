package Leetcode;

public class Floor {
    public static void main(String[] args) {
        int [] arr =  {2,3,5,9,14, 16,18};
        int target =  3;
        int ans =  binarySearch(arr, target);
        System.out.println(ans);
    }



    // return the index
    static int binarySearch(int[] arr, int target){

       int start = 0;
       int end = arr.length -1;
       // assume this array  is in sorted order
       while (start <= end){
           // start index vs end index
           /*
           Imagine you're holding just one page with your left hand (start) and right hand (end).
           If the word isn't on that page, on the next split, your left hand would go to the right of your right hand,
           which doesn't make sense in the context of reading a book
            */
           // find middle element
           // int mid =  start + end / 2; // index might exceed the range of array integer in java
           // better way to find value
           int mid = start + (end-start) / 2;
           if (target < arr[mid]){
                   end =  mid -1;
           } else if (target > arr[mid]){
               start = mid + 1;
           }else {
               return  mid;
           }
       }
       return end ;
    }
}



// time and space complexity is O(N)