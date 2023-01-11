public class RemoveDuplicateSortedArray {

    int [] arr =  {0,0,1,1,1,2,2,3,3,4};

    target := arr[0]
    int ans =  binarySearch(arr, target);

}



    // return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
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


    static int FindDuplicateArrayList(int []arr, int target){
        for (int i = 0; i < arr.length; i++) {
         if arr[i] == target{

        }
}

}
