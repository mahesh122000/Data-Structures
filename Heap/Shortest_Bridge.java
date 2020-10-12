class Solution {
    int r[]={0,1,0,-1};
    int c[]={1,0,-1,0};
    public int shortestBridge(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[2]-q[2]);
        int b[][]=new int[n][m];
        one:for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    pq.add(new int[]{i,j,0});
                    b[i][j]=1;
                    break one;
                }
            }
        }
        if(pq.isEmpty())
            return 0;
        while(!pq.isEmpty())
        {
           int x[]=pq.poll();
           if(a[x[0]][x[1]]==1 && x[2]>0)
               return x[2];
            for(int k=0;k<4;k++)
            {
                if(safe(x[0]+r[k],x[1]+c[k],b,n,m))
                {
                    int p=x[0]+r[k];
                    int q=x[1]+c[k];
                    int d=x[2];
                    b[p][q]=1;
                    if(a[p][q]==0)
                        d++;
                    pq.add(new int[]{p,q,d});
                }
            }
        }
        return 0;
    }
    boolean safe(int i,int j,int b[][],int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        if(b[i][j]==1)
            return false;
        return true;
    }
}