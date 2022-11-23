import java.util.ArrayList;
import java.util.Scanner;

// Multi dimension Array List
public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // []
//        System.out.println(list);

        Scanner in = new Scanner(System.in);
       // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            System.out.println(list);
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
