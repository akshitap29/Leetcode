class Solution {
    public int uniqueMorseRepresentations(String[] words) 
    {
        
        Set<String> ans=new HashSet<>();
       HashMap<Character, String> set1 = new HashMap<>();

        set1.put('a', ".-");
        set1.put('b', "-...");
        set1.put('c', "-.-.");
        set1.put('d', "-..");
        set1.put('e', ".");
        set1.put('f', "..-.");
        set1.put('g', "--.");
        set1.put('h', "....");
        set1.put('i', "..");
        set1.put('j', ".---");
        set1.put('k', "-.-");
        set1.put('l', ".-..");
        set1.put('m', "--");
        set1.put('n', "-.");
        set1.put('o', "---");
        set1.put('p', ".--.");
        set1.put('q', "--.-");
        set1.put('r', ".-.");
        set1.put('s', "...");
        set1.put('t', "-");
        set1.put('u', "..-");
        set1.put('v', "...-");
        set1.put('w', ".--");
        set1.put('x', "-..-");
        set1.put('y', "-.--");
        set1.put('z', "--..");
        for(int i=0;i<words.length;i++)
        {
            String morse="";
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                morse+=set1.get(ch);
            }
            ans.add(morse);

        }
        return ans.size();
        
    }
}