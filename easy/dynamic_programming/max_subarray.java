class Solution {
    public int maxSubArray(int[] nums) {
        // maintain two values while traversing the array;

        // assume the current max number and overall max number 
        // are the first number;
        int curr_max = nums[0];
        int overall_max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // traverse the array;
            curr_max = Math.max(nums[i], curr_max + nums[i]); // I am gonna add up all the number up till this point, unless there is a number bigger than the sum so far;
            overall_max = Math.max(curr_max, overall_max); // updating the max with the for loop;
        }
        return overall_max;
    }
}