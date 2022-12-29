public class PairsInArray {

    public static void main(String[] args) {
        /*
        (2,4)(2,6)(2,8)(2,10)
        (4,6)(4,8)(4,10)
        (6,8)(6,10)
        (8,10)
         */
        int[] arrNum = {2,4,6,8,10};
        printParis(arrNum);

    }
    public static  void  printParis(int[] num){
        int tp = 0;
        for(int i = 0; i < num.length; i++){
            int curr =  num[i];
                for (int j = i+1 ; j<num.length; j ++){
                    System.out.print("(" + curr + "," + num[j] + ")");

                }

            System.out.println();
        }
    }

}
