import java.util.Scanner;

public class Main {
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

    }
}