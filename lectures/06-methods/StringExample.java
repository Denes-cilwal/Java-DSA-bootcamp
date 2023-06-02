import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = greet(); // return string
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println(personalized);
        sum3(1,2);

       String na = greet1();
       System.out.println(na);
    }
    static String myGreet(String name) {

        return "Welcome" + name;
    }

    static String greet() {
        return "How are you!";
    }

    static  int sum3(int a, int b ){

            int sum =  a + b;
            return  sum;
    }

    static String greet1(){
        return  "Hello";
    }


}