import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }

    }
}
