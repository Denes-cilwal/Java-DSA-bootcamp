public class HalfPyramid {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4

         */

        for (int line = 1; line <= 4; line++) {
            for (int pyramid = 1; pyramid <= line ; pyramid++) {
                System.out.print(pyramid);
            }
            System.out.println();

        }
    }
}
