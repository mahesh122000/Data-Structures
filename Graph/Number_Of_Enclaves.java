class Solution {
    int r[]={0,1,0,-1};
    int c[]={1,0,-1,0};
    public int numEnclaves(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        for(int i=0;i<n;i++)
        {
            if(a[i][0]==1)
                fill(a,i,0,n,m);
            if(a[i][m-1]==1)
                fill(a,i,m-1,n,m);
        }
        for(int i=0;i<m;i++)
        {
            if(a[0][i]==1)
                fill(a,0,i,n,m);
            if(a[n-1][i]==1)
                fill(a,n-1,i,n,m);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                    count++;
            }
        }
        return count;
    }
    void fill(int a[][],int i,int j,int n,int m)
    {
        if(i==n||j==m||i<0||j<0)
            return;
        a[i][j]=0;
        for(int k=0;k<4;k++)
        {
            if(safe(i+r[k],j+c[k],n,m,a))
                fill(a,i+r[k],j+c[k],n,m);
        }
    }
    boolean safe(int i,int j,int n,int m,int a[][])
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        if(a[i][j]==0)
            return false;
        return true;
    }
}