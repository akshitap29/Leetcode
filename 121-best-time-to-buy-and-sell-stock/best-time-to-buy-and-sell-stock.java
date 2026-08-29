class Solution {
    public int maxProfit(int[] prices) 
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int curr:prices)
        {
            if(curr<minprice)
            {
                minprice=curr;
            }
            else
            {
                maxprofit=Math.max(maxprofit,curr-minprice);
            }
        }
        return maxprofit;
      
    }
}