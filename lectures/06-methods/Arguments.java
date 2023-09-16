import java.util.*;
public class Arguments {
    public static void main(String[] args) {
        int SumValue  = sum(2, 3); // actual parameters
        System.out.println("The sum value is : "+SumValue);
    }





    // syntax with parameters : formal (copy)
    static int sum(int a,int  b){
        // a will be replaced with 2 and b with 3
        // value is actually gets copied
        // formal params are local variables used in sub program
        int sum  =  a + b;
        return  sum;

    }

    // call stack : function occupies memory , call stack tracks function call





}