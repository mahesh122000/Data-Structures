class Solution {
    static int row[]={-1,-1,0,1,1,1,0,-1};
    static int col[]={0,1,1,1,0,-1,-1,-1};
    public char[][] updateBoard(char[][] a, int[] c) {
        int n=a.length;
        if(n==0)
            return a;
        int m=a[0].length;
        if(m==0)
            return a;
        int p=c[0];
        int q=c[1];
        find(a,p,q,n,m);
        return a;
    }
    void find(char a[][],int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m)
            return;
        if(a[i][j]=='M')
        {
            a[i][j]='X';
            return;
        }
        if(a[i][j]!='E')
            return;
        int val=found(a,i,j,n,m);
        if(val==0)
        {
            a[i][j]='B';
            for(int k=0;k<8;k++)
            {
                find(a,i+row[k],j+col[k],n,m);
            }
        }
        else
        {
            a[i][j]=(char)('0'+val);
        }
        return;
    }
    int found(char a[][],int i,int j,int n,int m)
    {
        int count=0;
        for(int k=0;k<8;k++)
            {
                if(safe(a,i+row[k],j+col[k],n,m))
                    count++;
            }
        return count;
    }
    boolean safe(char a[][],int i,int j,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m||a[i][j]!='M')
            return false;
        return true;
    }
}