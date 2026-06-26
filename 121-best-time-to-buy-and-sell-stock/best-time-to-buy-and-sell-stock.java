class Solution {
    public int maxProfit(int[] prices) {
        int maxprices[] = new int[prices.length];
        maxprices[prices.length-1] = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--){
            if(prices[i] > maxprices[i+1]){
                maxprices[i] = prices[i];
            }
            else{
                maxprices[i] = maxprices[i+1];
            }
        }
        int max = 0;
        for(int i = 0 ; i<prices.length ; i++){
            if( max < maxprices[i]-prices[i] )
            {
                max = maxprices[i] - prices[i];
            }
        }
        return max;
    }
}