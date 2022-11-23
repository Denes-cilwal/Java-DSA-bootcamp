import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target =34;
        int[] ans = search(arr, target); // format of return value{row,col};
        System.out.println(Arrays.toString(ans));
        System.out.println(search(arr, target));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target){
                    // return single array
                    // return {row,col} ; initialized but not declared so use new
                    return new int[]{row, col};
                }
            }
        }
        return  new int[]{(int) (-1.-1)};

    }
}


// search in 2d using for each loop