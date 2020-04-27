 public void solve(char[][] board) {
        int n=board.length;
        if(n==0)
            return ;
        int m=board[0].length;
        if(m==0)
            return ;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(i==0||j==0||i==n-1||j==m-1)
        {if(board[i][j]=='O')
         dfs(board,i,j,n,m);}}}
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(board[i][j]=='Y')
         board[i][j]='O';
        else
         board[i][j]='X';}}
    }
    public void dfs(char a[][],int i,int j,int n,int m)
    {
        a[i][j]='Y';
        if(i+1<n && a[i+1][j]=='O')
            dfs(a,i+1,j,n,m);
        if(j+1<m && a[i][j+1]=='O')
            dfs(a,i,j+1,n,m);
        if(i-1>=0 && a[i-1][j]=='O')
            dfs(a,i-1,j,n,m);
        if(j-1>=0 && a[i][j-1]=='O')
            dfs(a,i,j-1,n,m);
        
    }
}