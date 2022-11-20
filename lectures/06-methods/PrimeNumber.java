import java.math.*;
public class PrimeNumber {
    // checkifPrimerNot
        // number -  1 and itself - 1 way
        //
    public static void main(String[] args) {
//     CheckIfPrime(7);
        primesInRange(20);
    }

//    only for n > 2;
   static boolean CheckIfPrime(int num){

        // corner case
        if  (num ==2 ){

            return true;
       }

        int count = 2;
//        boolean isPrime = true;
       for (int i = count; i <=Math.sqrt(num) ; i++) {
           // optimized ways is to reduce factor
           /*
           1* 6
           2* 3
           3 * 2
           6 *1
             */
           if (num
                   % i == 0
           ){
//               isPrime = false; // composite
//               break; // run statements after loop
               return false; // return from here
           }
       }
       return true;
    }


    // primeInRange
    static void primesInRange(int n){
//        iterate from 2 to 20
        for (int i = 2; i <=n ; i++) {
            if (CheckIfPrime(i)) {

                System.out.println(i + ""); // 2 10 20;
            }
        }
    }


}
