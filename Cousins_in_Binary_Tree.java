 public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return false;
        q.add(root);
        if(root.val==x||root.val==y)
            return false;
        while(!q.isEmpty())
        {
            int s=q.size();
            boolean f1=false,f2=false,f3=false;
            while(s-->0)
            {
                TreeNode t=q.poll();
                if(t.left!=null)
                {if(t.left.val==x)
                 f1=true;
                 if(t.left.val==y)
                 f2=true;
                q.add(t.left);}
                if(t.right!=null)
                {if(t.right.val==x)
                 f1=true;
                 if(t.right.val==y)
                 f2=true;
                q.add(t.right);}
                if(t.left!=null && t.right!=null)
                {if((t.left.val==x||t.left.val==y)&&(t.right.val==x||t.right.val==y))
                 f3=true;}
            }
            if(f3)
                return false;
            else if(f1&&f2)
                return true;
            else if(f1||f2)
                return false;
        }
        return false;
    }