import java.util.ArrayList;
import java.util.Scanner;

// Multi dimension Array List
public class MultiArrayList {
    // after words
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // [] => output
        // is simply a declaration and instantiation of a two-dimensional ArrayList.
        // At this point, the list is empty. It doesn't contain any elements, not even empty inner lists.
//        list.add();
        /*
        ArrayList<Integer> singleList = new ArrayList<>();
        singleList.add(5);   // Adds the integer 5 to the list
        singleList.add(10);  // Adds the integer 10 to the list
         At this point, singleList will look like: [5, 10].
         */
        /*
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // list containing other list
        list: [
    [1, 2, 3],       <-- ArrayList<Integer>
    [4, 5],          <-- ArrayList<Integer>
    [6, 7, 8, 9]     <-- ArrayList<Integer>
]

         */
//        System.out.println(list);

        Scanner in = new Scanner(System.in);
       // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            System.out.println(list); // // [[], [], []]
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                list.get(i).add(in.nextInt());
                System.out.print(list);
            }
            System.out.println();
        }

    }
}
