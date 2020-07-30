class Solution {
    static class Node
    {
        int id[];
        int weight[];
        Node(int n)
        {
            id=new int[n];
            weight=new int[n];
            for(int i=0;i<n;i++)
            {
                id[i]=i;
                weight[i]=1;
            }
        }
        boolean union(int p,int q)
        {
            p=root(p);
            q=root(q);
            if(p==q)
                return false;
            if(weight[p]>weight[q])
            {
                id[q]=p;
                weight[p]+=weight[q];
            }
            else
            {
                id[p]=q;
                weight[q]+=weight[p];
            }
            return true;
        }
        int root(int p)
        {
            while(p!=id[p])
            {
                id[p]=id[id[p]];
                p=id[p];
            }
            return p;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        Node node=new Node(n);
        for(int a[]:edges)
        {
            if(!node.union(a[0]-1,a[1]-1))
                return a;
        }
        return new int[0];
    }
}