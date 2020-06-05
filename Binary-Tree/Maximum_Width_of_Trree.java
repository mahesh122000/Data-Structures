int getMaxWidth(Node root)
    {
        Queue<Node>q=new LinkedList<>();
        if(root==null)
        return 0;
        int ans=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            ans=Math.max(ans,s);
            while(s-->0)
            {
                Node n=q.poll();
                if(n.left!=null)
                q.add(n.left);
                if(n.right!=null)
                q.add(n.right);
            }
        }
        return ans;
    }		