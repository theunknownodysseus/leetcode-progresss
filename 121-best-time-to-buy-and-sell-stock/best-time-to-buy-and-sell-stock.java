class Solution {
    public int maxProfit(int[] prices) {
        int min = 100000;
        int profit = 0;
        for(int i = 0 ; i<prices.length ; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}