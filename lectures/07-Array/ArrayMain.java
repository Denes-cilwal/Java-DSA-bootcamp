public class ArrayMain {

    public static void main(String[] args) {
        // Q : store a number
        int a = 19;

        // Q . store 5 roll numbers
        int a1 = 19;
        int a2 = 19;
        int a3 = 19;
        int a4 = 19;
        int a5=20;

        // array is collection of primitive, complex data types
        // list of elements of same type
        // placed in contiguous memory location
        // syntax
        // datatype[] variable_name  = new datatype[size]
        // stores 5 roll no
        // data type must be same


        int[] num = new int[5];
        // int[] - represent type of data stored in data structure
//        or directly
        // referencing variable is pointing to array objects
        int[] num2 = {23, 12,45,67,67};


        // internal working
        int[] ros; // declare of array, here ros is getting defined into the stack(not pointing to object here)
        ros = new int[5]; //  ;actual memory creation (actual object is being created in the heap memory)

// size is defined in compile time not in runtime(size does not depend upon run time )
        /*
        compile  time()                run time (dynamic memory allocation or execution time)
        int [] arr = new int[5]; - creating object in heap memory
        |        |
        datatype |
                 ref variable
    */

//        |3|8|19|12|7|28|33|  --  IN C ++, IS CONTINUOUS MEMORY ALLOCATION IN RAM CELL

        // IN JAVA THERE IS NO CONCEPT CALLED POINTERS
        // heap objects are not continuous
        // array objects are in heap
        // Dynamic memory allocations
        // may not be continuous(though array say continuous but java array is not continuous)
        // depends upon JVM


        System.out.println(num2[0]);


        // new keyword
        // used to create an object in the heap memory of array 5


        // null cannot be assigned to primitives
        // null is just literal
        // by default value of what reference variables points to
        // you can assign to only any non-primitives, but you cannot

//        null a = null - not allowed
//        int num = null;


        String[] arr  = new String[4];
        System.out.println("oo");
        System.out.println(arr[0]);


        // what if you have array of objects
        // internal working of object array
        // in pythons all are objects , no primitives
        // in java primitives are stored in stack but all other array,custom type objects stored in heap
        // String [] arr = new String[5];
        // primitives are char, bool, num,float

/*
internally stored                       // reference variable
        (stack)   arr ----------> (heap [r1,r2, r3,r4])  r1- arr[0] = null (by default) points to null so giving null in 70
                               | |    |  |
                               2 3    5  6  ---- actual object somewhere store in heap
        */

//        Scanner in = new Scanner(System.in);
//
//
//        int[] arr1  = {2,16,78,9,8,16};
//   // input using for loops
//        for (int i =0; i< arr.length ; i++){
//            arr[i] =
//        }

        int[] arr1 =  new int[5];
        System.out.println(arr1[0]);


    }



    // pass by value | pass by references
    // Java is always passed by value (in case of primitives
    // value of object references ie address (stack) vs object data  (in heap)
    // pass by value(but object references) - so mutability is achieved

}

