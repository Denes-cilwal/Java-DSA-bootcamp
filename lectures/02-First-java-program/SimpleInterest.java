import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // done
        // type conversion,type promotion provided int convert to float
        Scanner input =  new Scanner(System.in);
        // implicit type conversion => lower data type is applied to higher datatype


        float P =  input.nextInt();
        float T =  input.nextInt();
        float R =  input.nextInt();
        float res =  P * T * R / 100;
        System.out.println(res);

    }
}
