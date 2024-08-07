class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;//The minimum profit we can make is zero.
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }
}
