import java.util.Arrays;
public class VarArgs{
    // take variable number of args
    public static void main(String[] args) {
        func(2,3,4,5,6,7,8,9);
        multiple(2,3,"s");
    }
    static void func(int ...v){
        // taking variable length args
        // if you do not know numbers of args to be taken
        // internally it is taking array in functions
        System.out.println(Arrays.toString(v));
    }

    // multiple args type
    static void multiple(int a , int b, String ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }

}