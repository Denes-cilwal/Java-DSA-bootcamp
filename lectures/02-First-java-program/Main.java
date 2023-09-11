import java.util.Scanner;


// entry point main func
// staring with cap letter means this is class this is convention
// this should be always public as this is the things we want to execute first
public class Main {
    // done
    // making public means this can be executed from anywhere
    // whenever we create class we need object to use that class,but also we want to execute main class without using objects that is why
    // use static
    // since it is static, we want to run this main function without creating objects
    // since this is first things we want to run, so we do not create objects
    // class name should be same as psv - name
    // psvm p is public means it must be run from any-where
    // for me and all people population of world is same, do we need separate objects no
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
