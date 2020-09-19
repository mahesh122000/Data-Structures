class Solution {
    public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<indexes.length;i++)
        {
            hm.put(indexes[i],i);
        }
        int i=0;
        String ans="";
        while(i<s.length())
        {
            if(hm.containsKey(i) && s.startsWith(sources[hm.get(i)],i))
            {
                ans+=targets[hm.get(i)];
                i+=sources[hm.get(i)].length();
            }
            else
            {
                ans+=s.charAt(i);
                i++;
            }
        }
        return ans;
    }
}


