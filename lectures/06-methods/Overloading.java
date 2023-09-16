public class Overloading {
    // done
    public static void main(String[] args) {
        fun(67);
        fun("david");

    }


    // two function can exist if same function have same name but diff args datatype
    // overloading happens in compile time, decides when function to run
    // calling happens in call stack frame, needs to decide which function to call
    // function overloading happens at compile time while function over-riding happens at run time
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }
}
