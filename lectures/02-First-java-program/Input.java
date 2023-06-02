import java.util.Scanner;

// Scanner came from java utils package
// primitives types
public class Input {
    public static void main(String[] args) {
        // create object of class using new keyword
        // value that we passed in where from input is taken
        // Scanner(System.in) // constructor initialization
        // System.in is default stream input
        // pass primitive types in Scanner
        // Scanner takes from where you are taking input

        Scanner input =  new Scanner(System.in);

        // modify out
        // next Integer
        // out is
       System.out.println(input.nextInt());

       // next string
        System.out.println(input.nextInt());

        // next line
        System.out.println(input.next());

    }
}