public class PassingExample {
    // done
    public static void main(String[] args) {
        String newName = "Lionel Messi";
        // copy of value of referenced variable is passed in new Name
        greet1(newName);
        System.out.println(newName);
    }

//    static void greet(String name) {
//        // Java is always passed by referenced value  not by pass by referenced
//        System.out.println(name);
//    }


    static void greet1(String name) {
        // Java is always passed by value not by pass by referenced
        // array is changing in Change value file but string is not changing, because string is immutable
        // also actually creating new object not changing original objects
        name = "david";
        System.out.println(name);
    }
}

/*
    stack                  Heap
    newName ------>   Lionel Messi()
    // when newName is passed the copy of value of reference variable is passed
    // copy of value of reference variable is passed
    // both reference variable pointing to same object
    newName -----------
                       |  -----"Lionel Messi"
                       |
    name---------------

    // creating newObjectReferencesVar
    - not changing object but creating new object(creating new value)
    newName ------- "Lionel Messi"(no change in original scope)

    name ---------- "david"(only change in its scope)
 */

