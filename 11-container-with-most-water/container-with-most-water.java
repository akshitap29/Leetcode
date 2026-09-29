class Solution {
    public int maxArea(int[] height) 
    {
        int maxA=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            int curr=Math.min(height[left],height[right])*(right-left);
            maxA=Math.max(curr,maxA);
            if(height[left]<height[right])
            {
                left++;
            }
            else if(height[right]<height[left])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxA;
        
    }
}