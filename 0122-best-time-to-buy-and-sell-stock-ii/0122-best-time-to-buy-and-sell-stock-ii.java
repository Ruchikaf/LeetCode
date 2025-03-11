class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr = prices[0]; // curr=7
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < curr) {
                curr = prices[i];
            } else {
                maxProfit = maxProfit + (prices[i] - curr);
                curr = prices[i];
            }
        }
        return maxProfit;
    }
}