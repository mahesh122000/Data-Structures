class Solution {
    static HashMap<String,Integer>hm;
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        hm=new HashMap<>();
        return find(root,1);
    }
    public int find(TreeNode root,int i)
    {
        if(root==null)
            return 0;
        if(hm.containsKey(root.val+"$"+i))
            return hm.get(root.val+"$"+i);
        int v1=0,v2=0;
        if(i==1)
        {
            v1=root.val+find(root.left,0)+find(root.right,0);
        }
        v2=find(root.left,1)+find(root.right,1);
        int max=Math.max(v1,v2);
        hm.put(root.val+"$"+i,max);
        return max;
    }
}