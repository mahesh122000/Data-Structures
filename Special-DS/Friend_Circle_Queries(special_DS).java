static class Node
    {
        Node parent;
        int val;
        int count;
        Node(int val,Node parent)
        {
            this.val=val;
            this.parent=parent;
            if(parent!=null)
            this.count=parent.count+1;
            else
            this.count=1;
        }
    }

    static HashMap<Integer,Node>hm;

    static Node parent(int i)
    {
        Node pa=hm.get(i);
        while(pa.parent!=null)
        {
            pa=pa.parent;
        }
        return pa;
    }
    
    static int[] maxCircle(int[][] q) {
        int n=q.length;
        int ans[]=new int[n];
        hm=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            int a=q[i][0];
            int b=q[i][1];
            int val=0;
            if(hm.containsKey(a))
            {
                if(hm.containsKey(b))
                {
                    Node bp=parent(b);
                    Node ap=parent(a);
                    hm.put(a,ap);
                    hm.put(b,bp);
                    if(bp.val==ap.val)
                    {
                        max=Math.max(max,ap.count);
                        ans[i]=max;
                    }
                    else
                    {
                        bp.parent=ap;
                        ap.count+=bp.count;
                        max=Math.max(max,ap.count);
                        ans[i]=max;
                    }
                }
                else
                {
                    Node ap=parent(a);
                    Node bp=new Node(b,ap);
                    ap.count+=1;
                    hm.put(b,bp);
                    max=Math.max(max,ap.count);
                    ans[i]=max;
                }
            }
            else
            {
                if(hm.containsKey(b))
                {
                    Node bp=parent(b);
                    Node ap=new Node(a,bp);
                    hm.put(a,ap);
                    bp.count+=1;
                    max=Math.max(max,bp.count);
                    ans[i]=max;
                }
                else
                {
                    Node ap=new Node(a,null);
                    Node bp=new Node(b,null);
                    ap.count+=1;
                    bp.parent=ap;
                    hm.put(b,bp);
                    hm.put(a,ap);
                    max=Math.max(max,ap.count);
                    ans[i]=max;
                }
            }
        }
        return ans;
    }
