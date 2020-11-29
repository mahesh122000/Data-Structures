class Solution {
    int i;
    public TreeNode recoverFromPreorder(String s) {
        i=0;
        return build(s,0);
    }
    TreeNode build(String s,int level)
    {
        TreeNode n=new TreeNode(findValue(s));
        if(checkLevel(s,level))
        {
            i=i+level+1;
            n.left=build(s,level+1);
        }
        if(checkLevel(s,level))
        {
            i=i+level+1;
            n.right=build(s,level+1);
        }   
        return n;
    }
    int findValue(String s)
    {
        int val=0;
        while(i<s.length() && s.charAt(i)!='-')
        {
            val=val*10+(s.charAt(i)-'0');
            i++;
        }
        return val;
    }
    boolean checkLevel(String s,int level)
    {
        int j=i;
        while(j<s.length() && j<=i+level+1 && s.charAt(j)=='-')
            j++;
        return j==i+level+1;
    }
}