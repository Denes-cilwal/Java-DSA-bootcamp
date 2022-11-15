
public class typePromotion {

    public static void main(String[] args) {
        // Java automatically promotes each byte short or char operand to iny
        // when evaluating en expression.
        // if one operand is long, float or double the whole expression is promoted to
        // long,float or double respectively

        char a = 'a';
        char b = 'b';

        System.out.println(b - a);

        short x = 5;
        byte y = 25;
        char c = 'c';

        byte bt = (byte) (a + b + c);
        System.out.println(c);

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
       byte  m = (byte)(n * 2);
        System.out.println(m);

    }

}
