class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> result=new ArrayList<>();
        int[] pFreq=new int[26];
        int[] windowFreq=new int[26];
        int left=0;
        int right=p.length()-1;
        if(s.length()<p.length())
        {
            return result;
        }
        for(int i=0;i<p.length();i++)
        {
            pFreq[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            windowFreq[s.charAt(i)-'a']++;
        }
        while(right<s.length())
        {
            if(Arrays.equals(pFreq,windowFreq))
            {
                result.add(left);
            }
            windowFreq[s.charAt(left)-'a']--;
            left++;
            right++;
            if(right<s.length())
            {
                windowFreq[s.charAt(right)-'a']++;
            }
        }
        return result;
        
    }
}