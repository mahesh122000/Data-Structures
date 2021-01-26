class Solution {
    int r[]={0,1,0,-1};
    int c[]={1,0,-1,0};
    public int minimumEffortPath(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[0]-q[0]);
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty())
        {
            int arr[]=pq.poll();
            int d=arr[0];
            int x=arr[1];
            int y=arr[2];
            if(d>b[x][y])
                continue;
            if(x==n-1 && y==m-1)
                return d;
            for(int k=0;k<4;k++)
            {
                int nx=x+r[k];
                int ny=y+c[k];
                if(nx>=0 && ny>=0 && nx<n && ny<m)
                {
                    int nd=Math.max(d,Math.abs(a[x][y]-a[nx][ny]));
                    if(b[nx][ny]>nd)
                    {
                        b[nx][ny]=nd;
                        pq.add(new int[]{nd,nx,ny});
                    }
                }
            }
        }
        return 0;
    }
}