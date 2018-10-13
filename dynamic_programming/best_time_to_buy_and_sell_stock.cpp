class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int global_max = 0;
        int local_max = 0;
        
        for (int i = 1; i < prices.size(); ++i) {
            local_max += prices[i] - prices[i - 1];
            if (local_max < 0) local_max = 0;
            if (global_max < local_max) global_max = local_max;
        }
        
        return global_max;
    }
};