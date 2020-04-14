 public void gameOfLife(int[][] board) {
        int n=board.length;
        if(n==0)
            return;
        int m=board[0].length;
        if(m==0)
            return;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {check(board,i,j,n,m);
        }}
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(board[i][j]==0||board[i][j]==2||board[i][j]==3)
         board[i][j]=0;
        else
         board[i][j]=1;}}
    }
    public void check(int[][] a,int i,int j,int n,int m)
    {
        int k=0;
        int count=0;
        if(i-1>=0 && j<m)
        {if(a[i-1][j]==1||a[i-1][j]==2||a[i-1][j]==3)
         count++;}
        if(i-1>=0 && j+1<m)
        {if(a[i-1][j+1]==1||a[i-1][j+1]==2||a[i-1][j+1]==3)
         count++;}
        if(i-1>=0 && j-1>=0)
        {if(a[i-1][j-1]==1||a[i-1][j-1]==2||a[i-1][j-1]==3)
         count++;}
        if(i<n && j+1<m)
        {if(a[i][j+1]==1||a[i][j+1]==2||a[i][j+1]==3)
         count++;}
        if(i<n && j-1>=0)
        {if(a[i][j-1]==1||a[i][j-1]==2||a[i][j-1]==3)
         count++;}
        if(i+1<n && j<m)
        {if(a[i+1][j]==1||a[i+1][j]==2||a[i+1][j]==3)
         count++;}
        if(i+1<n && j+1<m)
        {if(a[i+1][j+1]==1||a[i+1][j+1]==2||a[i+1][j+1]==3)
         count++;}
        if(i+1<n && j-1>=0)
        {if(a[i+1][j-1]==1||a[i+1][j-1]==2||a[i+1][j-1]==3)
         count++;}
        if(count>=4)
        {if(a[i][j]==1)
         a[i][j]=3;}
        else if(count==3)
        {if(a[i][j]==0)
         a[i][j]=4;}
        else if(count<2)
        {if(a[i][j]==1)
         a[i][j]=2;}
    }