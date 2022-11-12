public class Shadowing {
    static int x  = 80; // this will be shadow at line 13
    // lower level is shadowing | hiding upper level

    // accessing same variable under overlap conditions

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        // scope changes shadowing concept
        //int x ; //   // scope will begins when value is only initialized, decalring doesnot works

        System.out.println(x);
        func();
    }

    static void func(){
        System.out.println(x);
    }
}