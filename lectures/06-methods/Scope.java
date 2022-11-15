
public class Scope {
    public static void main(String[] args) {
        // every variable defined here will be accessed within this block
        int a = 20;
        int b  = 20;

        //  System.out.println(num); // num do not have scope over here


        {
            System.out.println(a);
        }
            a =  78; // allowed
//            int a =  68; // already defined in this scope , same block cannot be initialized again
         int c = 23;
            System.out.println(c);
//        }
        System.out.println(c); // cannot be acess outside the block

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
//           System.out.println(a);  // scoping concepts learned
    }
}