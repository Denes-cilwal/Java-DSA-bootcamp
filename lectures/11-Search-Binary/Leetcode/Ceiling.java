package Leetcode;

public class Ceiling {
    public static void main(String[] args) {
        /*
        // binary search - optimized way to search
        arr = [2,4,9,10,12,14,18,19] - ascending  order
            = [19,18,14,12,10,9,4,2] - descending order

//         */
//        System.out.println("Hello world!");

        // steps :-
        /*
        - find the middle element
        - target > mid => search in right else search in left
        - if middle element == target element // found the ans

         mid-element = start index + end index /  2
         N > mid
         N < mid
         N = mid (found)
         -  Remember array is not copied
         */


        // why binary search ?
//        - Best scenario is when target element is found in short time
//        -first middle value is what you are searching
//        - O(1) is best case time complexity
        /*
        -       Time
                |
                |
                |
                |______________________ 0(1)
                |
                |_______________________ size
*/

        // worst case comparision - size matters

        /*
        search in linear for 1 million data - 1 million comparision
                20 comparision -  binary search


            K- log2(N) -no of levels you will be checking
         */

        int [] arr =  {2,3,5,9,14, 16,18};
        int target = 15;
        int ans =  binarySearch(arr, target);
        System.out.println(ans);
    }



    // return the index
    static int binarySearch(int[] arr, int target){
       int start = 0;
       int end = arr.length -1;
       if (target > arr[arr.length -1]){
           return  -1 ;

        }
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
        // return start as condtion violates => end < start
       return start ;
    }
}



