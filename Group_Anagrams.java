class Solution {
    public static String sort(String inputString) 
    {char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        int  n=strs.length;
        if(n==0)
            return new ArrayList<List<String>>();
        for(int i=0;i<n;i++)
        {String c=sort(strs[i]);
        if(hm.containsKey(c))
        {List<String>l=hm.get(c);
        l.add(strs[i]);
        hm.put(c,l);}
        else
        {List<String>l=new ArrayList<>();
        l.add(strs[i]);
        hm.put(c,l);}}
        List<List<String>>l=new ArrayList<>();
        for(List<String>ls:hm.values())
            l.add(ls);
        return l;
    }
}