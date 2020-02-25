Node merge(Node a,Node b)
    {
        if(a==null)
        return b;
        if(b==null)
        return a;
        Node ans=null;
        if(a.data<=b.data)
        {ans=a;
        ans.next=merge(a.next,b);}
        else
        {ans=b;
        ans.next=merge(a,b.next);}
        return ans;
    }
    Node mergeKList(Node[]a,int N)
    {
     if(N==1)
     return a[0];
     Node temp=merge(a[0],a[1]);
     for(int i=2;i<N;i++)
     {temp=merge(temp,a[i]);}
     return temp;
    }