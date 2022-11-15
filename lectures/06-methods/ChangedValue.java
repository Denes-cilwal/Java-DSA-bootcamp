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
        num[0] = 99; // you make change to object through this ref variable, same object will be changed , modifying object
    }
}