import java.util.Arrays;

public class ChangedValue {
    public static void main(String[] args) {
        // create an array
        int[] arr  = {1, 2,3, 4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num){
        // num get value of the reference because in java no pointer  concept
        // but this is still call by value
        num[0] = 99; // you make change to object through this ref variable, same object will be changed , modifying object,not creating objects
    }
}
/*
In Java, everything is passed by value:

When you pass primitive data types (like int, float, char, etc.), the actual value is passed.
When you pass objects (or arrays, since arrays are also objects), the reference (or address) of the object is passed by value.
What does "reference passed by value" mean?:

    When you pass an object to a method, you're actually passing the memory address (reference) of that object.
 If you modify the object using that reference inside the method, the original object is affected. However,
 if you make the reference point to another object or make it null, the original reference in the calling method remains unchanged

The pass by reference method passes the parameters as a reference(address) of the original variable. The called function does not create its own copy, rather, it refers to the original values only
 */