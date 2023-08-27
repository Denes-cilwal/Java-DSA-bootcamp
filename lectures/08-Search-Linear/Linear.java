public class Linear {
    // using enhanced loop
    public static void  main(String []args){
        int[] arr =  {12, 13,14,15, 16, 17};
        int target =  17;
       int result =  LinearSearch(arr, target);

       if (result ==  -1) {
           System.out.println("Not Found");
        }else{
            System.out.println("Element Found at index = " + result);
        }
    }

    static int LinearSearch(int[] arr, int targetElement){
            if( arr.length == 0){
                return -1;
            }

            // it will take value
        int index = 0;
        for (int value:
             arr) {
           if( value == targetElement) {
               return index;
            }
        index ++;
        }

        return -1;
    }
}
