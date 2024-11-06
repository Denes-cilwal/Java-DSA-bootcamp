import java.util.Scanner;

// Scanner came from java utils package
// primitives types
public class Input {
    public static void main(String[] args) {
        /*
        * create object of class using new keyword
        * value that we passed in where from input is taken
        * Scanner(System.in) // constructor initialization
        * System.in is default stream input
        * pass primitive types in Scanner
        * Scanner takes from where you are taking input
        * System is a class which contains out variable which contains print stream which takes string input
        * System.in is your default keyword input stream
        * System.out means standard output stream and in standard output stream print something
        * println in the out whatever you have output here is console
        * out is a reference variable for print stream
        * by default out value is null,
        * but you can provide your out where you want to output or write that
        * out = file.txt
        * */




        Scanner input =  new Scanner(System.in);
        // creating objects and parsing parameters - constructor intialization
        // input.nextInt() // function provided by scanner class

        // modify out
        // next Integer
        System.out.println(input.nextInt());


       // next string
        System.out.println(input.next());

        // next line
        System.out.println(input.next());

    }
}