public class BuildArrayForPermutation {
    public int[] buildArray(int[] nums) {
        // Initialize the ans array with the same length as nums
        int[] ans = new int[nums.length];

        // For each index i in nums, find the value of nums[nums[i]] to populate the ans array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        // Return the resulting ans array
        return ans;
    }

    public static void main(String[] args) {
        BuildArrayForPermutation solution = new BuildArrayForPermutation();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);

        // Print the result
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
