class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int index=0;
        for(int i=0;i<nums2.length;i++)
        {
            
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
            {
                result[index]=nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
                index++;
            }
        }
        return Arrays.copyOf(result,index);
        
    }
}