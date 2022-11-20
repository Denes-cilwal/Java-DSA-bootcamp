

public class SearchMain {
    public static void main(String[] args) {
        int[] num = {12,3,4,15,6,8,9,10,14,15};
        int target = 15;
        int ans =  linearSearch(num, target);
        System.out.println(ans);
    }

    // search for target and return the true or bool
    static boolean linearSearch3(int[] arr, int target ){

        if (arr.length == 0){
            return false;
        }

        // run a loop and return index
        // Case - I
        for (int element:
                arr) {
            if(element == target){
                return true;
            }
        }
        // this line will execute of none of the return statements above have executed
        // hence no target found
        return false;

    }

    // search for target and return the element
    static int linearSearch2(int[] arr, int target ){

        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }

        // run a loop and return index
        // Case - I
        for (int element:
                arr) {
            if(element == target){
                return element;
            }
        }
        // this line will execute of none of the return statements above have executed
        // hence no target found
        return Integer.MAX_VALUE;

    }
    // Search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target ){

        if (arr.length == 0){
            return -1;
        }

        // run a loop and return index
        // Case - I
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is a target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute of none of the return statements above have executed
        // hence no target found
        return -1;

    }
}