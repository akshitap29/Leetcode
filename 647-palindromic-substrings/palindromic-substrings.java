class Solution {
    public int countSubstrings(String s) 
    {
        int count=0;
       
        for(int i=0;i<s.length();i++)
        {
            int cn1=countPalindromes(s,i,i);
            int cn2=countPalindromes(s,i,i+1);
            count+=cn1+cn2;
        }
        return count;
        
    }
    public int countPalindromes(String s,int left,int right)
    {
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
        return count;
    }
}