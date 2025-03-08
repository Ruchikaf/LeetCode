class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int curr = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < curr) {
                curr = prices[i];

            } else {
                maxprofit = (int) Math.max(maxprofit, prices[i] - curr);
            }
        }
        return maxprofit;
    }
}