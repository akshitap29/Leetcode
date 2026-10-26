class Solution {
    public void nextPermutation(int[] nums) 
    {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i<0)
        {
            int first=0;
            int last=nums.length-1;
            while(first<last)
            {
                int rev=nums[first];
                nums[first]=nums[last];
                nums[last]=rev;
                first++;
                last--;
                
            }
            return;
        }
        int pivot=i;
        int j=nums.length-1;
        while(j>=0 && nums[j]<=nums[pivot])
        {
            j--;
        }
        int temp=nums[pivot];
        nums[pivot]=nums[j];
        nums[j]=temp;
        int left=pivot+1;
        int right=nums.length-1;
        while(left<right)
        {
            int newtemp=nums[left];
            nums[left]=nums[right];
            nums[right]=newtemp;
            left++;
            right--;
        }
        
    }
}