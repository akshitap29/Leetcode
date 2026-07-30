class Solution {
    public boolean judgeCircle(String moves) 
    {
        int count1=0;
        int count2=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            switch(ch)
            {
                case 'L':
                {
                    count1++;
                    break;
                }
                case 'R':
                {
                    count1--;
                    break;
                }
                case 'U':
                {
                    count2++;
                    break;
                }
                case 'D':
                {
                    count2--;
                    break;
                }
            }
        }
       
        if(count1==0 && count2==0)
        {
            return true;
        }
        return false;
        
    }
}