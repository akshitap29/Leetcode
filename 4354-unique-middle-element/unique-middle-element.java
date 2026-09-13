class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        int mid=left+(right-left)/2;
        while(left<mid && right>mid)
        {
            if(nums[left]==nums[mid])
            {
                return false;
            }
            else if(nums[right]==nums[mid])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}