public class MaxWealth {

    //  Richest Customer Wealth
    // Input: accounts = [[1,2,3],[3,2,1]]
    //Output: 6
    //Explanation:
    //1st customer has wealth = 1 + 2 + 3 = 6
    //2nd customer has wealth = 3 + 2 + 1 = 6
    //Both customers are considered the richest with a wealth of 6 each, so return 6.
    public static void main(String[] args) {

        int[][] accounts= {
                {1,2,3},
                {3,2,1},
        };
        System.out.println(maximumWealth(accounts));
    }

    static  int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
           int  sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now we have sum of accounts of persons
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
