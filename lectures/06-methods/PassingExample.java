public class PassingExample {
    public static void main(String[] args) {
        String newName = "Lionel Messi";
        greet1(newName);
        System.out.println(newName);
    }

//    static void greet(String name) {
//        // Java is always passed by value not by pass by referenced
//        System.out.println(name);
//    }


    static void greet1(String name) {
        // Java is always passed by value not by pass by referenced
        // array is changing in Change value file but string is not changing, because string is immutable
        // also actually changing creating new object not changing original objects
        name = "david";
        System.out.println(name);
    }
}

/*
    stack                  Heap
    newName ------>   Lionel Messi()
    // when newName is passed the copy of value of reference variable is passed
    // copy of reference variable is passed
    // both reference variable pointing to same object
    newName -----------
                       |  -----"Lionel Messi"
                       |
    name---------------

    // creating newObjectReferencesVar
    - not changing object but creating new object
    newName ------- "Lionel Messi"(no change in original scope)

    name ---------- "david"(only change in its scope)
 */