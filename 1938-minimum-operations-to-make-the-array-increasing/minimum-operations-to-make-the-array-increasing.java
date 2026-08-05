class Solution {
    public int minOperations(int[] nums) 
    {
        if(nums.length==1)
        {
            return 0;
        }
        
        int ans=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int count=0;
            if(nums[i+1]<=nums[i])
            {
                count=nums[i]-nums[i+1]+1;
                ans=ans+count;
                nums[i+1]=count+nums[i+1];
            }
        }
        return ans;


        
    }
}