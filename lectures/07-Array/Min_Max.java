public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {1,2,23,9,28};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1,4));
    }
    static int max(int[] arr){

        if (arr == null){
            return  -1 ;
        }
        int maxVal = arr[0];
        for (int index = 1; index <arr.length ; index++) {
            if (arr[index] > maxVal) {
                maxVal = arr[index];
            }
        }
        return  maxVal;
    }


    static int maxRange(int[] arr, int start, int end){
       // edge cases
        if (end > start){
                return  -1;
        }

        if (arr == null){
            return  -1 ;
        }
        int maxVal = arr[start];
        for (int index = start; index <=end ; index++) {
            if (arr[index] > maxVal) {
                maxVal = arr[index];
            }
        }
        return  maxVal;
    }
}
