class Solution {
    int r[]={0,1,1,1,0,-1,-1,-1};
    int c[]={1,1,0,-1,-1,-1,0,1};
    public int shortestPathBinaryMatrix(int[][] a) {
        int n=a.length;
        int b[][]=new int[n][n];
        if(a[0][0]==1)
            return -1;
        for(int i=0;i<n;i++)
            Arrays.fill(b[i],Integer.MAX_VALUE);
        b[0][0]=1;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        while(!q.isEmpty())
        {
            int x[]=q.poll();
            for(int k=0;k<8;k++)
            {
                int nx=x[0]+r[k];
                int ny=x[1]+c[k];
                int d=x[2]+1;
                if(nx>=0 && nx<n && ny>=0 && ny<n && a[nx][ny]==0 && b[nx][ny]>d)
                {
                System.out.println(nx+" "+ny);
                    b[nx][ny]=d;
                    q.add(new int[]{nx,ny,d});
                }
            }
        }
        return b[n-1][n-1]==Integer.MAX_VALUE?-1:b[n-1][n-1];
    }
}