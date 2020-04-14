 public String serialize(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        String ans="";
        if(root==null)
            ans+="null";
        else
        {q.add(root);
        ans+=String.valueOf(root.val);
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {TreeNode n=q.poll();
            if(n.left!=null)
            {q.add(n.left);
            ans+=","+String.valueOf(n.left.val);
            }
            else
            {ans+=",null";}
            if(n.right!=null)
            {q.add(n.right);
            ans+=","+String.valueOf(n.right.val);
            }
             else
             {ans+=",null";} 
            }
        }
        }
        return ans;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root=null;
        int i=0;
        int n=data.length();
        Queue<TreeNode>q=new LinkedList<>();
        String k="";
        for(i=0;i<n;i++)
        {if(data.charAt(i)==',')
            break;
         k+=data.charAt(i);}
        if(k.equals("null"))
            return root;
        i++;
        root=new TreeNode(Integer.parseInt(k));
        q.add(root);
        while(i<n)
        {int s=q.size();
        while(s-->0)
        {TreeNode t=q.poll();
        TreeNode tl=null;
        String p="";
        for(;i<n;i++)
        {if(data.charAt(i)==',')
            break;
         p+=data.charAt(i);}
        i++;
        if(p.equals("null"))
        {}
        else
        tl=new TreeNode(Integer.parseInt(p));
        t.left=tl;
        if(tl==null)
        {}
        else
        q.add(tl);
         
        TreeNode tr=null;
        String g="";
        for(;i<n;i++)
        {if(data.charAt(i)==',')
            break;
         g+=data.charAt(i);}
        i++;
        if(g.equals("null"))
        {}
        else
        tr=new TreeNode(Integer.parseInt(g));
        t.right=tr;
        if(tr==null)
        {}
        else
        q.add(tr); 
        }}
        return root;
    }