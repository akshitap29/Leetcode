class Solution {
    public boolean checkRecord(String s) 
    {
        int n=s.length();
        int countA=0;
        int countL=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A')
            {
                countA++;
                if(countA>=2)
                {
                    return false;

                }
                countL=0;
            }
            else if(ch=='L')
            {
                countL++;
                if(countL>=3)
                {
                    return false;
                }
            }
            else
            {
                countL=0;
            }
                
        }
        return true;
            
        
    }
}