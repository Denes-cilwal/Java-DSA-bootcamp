import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
//        int[] arr = new int[5];
//
//        // input using for loops
//
//        // array of primitives
//        for (int i = 0; i < arr.length; i ++){
//            arr[i] = in.nextInt();
//
//        }
//        for (int num:
//             arr) {
//            System.out.println(arr[num]);
//        }
        // for each element in array
        int[] arr = new int[5];
        for (int i:arr
        ) {
            System.out.println(i + "");
        }

        // array of object
        String[] str = new  String[4];
        for (int i= 0; i< str.length; i++){
            str[i] = in.next();
//            System.out.println(str);
        }
        System.out.println(Arrays.toString(str));

    }

    /*
    // memory management
    // here we are modifying original object not creating new reference variable
    str(stack) ----------------> heap
                                 [refVar1,refVar2,refVar3, refVar4] - reference variable
                                      |     |      |        |
                                     aa    bb      cc       dd (stored somewhere in heap)
                                     */


    /*

    Method level / Local variables : Stack (for Primitives) or Heap(Objects with references on the Stack).
    Strings can be allocated either on Stack or on heap.
     */


}


