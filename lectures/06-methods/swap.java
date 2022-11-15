public class swap {
    public static void main(String[] args) {
        int a  =10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b); // is this actually going to swap or not - Ans is no
        System.out.println(a + ""+ b);


    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}


/*
 //  primitive are int, string, char, byte are passed by value
 //  objects and stuff - passing value of the reference variables
 */