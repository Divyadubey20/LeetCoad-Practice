class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        int buy = prices[0];
        int prof = 0;
        for (int i = 0; i < p; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > prof) {
                prof = prices[i] - buy;
            }

        }
        return prof;
    }
}