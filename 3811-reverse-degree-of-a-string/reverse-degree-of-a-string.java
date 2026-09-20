class Solution {
    public int reverseDegree(String s) 
    {
        
        
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            int curr=i+1;
            int ind=s.charAt(i)-'a';
            int rev=26-ind;
            int prod=curr*rev;
            sum+=prod;

        }
        return sum;

        
    }
}