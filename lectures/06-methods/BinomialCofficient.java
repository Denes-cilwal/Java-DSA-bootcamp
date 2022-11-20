import java.util.Scanner;

public class BinomialCofficient {
    public static void main(String[] args) {
// n C r =  n ! / r !(n-r)!
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        int r = sc.nextInt();
      
        System.out.println(binCoff(n,r));
    }



    static int factorial(int n) {
        int f = 1;
        // n! = n (n-1)(n-2) ..... X 1 = n * (n-1)!;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int binCoff(int n , int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fact_nr = factorial(n-r);
        int bin_Coff = fac_n/(fac_r*fact_nr);
        return bin_Coff;

    }
}


