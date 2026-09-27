class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
       Arrays.sort(strs);
       StringBuilder sb=new StringBuilder();
       int first=0;
       int last=strs.length-1;
       for(int i=0;i<Math.min(strs[first].length(),strs[last].length());i++)
       {
            if(strs[first].charAt(i)!=strs[last].charAt(i))
            {
                return sb.toString();
            }
            sb.append(strs[first].charAt(i));
       }
       return sb.toString();
        
    }
}