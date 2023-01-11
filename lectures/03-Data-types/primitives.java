
public class primitives {
    public static void main(String[] args) {
        // data types cannot be broken into other datatype is primitive datatype
        // string can be broken, so it is not primitives.
        int rollNo = 64; // 4 // not class
        char letter = 'r'; // 4 bytes


        float marks = 98.67f;

        // by default all decimal values are decimal , so if we want to store float value store with f at end
        double largeDecimalNumbers = 4567654.4567; // 8

        // double the size of integer
        long largeInteger = 3456783456786543L;
        boolean check = true;

        // int a = 10 ;  a is identifier and 10 is literal

        int y = 20;
        double y2 =  20 / 20.8;

        /*
        Integer rol = 64;  // wrapper class // to add some functionality to primitives
        rol.toString();
                   */

        // type casting | conversion
        // with type compatible
        int num = (int)(67.89f);
        System.out.println(num);
    }
}