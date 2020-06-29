class Solution {
    List<String>li;
    HashMap<String,PriorityQueue<String>>hm;
    public List<String> findItinerary(List<List<String>> t) {
        hm=new HashMap<>();
        for(List<String>l:t)
        {
            if(hm.containsKey(l.get(0)))
            {
                hm.get(l.get(0)).add(l.get(1));
            }
            else
            {
                PriorityQueue<String>pq=new PriorityQueue<>();
                pq.add(l.get(1));
                hm.put(l.get(0),pq);
            }
            
        }
        li=new ArrayList<>();
        dfs("JFK");
        return li;
    }
    public void dfs(String s)
    {
        if(hm.containsKey(s))
        {
            PriorityQueue<String>pq=hm.get(s);
            while(!pq.isEmpty())
                dfs(pq.poll());
        }
        li.add(0,s);
    }
}