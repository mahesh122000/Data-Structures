public int minLeafSum(Node root){
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null)
        return 0;
        q.add(root);
        int sum=0;
        while(q.isEmpty()==false)
        {int s=q.size();
        boolean flag=false;
        while(s-->0)
        {Node t=q.poll();
        if(t.left!=null)
        q.add(t.left);
        if(t.right!=null)
        q.add(t.right);
        if(t.left==null && t.right==null)
        {flag=true;
        sum+=t.data;}
        }
        if(flag)
        break;
        }
    return sum;}