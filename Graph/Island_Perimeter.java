class Solution {
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    static int count;
    public int islandPerimeter(int[][] a) {
        count=0;
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                    count++;
            }
        }
        count=count*4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    find(a,i,j,n,m);
                }
            }
        }
        return count;
    }
    public void find(int a[][],int i,int j,int n,int m)
    {
        for(int k=0;k<4;k++)
        {
            if(safe(a,i+row[k],j+col[k],n,m))
                count--;
        }
    }
    public boolean safe(int a[][],int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        if(a[i][j]!=1)
            return false;
        return true;
    }
}