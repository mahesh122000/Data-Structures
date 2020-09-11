class Solution {
    static HashMap<Integer,List<Integer>>hm;
    static List<Integer>ans;
    static HashSet<Integer>visited;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        hm=new HashMap<>();
        ans=new ArrayList<>();
        visited=new HashSet<>();
        if(K==0)
        {
            ans.add(target.val);
            return ans;
        }
        
        fill(root);
        visited.add(target.val);
        for(Integer i:hm.get(target.val))
        {
            if(!visited.contains(i))
            {
                find(i,1,K);
            }
        }
        return ans;
    }
    void find(int i,int l,int k)
    {
        if(l==k)
        {
            if(!visited.contains(i))
            {
                ans.add(i);
                visited.add(i);
            }
            return;
        }
        if(visited.contains(i))
            return;
        visited.add(i);
        for(Integer j:hm.get(i))
        {
            if(!visited.contains(j))
            {
                find(j,l+1,k);
            }
        }
    }
    void fill(TreeNode root)
    {
        if(root==null)
            return;
        int k=root.val;
        if(!hm.containsKey(k))
        {
            List<Integer>al=new ArrayList<>();
            hm.put(k,al);
        }
        if(root.left!=null)
        {
            List<Integer>al=new ArrayList<>();
            al.add(k);
            hm.put(root.left.val,al);
            hm.get(k).add(root.left.val);
            fill(root.left);
        }
        if(root.right!=null)
        {
            List<Integer>al=new ArrayList<>();
            al.add(k);
            hm.put(root.right.val,al);
            hm.get(k).add(root.right.val);
            fill(root.right);
        }
    }
}