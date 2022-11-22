public class Main {
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

         */

int [] arr =  {-4, 2, 3,4,15, 16, 19,  22, 45,77,89,98,99,100};
int target =  77;
int ans =  binarySearch(arr, target);

    }



    // return the index
    static int binarySearch(int[] arr, int target){
       int start = 0;
       int end = arr.length -1;
       while (start <= end){
           // find middle element
           // int mid =  start + end / 2; // the problem here is this may exceed end if this start and end is larger
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
        // return -1 if not exist
       return  -1 ;
    }
}