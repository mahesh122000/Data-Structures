static List<List<Integer>>al;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        al=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        if(root==null)
            return al;
        int ans=root.val;
        l.add(root.val);
        if(root.right==null && root.left==null && sum-ans==0)
        {List<Integer>ll=new ArrayList<Integer>();
         ll.addAll(l);
         al.add(ll);}
        if(root.left!=null)
        find(root.left,sum-ans,l);
        if(root.right!=null)
        find(root.right,sum-ans,l);
        return al;
    }
    public void find(TreeNode root, int sum,List<Integer>l)
    {
    int ans=root.val;
    l.add(root.val);
    if(root.right==null && root.left==null && sum-ans==0)
    {List<Integer>ll=new ArrayList<Integer>();
         ll.addAll(l);
         al.add(ll);
     l.remove(l.size()-1);
    return;}
    if(root.left!=null)
    find(root.left,sum-ans,l);
    if(root.right!=null)
    find(root.right,sum-ans,l);
    l.remove(l.size()-1);
   }