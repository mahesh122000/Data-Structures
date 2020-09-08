class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>l=new ArrayList<>();
        for(String s:words)
        {
            if(match(s,pattern))
                l.add(s);
        }
        return l;
    }
    boolean match(String c,String s)
    {
        if(s.length()!=c.length())
            return false;
        HashMap<Character,Character>hm1=new HashMap<>();
        HashMap<Character,Character>hm2=new HashMap<>();
        for(int i=0;i<c.length();i++)
        {
            char a=c.charAt(i);
            char b=s.charAt(i);
            if(hm1.containsKey(a))
            {
                if(hm1.get(a)!=b)
                    return false;
            }
            else
            {
                hm1.put(a,b);
            }
            if(hm2.containsKey(b))
            {
                if(hm2.get(b)!=a)
                    return false;
            }
            else
            {
                hm2.put(b,a);
            }
        }
        return true;
    }
}