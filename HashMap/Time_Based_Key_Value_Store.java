class TimeMap {
    static class Node
    {
        String c;
        int i;
        Node(String c,int i)
        {
            this.c=c;
            this.i=i;
        }
    }
    HashMap<String,TreeMap<Integer,String>>hm;
    /** Initialize your data structure here. */
    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key))
        {
            hm.put(key,new TreeMap<>());
        }
        hm.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key))
            return "";
        Map.Entry<Integer,String> entry = hm.get(key).floorEntry(timestamp);
        return entry==null?"":entry.getValue();
    }
}