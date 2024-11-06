
import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        // cannot be converted
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println((num));
        Scanner input1 = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println((num1));

//       ---- case - |  ----
        // type must be compatible
        // destination must be greater than int
        // condition : = ask for float but give int works but vice versa case do not
        // work
        // two side must be compatible
        // des > source
        // float(can add int and float) > int(only int)
        /*
         * float num = input.nextFloat();
         * System.out.println(num);
         */
        // float(can add int and float) > int(only int) - type conversion is not
        // possible

        /*
         * int num1 = input.nextInt();
         * System.out.println(num1);
         */

        /*
          float num1  =  input.nextInt(); // this works
          int num1 = input.nextFloat()// do not works
         -  int num1 = input.nextFloat();  gives error because num1 int type < float
         - it not automatic conversion than how do I convert it to that where type casting comes
         - narrowing conversion - float (bigger type ) ---> to small type
         - casting : explicit type conversion : narrowing conversion
         - type casting : explicit type conversion : narrowing conversion - compressing type
         - narrow to int
         - type casting () remember this
         */
        int newNumber = (int) (67.90f);
        System.out.println(newNumber);




        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1
        // the max value can store in byte is 256 but input number is 257, so it can't
        // store it so put remainder there when it cast to byte because it cannot store 257 it cannot store after 256
        System.out.println(b);


        byte c = 40;
        byte d = 50;
        byte e = 127;
        // when you are doing byte operations automatically it converts to int
        // int(4 byte -> 32 bit) > byte (8 bit)
        // c *d => 2000 but byte can only handle upto 256 , to handle this java automatically performs
        // operation using int not byte
        int res = c * d / e;
        System.out.println(res);

        // float - int + double = double (multiple types)

        // follows in unicode
        int number = 'A';
        System.out.println(number); // automatic type conversion - follows Unicode principle by java
        System.out.println();
        System.out.println();

        // type promotion rule
        System.out.println(3 * 6);
        System.out.println(3 * 6.0); // float value


        double bc = 3.5;
        // explicit type conversion

        int k =(int) bc + 8 ;

        // unicode -- Java supports
    }
}


//https://www.codingninjas.com/studio/library/type-conversion-and-type-casting-in-java
/*
type conversion => widening=> implicit conversion => done by compiler =>  float num1  =  input.nextInt()
type casting [people made casting]=> explicit => by programmer =>  byte b = (byte) (a) => higher assign to lower

 */