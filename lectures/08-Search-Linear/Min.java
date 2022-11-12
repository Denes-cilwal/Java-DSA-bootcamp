public class Min {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the min value in the array
    static int min(int[] arr){
        int ans = arr[0];

        // compare each element in index with ans i.e element of zero index
        for (int i = 1; i <arr.length ; i++) {
            // start searching and comparing from index 1
            if (arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}