class Solution {
    static int p[][];
    static int a[][];
    static int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        int n=matrix.length;
        List<List<Integer>>al=new ArrayList<>();
        if(n==0)
            return al;
        int m=matrix[0].length;
        if(m==0)
            return al;
        p=new int[n][m];
        a=new int[n][m];
        int min=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {check(i,0,p,min,matrix);
        check(i,m-1,a,min,matrix);}
        
        for(int i=0;i<m;i++)
        {check(0,i,p,min,matrix);
        check(n-1,i,a,min,matrix);}
        
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if((p[i][j]==a[i][j]) && p[i][j]==-1)
        {List<Integer>l=new ArrayList<>();
        l.add(i);
        l.add(j);
        al.add(l);}}}
        return al;
    }
    public void check(int i,int j,int b[][],int min,int c[][])
    {
        if(min>c[i][j])
            return ;
        if(b[i][j]==-1)
            return;
        b[i][j]=-1;
        for(int k=0;k<4;k++)
        {int ro=i+dir[k][0];
         int co=j+dir[k][1];
         if(ro>=0 && ro<b.length && co>=0 && co<b[0].length)
         check(ro,co,b,c[i][j],c);}
    }
}


 