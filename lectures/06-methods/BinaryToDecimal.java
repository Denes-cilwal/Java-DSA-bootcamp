public class BinaryToDecimal {
    // {0,1}
    // decimal Number system
//    0,1,2,3,4,5,6,7.8,9  -  10 (231,6789,234,124,0) - decimal
//    (0,1) - 0 to 1

    /*
    (0)      = (0)
     10        2
     */

    public static void main(String[] args) {
        DecToBinary(1011);
    }


    static void DecToBinary(int binNum){
            int decNum = 0;
            int pow = 0;
        while (binNum > 0){
            int lastDigit =  binNum % 10; // dividend
             decNum = decNum + lastDigit * (int)Math.pow(2,pow);
             pow ++;
             binNum = binNum /10; // remainder
        }
        System.out.println("decimal is  "+ decNum);
    }


}

