class Solution {
    static class Node
    {
        TreeNode n;
        int i,j;
        Node(TreeNode n,int i,int j)
        {
            this.n=n;
            this.i=i;
            this.j=j;
        }
    }
    static int a[];
    static HashMap<Integer,List<String>>hm1;
    static HashMap<String,List<Integer>>hm2;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        a=new int[2001];
        hm1=new HashMap<>();
        hm2=new HashMap<>();
        fill(root,1000,0);
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                List<String>l=hm1.get(i);
                List<Integer>ans=new ArrayList<>();
                for(String s:l)
                {
                    List<Integer>li=hm2.get(s);
                    Collections.sort(li);
                    ans.addAll(li);
                }
                al.add(ans);
            }
        }
        return al;
    }
    void fill(TreeNode root,int i,int j)
    {
        if(root==null)
            return ;
        Queue<Node>q=new LinkedList<>();
        q.add(new Node(root,i,j));
        a[i]=1;
        while(!q.isEmpty())
        {
            int si=q.size();
            while(si-->0)
            {
                Node no=q.poll();
                a[no.i]=1;
                if(hm1.containsKey(no.i))
                {
                   String s=no.i+"$"+no.j;
                   if(hm2.containsKey(s))
                      hm2.get(s).add(no.n.val);
                   else
                   {
                      hm1.get(no.i).add(s);
                      List<Integer>l=new ArrayList<>();
                      l.add(no.n.val);
                      hm2.put(s,l);
                   }
                }
                else
                {
                    List<String>l=new ArrayList<>();
                    String s=no.i+"$"+no.j;
                    l.add(s);
                    hm1.put(no.i,l);
                    List<Integer>li=new ArrayList<>();
                    li.add(no.n.val);
                    hm2.put(s,li);
                }
                if(no.n.left!=null)
                    q.add(new Node(no.n.left,no.i-1,no.j+1));
                if(no.n.right!=null)
                    q.add(new Node(no.n.right,no.i+1,no.j+1));
            }
        }
    }
}