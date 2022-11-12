
public class Scope {
    public static void main(String[] args) {
        int a =  10;
        int b  = 20;

        //  System.out.println(num); // num do not have scope over here

        /*
        {
            int a =  78; // // re declared with in this block
        }
        */
        a = 90; // can be modified


        // scoping in for loops
        for (int i = 0; i<4; i++){
            System.out.println(i);
        }
//        System.out.println(i); // cannot access outside of loop scope
    }

    static void random(){
        int num =  67;
        System.out.println(num);
        //   System.out.println(a);  // scoping concepts learned
    }
}