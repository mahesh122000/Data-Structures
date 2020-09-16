class Solution {
    static int r[]={0,1,0,-1};
    static int c[]={1,0,-1,0};
    public int largestIsland(int[][] grid) {
        if(grid.length==0||grid[0].length==0)
            return 0;
        int val=2;
        Queue<int[]>q=new LinkedList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,0);
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int value=fill(grid,i,j,n,m,val);
                    ans=Math.max(ans,value);
                    hm.put(val,value);
                    val++;
                }
                else if(grid[i][j]==0)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty())
        {
            int x[]=q.poll();
            int value=1;
            HashSet<Integer>hs=new HashSet<>();
            for(int k=0;k<4;k++)
            {
                if(safe(x[0]+r[k],x[1]+c[k],n,m))
                {
                    hs.add(grid[x[0]+r[k]][x[1]+c[k]]);
                }
            }
            for(Integer i:hs)
            {
                value+=hm.get(i);
            }
            ans=Math.max(ans,value);
        }
        return ans;
    }
    boolean safe(int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        return true;
    }
    int fill(int a[][],int i,int j,int n,int m,int val)
    {
        if(safe(i,j,n,m)==false)
            return 0;
        if(a[i][j]!=1)
            return 0;
        int value=1;
        a[i][j]=val;
        for(int k=0;k<4;k++)
        {
            value+=fill(a,i+r[k],j+c[k],n,m,val);
        }
        return value;
    }
}