class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int global_max = nums[0];
        int dp[nums.size() + 1];
        dp[0] = nums[0];
        
        for (int i = 1; i < nums.size(); ++i) {
            dp[i] = nums[i] + max(dp[i - 1], 0);
            global_max = max(dp[i], global_max);
        }
        
        return global_max;
    }