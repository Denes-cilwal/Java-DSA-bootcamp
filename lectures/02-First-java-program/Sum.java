
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // condition :- 2 types must be compatible
        // des type from be greater than src type
        Scanner input = new Scanner(System.in);
        double num1 = input.nextFloat();
        float num2 = input.nextInt();
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
