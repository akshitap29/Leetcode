class Solution {
    public int minOperations(List<Integer> nums, int k) 
    {
        int count=0;
        List<Integer> arr=new ArrayList<>();
        int marked=0;
        for(int i=nums.size()-1;i>=0;i--)
        {
            if(!arr.contains(nums.get(i)) && nums.get(i)<=k)
            {
                arr.add(nums.get(i));
                marked++;
                if(marked==k)
                {
                    return nums.size()-i;
                }
            }
        }
        return -1;
        
        
    }
}