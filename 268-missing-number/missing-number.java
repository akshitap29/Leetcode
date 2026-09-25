class Solution {
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int eSum=n*(n+1)/2;
        int aSum=0;
       
        for(int i=0;i<nums.length;i++)
        {
            aSum+=nums[i];

        }
        
        return (eSum-aSum);
    }
}