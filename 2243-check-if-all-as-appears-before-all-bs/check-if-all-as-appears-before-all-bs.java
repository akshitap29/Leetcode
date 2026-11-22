class Solution {
    public boolean checkString(String s) 
    {
        int left=0;
        int right=1;
        while(right<s.length() && left<s.length()-1)
        {
            if(s.charAt(left)=='b' && s.charAt(right)=='a')
            {
                return false;
            }
            left++;
            right++;
        }
        return true;

    }
}