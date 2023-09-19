package src.com.dinesh.Intro;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n){
        if (n < 2){
            return  n;
        }
        // this is not tail recursion
        return fibo(n-1) + (n-2);
    }
}
