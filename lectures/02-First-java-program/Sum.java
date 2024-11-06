
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//         condition :- 2 types must be compatible
//         des type from be greater than src type

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt(); // input mismatch if you give string here
        int num3 = input.nextInt();
        int sum = num1 + num2+ num3;
        System.out.println("Sum = " + sum);

    }
}
