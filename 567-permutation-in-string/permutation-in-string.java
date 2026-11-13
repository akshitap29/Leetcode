class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s2.length()<s1.length())
        {
            return false;
        }
        int[] s1Freq=new int[26];
        int[] windowFreq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            s1Freq[s1.charAt(i)-'a']++;
        }
        int left=0;
        int right=s1.length()-1;
        for(int i=0;i<s1.length();i++)
        {
            windowFreq[s2.charAt(i)-'a']++;
        }
        while(right<s2.length())
        {
            if(Arrays.equals(s1Freq,windowFreq))
            {
                return true;
            }
           
            windowFreq[s2.charAt(left)-'a']--;
            right++;
            if(right<s2.length())
            {
                windowFreq[s2.charAt(right)-'a']++;
            }
            
            left++;
           
        }
        return false;
        
    }
}