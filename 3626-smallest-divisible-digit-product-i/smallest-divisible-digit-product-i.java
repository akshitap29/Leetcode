class Solution {
    public int smallestNumber(int n, int t) 
    {
        while(n<10)
            {
                if(n%t==0)
                {
                    return n;
                }
                else
                {
                    n++;
                }
            }
        while(n>0)
        {
            
            
            int lastdigit=n%10;
            int temp=n;
            temp=temp/10;
            int product=temp*lastdigit;
            if(product%t==0)
            {
                return n;
            }
            else
            {
                n++;
            }

        }
        return 0;
        
    }
}