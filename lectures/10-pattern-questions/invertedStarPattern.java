public class invertedStarPattern {
    public static void main(String[] args) {
      /*
        * * * *
        * * *
        * *
        *

       */
   // outerLoop 4 lines - 4 times
        // innerLoops

        int n = 4;
        for (int lines = 1; lines <= n; lines++) {
            for (int star = 1; star <= n-lines +1 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
