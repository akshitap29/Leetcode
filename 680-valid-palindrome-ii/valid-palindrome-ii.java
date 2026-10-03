class Solution {
    public boolean validPalindrome(String s) 
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else 
            {
                
                if(isPalindrome(left+1,right,s))
                {
                    return true;
                }
                else if(isPalindrome(left,right-1,s))
                {
                    return true;
                }
                else
                {
                    return false;
                }
              
            }
            
        }
        return true;
        
    }
    public boolean isPalindrome(int left,int right,String s)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}