class MagicDictionary {

    /** Initialize your data structure here. */
    HashMap<String,ArrayList<String>>hm;
    public MagicDictionary() {
        hm=new HashMap<>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String s:dict)
        {
            fill(s);
        }
    }
    
    void fill(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            String c=s.substring(0,i)+'#'+s.substring(i+1,n);
            if(hm.containsKey(c))
                hm.get(c).add(s);
            else
            {
                ArrayList<String>l=new ArrayList<>();
                l.add(s);
                hm.put(c,l);
            }
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        return find(word);
    }
    
    boolean find(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            String c=s.substring(0,i)+'#'+s.substring(i+1,n);
            if(hm.containsKey(c))
            {
                for(String str:hm.get(c))
                {
                    if(!str.equals(s))
                        return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */