class Solution {
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    static class Node
    {
        int i,j;
        Node(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public int[][] updateMatrix(int[][] a) {
        int n=a.length;
        if(n==0)
            return a;
        int m=a[0].length;
        if(m==0)
            return a;
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==0)
                q.add(new Node(i,j));
                else
                    a[i][j]=Integer.MAX_VALUE;
            }
        }
        return find(a,q,n,m);
    }
    int[][] find(int a[][],Queue<Node>q,int n,int m)
    {

        while(!q.isEmpty())
        {
            Node t=q.poll();
            for(int k=0;k<4;k++)
            {
                    if(safe(t.i+row[k],t.j+col[k],n,m))
                    {
                        if(a[t.i+row[k]][t.j+col[k]]>a[t.i][t.j]+1)
                        {a[t.i+row[k]][t.j+col[k]]=a[t.i][t.j]+1;
                        q.add(new Node(t.i+row[k],t.j+col[k]));}
                    }
           }
        }
        return a;
    }
    boolean safe(int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        return true;
    }
}


 