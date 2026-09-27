class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int minLength=strs[0].length();
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<minLength)
            {
                minLength=strs[i].length();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<minLength;j++)
        {
            for(int i=1;i<strs.length;i++)
            {
                if(strs[0].charAt(j)!=strs[i].charAt(j))
                {
                    return sb.toString();
                }
                
            }
            sb.append(strs[0].charAt(j));
        }
        return sb.toString();
        
    }
}