class Solution {
    static HashMap<Integer,Integer>hm;
    static HashSet<Integer>hs;
    public int[] findFrequentTreeSum(TreeNode root) {
        hm=new HashMap<>();
        hs=new HashSet<>();
        int val=find(root);
        Iterator<Integer>it=hs.iterator();
        int max=Integer.MIN_VALUE;
        while(it.hasNext())
        {
            max=Math.max(max,hm.get(it.next()));
        }
        ArrayList<Integer>al=new ArrayList<>();
        Iterator<Integer>it2=hs.iterator();
        while(it2.hasNext())
        {
            int k=it2.next();
            if(hm.get(k)==max)
                al.add(k);
        }
        int l=al.size();
        int ans[]=new int[l];
        for(int i=0;i<l;i++)
        {
            ans[i]=al.get(i);
        }
        return ans;
    }
    int find(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=find(root.left);
        int r=find(root.right);
        int v=l+r+root.val;
        hs.add(v);
        hm.put(v,hm.getOrDefault(v,0)+1);
        return v;
    }
}