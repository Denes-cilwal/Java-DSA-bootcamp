import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr =  { 5,7,7,8,8,10};
        int target = 8;
      int[] result  = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,1};
        // check for first occurrence of target first
        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
           ans[1] = search(nums,target,false);

        }
        return ans;
    }


    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                // if ans is the mid then might be possible that there are other  element in left apply binary search
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

// log(N) + log(N) --  time complexity - 2log(N) - constant is ignored here ---