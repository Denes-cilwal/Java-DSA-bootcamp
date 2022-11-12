public class Arguments {
    public static void main(String[] args) {
        int SumValue  = sum(2, 3); // actual
        System.out.println("The sum value is "+SumValue);
    }

    static int sum(int a , int b){
        // value is actually gets copied
        // formal params are local variables used in sub program
        int sum  =  a + b;
        return  sum;

    }
}