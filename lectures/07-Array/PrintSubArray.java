public class PrintSubArray {
    // sub array is continuouns part of array
    // 2,4, 6, 8,10  ==> 2,4,6 is sub array but 2,4,8 is not sub array

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        PrintSubArray(arr);
    }

    public static  void PrintSubArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <=end; k++) {
                    System.out.print(arr[k] + "");
                }
                System.out.println();
            }
        }
    }

}
