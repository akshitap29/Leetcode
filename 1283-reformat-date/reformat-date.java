class Solution {
    public String reformatDate(String date) 
    {
        HashMap<String,String> map=new HashMap<>();
        String[] parts=date.split(" ");
        StringBuilder sb=new StringBuilder();
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        sb.append(parts[2]);
        sb.append("-");
        sb.append(map.get(parts[1]));
        sb.append("-");
        String temp=parts[0].substring(0,parts[0].length()-2);
        if(temp.length()==1)
        {
            sb.append("0"+temp);
        }
        else
        {
            sb.append(temp);
        }
        return sb.toString();


        



        
    }
}