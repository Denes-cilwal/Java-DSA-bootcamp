import java.util.Scanner;


// entry point main func
public class Main {

    // making public means this can be executed from anywhere
    // since it is static , we want to run this main function without creating objects
    // since this is first things we want to run, so we do not create objects
    public static void main(String[] args) {
        // take input from system from keyboard
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter some Input:");
        // scans input as int
        int rollNo = Input.nextInt();
        System.out.println("Your roll no is:" + rollNo);

        // string , integer also have class wrapper class
        String name = Input.nextLine();
        System.out.println(name);

        System.out.println("HelloWorld!");

    }
}

// env var is just folder address where your computer will check if your executable file exist or not
