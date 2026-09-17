class Solution {
    public int minSumOfLengths(int[] arr, int target) 
    {
       int left=0;
       int sum=0;
       int ans=Integer.MAX_VALUE;
       int[] best=new int[arr.length];
       Arrays.fill(best,-1);
       for(int i=0;i<arr.length;i++)
       {
        sum+=arr[i];
        while(sum>target)
        {
            sum-=arr[left];
            left++;
        }
        if(i>0)
        {
            best[i]=best[i-1];
        }
        if(sum==target)
        {
            int len=i-left+1;
            if(left>0 && best[left-1]!=-1)
            {
                ans=Math.min(ans,len+best[left-1]);
            }
            if(best[i]==-1)
            {
                best[i]=len;
            }
            else
                best[i]=Math.min(best[i],len);
        }
       }
       return ans==Integer.MAX_VALUE?-1:ans;
    }
}