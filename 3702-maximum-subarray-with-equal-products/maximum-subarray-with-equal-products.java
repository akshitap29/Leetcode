class Solution {
    public int maxLength(int[] nums) 
    {
        
        int ans=0;
       
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            int lcm=nums[i];
            int gcd=nums[i];
            
            for(int j=i;j<nums.length;j++)
            {
                int oldLcm=lcm;
                product*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=(oldLcm/gcd(oldLcm,nums[j]))*nums[j];
                if(product==lcm*gcd)
                {
                    ans=Math.max(ans,j-i+1);
                }

            }
            

        }
        return ans;
        
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int lcm(int a,int b)
    {
        return (a/gcd(a,b))*b;
    }
}