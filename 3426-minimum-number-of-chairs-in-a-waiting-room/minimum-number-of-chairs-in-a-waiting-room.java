class Solution {
    public int minimumChairs(String s) 
    {
       int current=0;
       int maxChairs=0;
       for(int i=0;i<s.length();i++)
       {
            char ch=s.charAt(i);
            if(ch=='E')
            {
                current++;
                maxChairs=Math.max(maxChairs,current);
            }
            else
            {
                current--;
            }
       }
       return maxChairs;

        
    }
}