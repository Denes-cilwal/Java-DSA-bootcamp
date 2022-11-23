import java.util.Arrays;

public class PassingInfunctions {
    public static void main(String[] args) {
        int[] num = {3,4,5,13};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

        update(num);
        System.out.println(Arrays.toString(num)); // original array got changed using mutable case
    }


    static void change(int[] arr){

        arr[0] = 99;
    }

    static  void update(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;

        }
    }


}


/*

// num------------->[3,4,5,13]
                         |
                         |
//

                         arr

              //  if you change arr[0] = 99
              0 index subject is changed, mutable object
              array are mutable, string are immutable
              // copy of value of reference object is passed and points to same objects
 */

