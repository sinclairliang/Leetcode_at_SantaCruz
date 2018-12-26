class Solution {
    public int maxProfit(int[] prices) {
        // traverse the array to find out the maximum difference
        // between the current number and the minimum;
        if (prices.length < 1) {
            // edge case;
            return 0;
        }

        int min = prices[0];
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            // traverse;
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxprofit) {
                maxprofit = prices[i] - min;
            }
        }
        return maxprofit;
    }
}