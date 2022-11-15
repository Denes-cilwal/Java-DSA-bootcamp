public class Shadowing {
    // static scope variable
    static int x  = 80; // this will be shadow at line 12
    // lower level is shadowing | hiding upper level

    // accessing same variable under same scope on overlap conditions

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        // scope changes shadowing concept
        //int x ; //   // scope will begins when value is only initialized, declaring does not work

        System.out.println(x);
        func();
    }

    static void func(){
        System.out.println(x);
    }
}