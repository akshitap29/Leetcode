class Solution {
    public String longestPalindrome(String s) 
    {
        int maxlength=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=expandAroundCentre(s,i,i);
            int len2=expandAroundCentre(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>maxlength)
            {
                maxlength=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxlength);
        
    }
    public int expandAroundCentre(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}