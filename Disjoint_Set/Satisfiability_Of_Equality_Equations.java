class Solution {
    String equal="==";
    String not_equal="!=";
    int parent[];
    int rank[];
    public boolean equationsPossible(String[] equations) {
        List<String>l=new ArrayList<>();
        parent=new int[26];
        rank=new int[26];
        for(int i=0;i<26;i++)
            parent[i]=i;
        for(String e:equations)
        {
            int u=e.charAt(0)-'a';
            int v=e.charAt(e.length()-1)-'a';
            String s=e.substring(1,3);
            if(s.equals(equal))
            {
                union(u,v);
            }
            else
            {
                l.add(e);
            }
        }
        for(String e:l)
        {
            int u=e.charAt(0)-'a';
            int v=e.charAt(e.length()-1)-'a';
            int x=find(u);
            int y=find(v);
            if(x==y)
                return false;
        }
        return true;
    }
    int find(int u)
    {
        while(parent[u]!=u)
        {
            parent[u]=parent[parent[u]];
            u=parent[u];
        }
        return u;
    }
    void union(int u,int v)
    {
        int x=find(u);
        int y=find(v);
        if(x==y)
            return;
        if(rank[x]>rank[y])
        {
            parent[y]=x;
            rank[x]++;
        }
        else
        {
            parent[x]=y;
            rank[y]++;
        }
    }
}