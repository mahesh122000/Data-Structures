class Solution {
    static int b[][];
    static class node
    {
        int i;
        int j;
        int val;
        node(int i,int j,int val)
        {
            this.i=i;
            this.j=j;
            this.val=val;
        }
    }
    static int r[]={0,1,0,-1};
    static int c[]={1,0,-1,0};
    public int swimInWater(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        b=new int[n][m];
        PriorityQueue<node>pq=new PriorityQueue<>((p,q)->p.val-q.val);
        pq.add(new node(0,0,a[0][0]));
        b[0][0]=1;
        while(!pq.isEmpty())
        {
            node no=pq.poll();
            if(no.i==n-1 && no.j==m-1)
                return no.val;
            for(int k=0;k<4;k++)
            {
                if(safe(no.i+r[k],no.j+c[k],n,m))
                {
                    b[no.i+r[k]][no.j+c[k]]=1;
                    pq.add(new node(no.i+r[k],no.j+c[k],Math.max(no.val,a[no.i+r[k]][no.j+c[k]])));
                }
            }
        }
        return -1;
    }
    boolean safe(int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        if(b[i][j]==1)
            return false;
        return true;
    }
}