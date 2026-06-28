class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = prices[0];
        int profit = Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(prices[i],minPrice);
            profit = Math.max(profit,prices[i] - minPrice);
        }
        return profit;
    }
}
