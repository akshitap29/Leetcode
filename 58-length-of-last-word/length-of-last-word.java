class Solution {
    public int lengthOfLastWord(String s) 
    {
        
        int length=s.length()-1;
        int word=0;
        while(length>=0 && s.charAt(length)==' ')
        {
            length--;
        }
        while(length>=0 && s.charAt(length)!=' ')
        {
            word++;
            length--;
        }
        return word;
        
    }
}