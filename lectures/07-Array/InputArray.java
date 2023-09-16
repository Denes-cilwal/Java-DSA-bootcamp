import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

    // done

    public static void main(String[] args) {



        Scanner in  =new Scanner(System.in);
        int num = in.nextInt();




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
                // fot every element in array, print the element i is the individual element here not index
        ) {
            System.out.println(i + "");
        }

        int[] arr1 = new int[6];
        for (int element: arr1) {
            System.out.println(element);
        }


        // array of object
        String[] str = new  String[4];
        for (int i= 0; i< str.length; i++){
            str[i] = in.next();
//            System.out.println(str);
        }
        System.out.println(Arrays.toString(str));   // num array to format integer array

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

//    by default if there is no value for every ref variable it is null

}


