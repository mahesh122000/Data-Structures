class Solution {
    static class Node
    {
        String s;
        int value;
        Node(String s,int value)
        {
            this.s=s;
            this.value=value;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        HashSet<String>hs=new HashSet<>();
        for(String s:words)
        {
            hs.add(s);
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String>ans=new ArrayList<>();
        Iterator<String>it=hs.iterator();
        PriorityQueue<Node>pq=new PriorityQueue<>((p,q)->p.value==q.value?p.s.compareTo(q.s):q.value-p.value);
        while(it.hasNext())
        {
            String s=it.next();
            Node n=new Node(s,hm.get(s));
            pq.add(n);
        }
        while(k-->0 && !pq.isEmpty())
        {
            Node n=pq.poll();
            ans.add(n.s);
        }
        return ans;
    }
}