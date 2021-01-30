class Solution{
    int r[]={0,1,0,-1};
    int c[]={1,0,-1,0};
     public int helpaterp(int[][] a) {
        int n=a.length;
        if(n==0)
        return 0;
        int m=a[0].length;
        if(m==0)
        return 0;
        Queue<int[]>q=new LinkedList<>();
        int b[][]=new int[n][m];
        int count=0;
        int val=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==2)
                {
                    q.add(new int[]{i,j});
                    count++;
                    b[i][j]=1;
                }
                if(a[i][j]>=1)
                val++;
            }
        }
        int t=-1;
        while(!q.isEmpty())
        {
            int s=q.size();
            t++;
            while(s-->0)
            {
                int d[]=q.poll();
                int x=d[0];
                int y=d[1];
                for(int k=0;k<4;k++)
                {
                    int nx=x+r[k];
                    int ny=y+c[k];
                    if(nx>=0 && ny>=0 && nx<n && ny<m && b[nx][ny]==0 && a[nx][ny]==1)
                    {
                        q.add(new int[]{nx,ny});
                        count++;
                        b[nx][ny]=1;
                        a[nx][ny]=2;
                    }
                }
            }
        }
        return count==val?t:-1;
    }
}
