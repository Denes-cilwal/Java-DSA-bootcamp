public class agnosticSearch {
    public static void main(String[] args) {

        System.out.println("order-agnostic search");
        // if s > f ==> increasing order sorted
        // s < f ==> decreasing order sorting
        int [] arr =  {-4, 2, 3,4,15, 16, 19,  22, 45,77,89,98,99,100};
        int target =  77;
        int ans =  orderAgnosticSearch(arr, target);

    }


    static int orderAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is ascending or descending order
//        boolean isAsc;
//        if arr[start] < arr[end]{
//                isAsc = true;
//        }else{
//            isAsc = false;
//        }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //
            // find middle element
            // int mid =  start + end / 2; // might exceed the range of array integer in java
            // better way to find value
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return  mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        // return -1 if not exist
        return -1;
    }
}