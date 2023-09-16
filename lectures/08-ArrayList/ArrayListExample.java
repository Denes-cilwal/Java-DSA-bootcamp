import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        // why do you need array list ?
        // - array are fixed size but what if you do not know the array size, then
        // arraylist is useful(like slice in go, vector in c)

        // wrapper class
        // Integer | Float | String
        // ArrayList<String> list2 = new ArrayList<String>();
        // wrapper class within <>




        ArrayList<Integer> list = new ArrayList<Integer>(3);
        System.out.println("po");
        System.out.println(list.size());
        System.out.println(list.contains(80));
        /*

// capacity is 3 but how are we adding element > 3

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
//         * System.out.println(list.contains(654));
         * System.out.println(list);
         * 
         * list.remove(2); // remove 0 index
         * 
         * 
         * // capacity is 10 but how it is getting added more than that =>
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

        // size is fixed internally ,
        // Let says
        System.out.println(list.size());

        // add elements
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("sop");
        System.out.println(list);
        System.out.println(list.size());

        // get elements
        System.out.println(list.get(1));

        // add el in between
        list.add(1, 1); // shift to right --
        System.out.println(list);
        System.out.println("sop1");
        System.out.println(list.size());

        // change element // update
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // arraylist size
        System.out.println("opop");
        System.out.println(list.size());

        // loops over arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //
    }


    // learning while using collection framework
    // time complexity but if time complexity why
    // size is fixed internally
    // it will create new arraylist of say, double the size
    // old list are copied into new list
    //

    // The new capacity will be
    //old capacity
    //+
    //old capacity
    //2
    //old capacity+
    //2
    //old capacity
    //​
    //
    //This results in
    //10
    //+
    //5
    //=
    //15
    //10+5=15
    //That's where the "size of 15" comes from in the example. It's a result of the default growth factor (1.5x or 50%) applied to the old capacity.
}
/*
Memory Availability: The most immediate limitation is the amount of available memory. If you continuously add elements to an ArrayList, eventually, the JVM will run out of heap memory and throw an OutOfMemoryError.

Integer.MAX_VALUE Limitation: The size of an ArrayList (like all Java arrays) is indexed by an integer. The maximum positive value of an int in Java is Integer.MAX_VALUE, which is
2
31
−
1
2
31
 −1, or 2,147,483,647. Therefore, technically, you cannot have an ArrayList (or any array) with more than Integer.MAX_VALUE elements in Java.

However, in most practical applications, you'll likely hit memory limitations before you ever approach the Integer.MAX_VALUE limit.

So, while an ArrayList can dynamically grow as you add elements, it's not limitless.
 */

/*
[1,2,3,9] => [1,2,3,9. ....] // amortised array O[1]
 */