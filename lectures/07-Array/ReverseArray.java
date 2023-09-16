import java.util.Arrays;

public class ReverseArray {
    // done
    // 2 pointer method
    public static void main(String[] args) {
        int[] arr =  {1,3,23,4,9};
//        swap(arr, 0 , 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    // reverse array
    static  void  reverse(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
            while (start < end){
                swap(arr , start, end);
                start ++;
                end--;
            }
    }


// swap array
    static void swap(int[] arr, int indexStart, int indexEnd){
        int temp =  arr[indexEnd];
        arr[indexStart] =  arr[indexEnd];
        arr[indexEnd] = temp;
    }
}
