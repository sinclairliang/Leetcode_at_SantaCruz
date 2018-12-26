class Solution {
    public int rob(int[] nums) {
        //Base cases
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        //Maximize the profit from robbing
        int[] opt = new int[nums.length];

        //If only two houses, rob the house with more money
        opt[0] = nums[0];
        opt[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            //Either rob the ith house or do nothing
            //If robbing the ith house: look to see the maximum robbed from the 0th to (i-2)th houses
            //If doing nothing: Robbed the house at (i-1). We don't wanna get caught!
            opt[i] = Math.max(nums[i] + opt[i - 2], opt[i - 1]);
        }

        //Return how much money made from 0 to (n-1)th houses
        return opt[nums.length - 1];

    }
}