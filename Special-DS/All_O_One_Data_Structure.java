class AllOne {
    static class Node
    {
        String s;
        int val;
        Node(String s,int v)
        {
            this.s=s;
            this.val=v;
        }
        @Override
        public boolean equals(Object obj) {
            Node target = (Node) obj;
            return this.s.equals(target.s);
        }   
    }
    static PriorityQueue<Node>pq1;
    static PriorityQueue<Node>pq2;
    static HashMap<String,Integer>hm;
    
    /** Initialize your data structure here. */
    public AllOne() {
        pq1=new PriorityQueue<>((p,q)->q.val-p.val);
        pq2=new PriorityQueue<>((p,q)->p.val-q.val);
        hm=new HashMap<>();
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if(hm.containsKey(key))
        {int p=hm.get(key);
        Node n=new Node(key,++p);
        pq1.remove(n);
        pq2.remove(n);
        hm.put(key,p);
        pq1.offer(n);
        pq2.offer(n);}
        else
        {hm.put(key,1);
        Node n=new Node(key,1);
        pq1.add(n);
        pq2.add(n);}
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(hm.containsKey(key))
        {int p=hm.get(key);
        Node n=new Node(key,--p);
        pq1.remove(n);
        pq2.remove(n);
        if(p==0)
        {hm.remove(key);}
        else
        {hm.put(key,p);
        pq1.offer(n);
        pq2.offer(n);}
        }
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if(pq1.isEmpty())
            return "";
        return pq1.peek().s;
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if(pq2.isEmpty())
            return "";
        System.out.println(pq2.size());
        return pq2.peek().s;
    }
}