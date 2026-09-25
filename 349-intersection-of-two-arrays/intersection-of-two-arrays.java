class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        for(Integer i:set1)
        {
            if(set2.contains(i))
            {
                ans.add(i);
            }
        }
        int[] result=new int[ans.size()];
        int index=0;
        for(Integer i:ans)
        {
            result[index]=i;
            index++;
        }
        return result;
        
    }
}