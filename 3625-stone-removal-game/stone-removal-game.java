class Solution {
    public boolean canAliceWin(int n) 
    {
        if(n<10)
        {
            return false;
        }
        int remove=10;
        int count=0;
        while(n>=remove)
        {
            n=n-remove;
            remove--;
            count++;

        }
        if(count%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}