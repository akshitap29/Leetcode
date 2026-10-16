class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int[] changes=new int[1001];
        for(int[] trip:trips)
        {
            int passanger=trip[0];
            int from=trip[1];
            int to=trip[2];;
            changes[from]+=passanger;
            changes[to]-=passanger;
        }
        int passengerInCar=0;
        for(int i=0;i<=1000;i++)
        {
            passengerInCar+=changes[i];
            if(passengerInCar>capacity)
            {
                return false;
            }
        }
        return true;
        
    }
}