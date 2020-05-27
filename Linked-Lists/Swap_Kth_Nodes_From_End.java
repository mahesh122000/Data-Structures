Node swapkthnode(Node head, int num, int k)
    {
        
        int n=num;
        if(k>n)
        return head;
        HashMap<Integer,Node>hm=new HashMap<>();
        int i=1;
        Node t=head;
        while(t!=null)
        {Node q=t;
        t=t.next;
        q.next=null;
        hm.put(i,q);
        i++;
        }
        
        Node p=hm.get(k);
        Node q=hm.get(n-k+1);
        hm.put(k,q);
        hm.put(n-k+1,p);
        for(i=2;i<=n;i++)
        {hm.get(i-1).next=hm.get(i);}
        head=hm.get(1);
        return head;
    }