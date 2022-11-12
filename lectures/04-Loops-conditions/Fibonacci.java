
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Q. Find nth Fibonacci series

        // 0,1,1,2,3,5,8,13
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*
         * int fib = 0;
         * for (int i = 1; i <= n ; i++) {
         * fib = (i - 1) + i;
         * }
         * System.out.println(fib);
         */

        /*
         * int a = 0;
         * int b = 1;
         * int count = 2;
         * int fib = 0;
         * while (count <= n){
         * fib = (count -1) + count;
         * count ++;
         * }
         * System.out.println(fib);
         */

        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

}