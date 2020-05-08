class Solution {
    static int count;
    public int totalNQueens(int n) {
        count=0;
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
         a[i][j]='.';}
        find(a,0,n);
        return count;
    }
    
    public boolean find(char a[][],int i,int n)
    {
        if(i==n)
        {
            count++;
            return true;
        }
        boolean val=false;
        for(int j=0;j<n;j++)
        {if(isSafe(a,i,j,n))
        {a[i][j]='Q';
        val=find(a,i+1,n)||val;
        a[i][j]='.';}}
        return false;
    }
    public boolean isSafe(char a[][],int i,int j,int n)
    {
        for(int p=0;p<n;p++)
        {if(a[i][p]=='Q')
         return false;}
        for(int p=0;p<n;p++)
        {if(a[p][j]=='Q')
         return false;}
        for(int p=i,q=j;p>=0 && q>=0;p--,q--)
        {if(a[p][q]=='Q')
         return false;}
        for(int p=i,q=j;p<n && q<n;p++,q++)
        {if(a[p][q]=='Q')
         return false;}
        for(int p=i,q=j;p<n && q>=0;p++,q--)
        {if(a[p][q]=='Q')
         return false;}
        for(int p=i,q=j;p>=0 && q<n;p--,q++)
        {if(a[p][q]=='Q')
         return false;}
        return true;
    }
}