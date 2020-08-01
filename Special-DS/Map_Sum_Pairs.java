class MapSum {
    HashMap<String,Integer>hm;
    HashSet<String>hs;
    /** Initialize your data structure here. */
    public MapSum() {
        hm=new HashMap<>();
        hs=new HashSet<>();
    }
    
    public void insert(String key, int val) {
        hm.put(key,val);
        hs.add(key);
    }
    
    public int sum(String prefix) {
        Iterator<String>it=hs.iterator();
        int ans=0;
        while(it.hasNext())
        {
            String c=it.next();
            if(c.startsWith(prefix))
                ans+=hm.get(c);
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */