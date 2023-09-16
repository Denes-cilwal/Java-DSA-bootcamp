import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // function overloading
        // case : I  - you have integer value so I will give string value
        System.out.println(56);

        // case : II - prints string [taking string returns string value]
        System.out.println("kunal");

        // case : III - here is print object
        System.out.println(new int[]{2,3,4,5});  // it is printing some random value
        // [I@5acf9800 //how - it is internally calling String.valueOf(x) which is internally calling toString() that return hash code some unique number;

        // but what I want is I do not want some hash value I do not need this no use of it so return me some value which I can use it
        System.out.println(Arrays.toString(new int[]{2,3,4,5})); // now I am overriding 3rd case this is overriding [2,3,4,5] // this is just string

        // case : IV
        String name = null;
        System.out.println(name);


        // case : V
        // Integer num = new Integer(56) ;
        // using wrapper class allows to use function since it is not primitives
        // System.out.println(num.toString()) ==  sout(num) //no need to do toString()

    }
}
