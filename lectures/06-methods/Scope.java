
public class Scope {
    public static void main(String[] args) {
        // every variable defined here will be accessed within this block
        int a = 20;
        int b  = 30;
        System.out.println(b);

        //  System.out.println(num); // num do not have scope over here

//        System.out.println(s); // cannot be accessed inside s varibale
        {

            int s = 45;
         b= 7; // reassign the origin ref variable new value. but already initialized outside the block cannot be reinitialized again
            System.out.println(a);
        }

        System.out.println("asndlasndlna ln ");
        System.out.println(b);
//        System.out.println(s); //not allowed
            a =  78; // allowed
//            int a =  68; // already defined in this scope , same block cannot be initialized again
         int c = 23;
            System.out.println(c);
//        }
        System.out.println(c); // cannot be access outside the block

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


// function scope only with function with local variables