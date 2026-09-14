class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) 
    {
        int left1=rec1[0];
        int right1=rec1[2];
        int top1=rec1[3];
        int bottom1=rec1[1];
       
        int left2=rec2[0];
        int right2=rec2[2];
        int top2=rec2[3];
        int bottom2=rec2[1];

        int left=Math.max(left1,left2);
        int right=Math.min(right1,right2);
        int bottom=Math.max(bottom1,bottom2);
        int top=Math.min(top1,top2);
        if(left<right && bottom<top)
        {
            return true;
        }
        return false;
    }
}