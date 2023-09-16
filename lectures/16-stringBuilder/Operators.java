import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // adding ascii value = 195
        System.out.println("a" + "b"); // ab
        System.out.println((char)('a' + 3)); // d

       // this is same as after "a" + "1";
        System.out.println("a" + 1); // a1// Integer will be converted to Integer that will call toString()

        //
        System.out.println("tech" + new ArrayList<>()); // tech[]

        System.out.println("tech" + new Integer(56));// tech56



        // plus operator can be used in primitves and with complex object as well but at least one type must be string
        // System.out.println(new Integer(56) + new ArrayList<>()); // we cannot use like this
        // in python , c++ it allows
        // operator minus can be applied to string
        System.out.println(new Integer(56) + "" +new ArrayList<>()); // this works and entire result will be string type

            // in string object plus operator is being overloaded

    }
}
