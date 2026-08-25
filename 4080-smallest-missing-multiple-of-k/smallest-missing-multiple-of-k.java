class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        int multiple=k;
        while(true)
        {
            boolean found=false;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==multiple)
                {
                    found=true;
                    break;
                }
                
            }
            if(!found)
            {
                return multiple;
            }
            multiple+=k;

        }
    }
}