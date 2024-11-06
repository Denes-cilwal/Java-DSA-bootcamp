public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64; // int is primitive data type // 4 bytes
        char letter =  'r'; // primitive // 4 bytes
        float marks = 98.6f; //  by default all decimal values are decimal ,
        // so if we want to store float value store with f at end
        double largeDecimalNumber = 4567854.4567;
        long largeInteger = 3456789456789043L; // 8 bytes (long stores provides large integer value over int)
        boolean check = true;

        // string is not primitive
        // the string can be break down into individual characters
        String name = "Kunal";

        // the one starting from cap letter then we use String, Integer (wrapper class - to add extra functionality)
        // all the comments will be ignored by compiler

        /*
        Integer rol = 64;  // wrapper class // to add some functionality to primitives
        rol.toString();
         */

       //  int a = 234, 000,000; // comma is not allowed
        int b = 234_000_000; // under_score is allowed
    }
}
