import java.util.Scanner;

public class MainMethods {
    // done
    public static void main(String[] args) {
  /*
     access modifier(we"ll look in OOP) return_type
   */
        // sum(); // return is function ends this functions call is going to have some value

        int ans = sum2(); // return value
        System.out.println( "return value is "+ ans);
    }

    // return the value
   public static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter a number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = "+ sum);
        return sum;
    }


}



