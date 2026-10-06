class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String a=new String(arr);
            if(map.containsKey(a))
            {
                map.get(a).add(strs[i]);
            }
            else
            {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(a,list);
            }

        }
        return new ArrayList<>(map.values());
       
        
    }
}