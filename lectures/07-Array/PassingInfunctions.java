
public class PassingInfunctions {
    public static void main(String[] args) {
        int[] num = {3,4,5,13};
        System.out.println(num);
        change(num);
        System.out.println(num);

    }


    static void change(int[] arr){
        arr[0] = 99;
    }
}


/*

// num ------------->[3,4,5,13]
                         |
                         |
//

                         arr

              //  if you change arr[0] = 99
              0 index subject is changed, mutable object
              array are mutable, string are immutable
              // copy of value of reference object is passed and points to same objects
 */

