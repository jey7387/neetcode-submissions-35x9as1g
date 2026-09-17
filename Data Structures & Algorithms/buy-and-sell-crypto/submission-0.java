class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max(prices[j]-prices[i],max);
                 
            }
        }
        if(max<0) return 0;
        return max;
    }
}
