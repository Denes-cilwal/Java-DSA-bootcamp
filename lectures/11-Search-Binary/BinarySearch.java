public class BinarySearch {
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

int [] arr =  {-4, 2, 3,4,15, 16, 19,  22, 45,77,89,98,99,100};
int target =  77;
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
        // return -1 if not exist
       return  -1 ;
    }
}



//
//arr =  {1,12,18,23,28,97,100,122,144} - target 122 - 8 loops -- O(n) ---> 8
//arr1 ={1,12,18,23,28,97,100,122,144} --- log(N)
//
//
//N1 ----> N/2-----> N/2/2----> N/8------>

/*
Complexity Analysis of Binary Search
Since analysis starts with the middle element, in the best case, it’s possible that the middle element of the array itself is the target element.
Otherwise, the length of the array is halved.
In the following iterations, the size of the sub array is reduced using the result of the previous comparison.

Initial length of array =n
Iteration 1 - Length of array =  n / 2
Iteration 2 - Length of array = n / 4
Iteration k - Length of array =  n /2 power K


After k iterations, the size of the array becomes 1 (narrowed down to the first element or last element only)

Length of array =  n/ 2^k =  1
n =  2 ^ k
// log on both sides
k = log2(N) ==> log(N)
*/


/*
Imagine we're trying to
find a number within a large sorted array that spans almost the entire 32-bit positive integer range.
 Let's consider our search range's start and end are as follows:


int start = 1073741823;   // Slightly less than half of 2^31 - 1
int end = 2147483647;    // 2^31 - 1, the maximum for a 32-bit signed integer
Now, when you try to find the midpoint using:


int mid = (start + end) / 2;
The expression (start + end) results in 3211226470, which exceeds the maximum value for a 32-bit signed integer (2147483647). This will cause an integer overflow.
 */