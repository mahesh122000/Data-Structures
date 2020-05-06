class Solution {
    
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {
         if(find(board,0,i,j,n,m,word))
         return true;
        }}
        return false;
    }
    public boolean find(char a[][],int k,int i,int j,int n,int m,String c)
    {
        if(a[i][j]!=c.charAt(k))
            return false;
        if(k==c.length()-1)
            return true;
        char ch=a[i][j];
        a[i][j]='0';
        boolean f1=false;
        if((i-1>=0 && find(a,k+1,i-1,j,n,m,c)) || (j-1>=0 && find(a,k+1,i,j-1,n,m,c)) ||(j+1<m && find(a,k+1,i,j+1,n,m,c)) || (i+1<n && find(a,k+1,i+1,j,n,m,c)))
           return true;
        a[i][j]=ch;
        return false;
    }
}