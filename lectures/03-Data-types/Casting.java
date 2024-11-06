import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num =  input.nextFloat(); // taking integer but it automatically converts to float
        // two conditions should be meet
        // des type must be greater than integer type and type compatible
        // here integer can only store integer value but float can store both integer and decimal value
        // left handle > right hand side (float > int)

        System.out.println(num);
    }
}
