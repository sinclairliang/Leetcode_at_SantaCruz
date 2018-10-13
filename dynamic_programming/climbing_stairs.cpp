class Solution {
public:
    int climbStairs(int n) {
        int dp[n + 1] = { 0 }; 
        return stairsRecursive(n, dp);
    }
    
    int stairsRecursive(int n, int dp[]) {
        if (dp[n] != 0) return dp[n];
        else if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            dp[n] = stairsRecursive(n - 1, dp) + stairsRecursive(n - 2, dp);
            return dp[n];
        }
    }
};