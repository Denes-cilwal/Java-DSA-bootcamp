
public class typePromotion {

    public static void main(String[] args) {
        // type promotion rule
        // Java automatically promotes each byte short or char operand to int
        // when evaluating en expression.
        // if one operand is long, float or double the whole expression is promoted to
        // long,float or double respectively

        char y4;
      //  System.out.println(y4); // this is not problem in go takes default value
        char a = 'a';
        char b = 'b';

        System.out.println(b - a); // ascii 98-97 = 1

        short x = 5;
        byte y = 25;
        char c = 'c';

        byte bt = (byte) (a + b + c);
        System.out.println(c);

        /*
        *
         * 97 + 98 + 99 = 294
         * Casting to byte: Since 294 exceeds the byte range (-128 to 127),
         * it wraps around due to overflow when cast to byte.
         * The resulting value is calculated as 294 - 256 = 38 or 294mod256=38
         */

        // converted to largest, all datatype will be converted to double

        int d = 10;
        float e = 20.25f;
        long f = 25;
        double g = 30;
        double ans = d + e + f + g;
        System.out.println(ans);

        // wrong type promotions in Expressions
        byte n = 5;
        // type promotion with type casting
        byte  m = (byte) (n * 2);
        System.out.println(m);

        // char is larger than byte
        // the range of byte is between -128 to 127 but the range of char is from 0 to 65535 because a byte is a signed 8-bit data type and char is an unsigned 16-bit data type hence, its maximum value is 2 ^ 16 - 1 which is 65535.
        char z = 'm';
        byte byt = (byte) z;

//        higher value promotion
        // promoted to higher value char,
        // byte -> int
        // int --> float
        // float --> double
    }

}
