import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        // why do you need array list
        // - array are fixed size but what you do not know the array size, then
        // arraylist is useful(like slice in go)

        // wrapper class
        // Integer | Float | String
        // ArrayList<String> list2 = new ArrayList<String>();

        ArrayList<Integer> list = new ArrayList<Integer>(3);
        /*
         * list.add(67);
         * list.add(68);
         * list.add(57);
         * list.add(76);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.add(80);
         * list.set(0, 99);
         * 
         * System.out.println(list.contains(654));
         * System.out.println(list);
         * 
         * list.remove(2); // remove 0 index
         * 
         * 
         * // capacity is 10 but how it is getting added more than that
         * 
         * 
         * Scanner in = new Scanner(System.in);
         * // input
         * for (int i = 0; i < 5; i++) {
         * // add to end of list
         * list.add(in.nextInt());
         * }
         * 
         * // get item at any index
         * for (int i = 0; i < 5; i++) {
         * System.out.println(list.get(i)); // pass index here, list[index] syntax will
         * not work here
         * }
         * 
         * System.out.println(list);
         * 
         * }
         * 
         */

        System.out.println(list.size());

        // add elements
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());

        // get elements
        System.out.println(list.get(1));

        // add el in between
        list.add(1, 1);
        System.out.println(list);

        // change element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // arraylist size
        System.out.println(list.size());

        // loops over arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //
    }

    // size is fixed internally
    // it will create new arraylist of say, double the size
    // old list are copied into new list
    // old one is deleted
}
