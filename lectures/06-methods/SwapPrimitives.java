public class SwapPrimitives {

    // pass by value vs pass by reference
    // java always call by value reference
    public static void main(String[] args) {
        int a  =10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b); // is this actually going to swap or not - Ans is no
        System.out.println("am =" + a);
        System.out.println("bm =" + b);


    }

    static void swap(int a, int b) {

        // a and b scope is till functions
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

    static  void  swa1p(int a , int b){
            int temp = a;
            a = b;
            b = temp;

    }


}


/*
 //  primitive are int, string, char, byte are passed by value
 //  objects and references  - passing by value of that reference variables both pointing to same object [reference object is passed]
 */