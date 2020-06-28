class Solution {
    static class Node implements Comparable<Node>
    {
        int x;
        int height;
        boolean isStart;
        Node(int x,int height,boolean isStart)
        {
            this.x=x;
            this.height=height;
            this.isStart=isStart;
        }
        public int compareTo(Node b)
        {
            if(this.x!=b.x)
                return this.x-b.x;
            else
            {
                if(this.isStart && b.isStart)
                    return b.height-this.height;
                else if(!this.isStart && !this.isStart)
                    return this.height-b.height;
                else
                    return isStart?-1:1;
            }
        }
    }
    public List<List<Integer>> getSkyline(int[][] b) {
     List<Node>l=new ArrayList<>();
        for(int i=0;i<b.length;i++)
        {
            l.add(new Node(b[i][0],b[i][2],true));
            l.add(new Node(b[i][1],b[i][2],false));
        }
        Collections.sort(l);
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
        List<List<Integer>>al=new ArrayList<>();
        for(Node n:l)
        {
            if(n.isStart)
            {
                int max=pq.isEmpty()?0:pq.peek();
                List<Integer>li=new ArrayList<>();
                if(max<n.height)
                {
                    li.add(n.x);
                    li.add(n.height);
                    al.add(li);
                }
                 pq.add(n.height);
            }
            else
            {
                pq.remove(n.height);
                int max=pq.isEmpty()?0:pq.peek();
                List<Integer>li=new ArrayList<>();
                if(max<n.height)
                {
                  li.add(n.x);
                  li.add(max);
                  al.add(li);  
                }
                
            }
        }
        return al;
    }
}


