class FreqStack {
    static class node
    {
        int val;
        Stack<Integer>st;
        int count;
        node(int val,int count,int time)
        {
            this.val=val;
            this.count=count;
            st=new Stack<>();
            st.add(time);
        }
    }
    int t;
    HashMap<Integer,node>hm;
    PriorityQueue<node>pq;
    public FreqStack() {
        t=0;
        hm=new HashMap<>();
        pq=new PriorityQueue<>((p,q)->p.count==q.count?q.st.peek()-p.st.peek():q.count-p.count);
    }
    
    public void push(int x) {
        t++;
        if(hm.containsKey(x))
        {
            node n=hm.get(x);
            pq.remove(n);
            n.count++;
            n.st.add(t);
            pq.add(n);
        }
        else
        {
            node n=new node(x,1,t);
            hm.put(x,n);
            pq.add(n);
        }
    }
    
    public int pop() {
        node n=pq.poll();
        n.count--;
        n.st.pop();
        if(n.count!=0)
        {hm.put(n.val,n);
        pq.add(n);}
        else
        {
            hm.remove(n.val);
        }
        return n.val;
    }
}