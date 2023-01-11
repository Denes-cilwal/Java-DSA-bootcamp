public class FindPositionInInfiniteArray {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        /*
        Source: Amazon Interview Experience.
        //  we cannot use array.length
        Since array is sorted, the first thing clicks into mind is binary search,
        but the problem here is that we don’t know size of array.
        If the array is infinite, that means we don’t have proper bounds to apply binary search.
        So in order to find position of key, first we find bounds and then apply binary search algorithm.
         */

        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        int ans = findingRange(arr,10);

        System.out.println(ans);

    }

    static int findingRange(int[] arr, int target){
        // first find the range
        // start with the box of size =2 (chunk)
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        // target > end , double then search until found
        while (target > arr[end]){
          int temp = end + 1;

//          end = previous end * size of box * 2
          end = end + (end - start + 1) * 2;
        start= temp;

        }

        return  binarySearch(arr,target,start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end){

        // assume this array is in sorted order
        while (start <= end){
            // find middle element
            // int mid =  start + end / 2; // might exceed the range of array integer in java
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
