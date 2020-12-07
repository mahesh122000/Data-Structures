class Solution {
    int row[]={0,1,0,-1};
    int col[]={1,0,-1,0};
    public int[][] colorBorder(int[][] a, int r0, int c0, int c) {
        int k=a[r0][c0];
        int count=0;
        for(int p=0;p<4;p++)
        {
            int x=row[p]+r0;
            int y=col[p]+c0;
            if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]!=k && a[x][y]>=0)
            {
                 count++;
            }
        }
        if(count>=1)
        a[r0][c0]=-1;
        else
        a[r0][c0]=-2;
        if(r0==0||c0==0||r0==a.length-1||c0==a[0].length-1)
            a[r0][c0]=-1;
        for(int p=0;p<4;p++)
        {
            int x=row[p]+r0;
            int y=col[p]+c0;
            if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]==k)
            {
                 fill(a,x,y);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==-1)
                    a[i][j]=c;
                if(a[i][j]==-2)
                    a[i][j]=k;
            }
        }
        return a;
    }
    public void fill(int a[][],int r0,int c0) {
        int k=a[r0][c0];
        int count=0;
        for(int p=0;p<4;p++)
        {
            int x=row[p]+r0;
            int y=col[p]+c0;
            if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]!=k && a[x][y]>=0)
            {
                 count++;
            }
        }
        if(count>=1)
        a[r0][c0]=-1;
        else
        a[r0][c0]=-2;
        if(r0==0||c0==0||r0==a.length-1||c0==a[0].length-1)
            a[r0][c0]=-1;
        for(int p=0;p<4;p++)
        {
            int x=row[p]+r0;
            int y=col[p]+c0;
            if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]==k)
            {
                 fill(a,x,y);
            }
        }
    }
}