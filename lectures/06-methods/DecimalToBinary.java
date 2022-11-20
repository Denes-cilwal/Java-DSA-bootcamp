public class DecimalToBinary {
    public static void main(String[] args) {
        decToBin(10);
    }

    static void decToBin(int num){
        int BinNum = 0;
        int pow = 0;
        while (num > 0){
            int rem = num % 2;
            BinNum =  BinNum + rem * (int)Math.pow(10,pow);
            pow ++;
            num =  num / 2;
        }
        System.out.println("Binary is  "+ BinNum);
    }
}


/*
oth 1st 2nd 3rd
1   0 1 0
*/

