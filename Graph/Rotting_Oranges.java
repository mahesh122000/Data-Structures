class Solution {
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int n=grid.length;
        if(n==0)
            return 0;
        int m=grid[0].length;
        if(m==0)
            return 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                    grid[i][j]=0;
                }
            }
        }
        int count=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                int t[]=q.poll();
                int x=t[0];
                int y=t[1];
                for(int k=0;k<4;k++)
                {
                    if(safe(row[k]+x,col[k]+y,n,m,grid))
                    {
                        q.add(new int[]{row[k]+x,col[k]+y});
                        grid[row[k]+x][col[k]+y]=0;
                    }
                }
            }
            count++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]>0)
                    return -1;
            }
        }
        return count-1>=0?count-1:0;
    }
    boolean safe(int i,int j,int n,int m,int a[][])
    {
        if(i<0||j<0||i>=n||j>=m||a[i][j]==0)
            return false;
        return true;
    }
}