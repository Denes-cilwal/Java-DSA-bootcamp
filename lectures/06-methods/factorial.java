import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n) {
        int f = 1;
        // n! = n (n-1)(n-2) ..... X 1 = n * (n-1)!;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
