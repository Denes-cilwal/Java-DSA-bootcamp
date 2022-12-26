import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // type conversion,type promotion provided int convert to float
        Scanner input =  new Scanner(System.in);
        float P =  input.nextInt();
        float T =  input.nextInt();
        float R =  input.nextInt();
        float res =  P * T * R / 100;
        System.out.println(res);

    }
}
