int a[][];

    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        if(n==0)
        {return;}
        else
        {int m=matrix[0].length;
        if(m==0)
        {return;}
        else
        {a=new int[n][m];
        for(int i=0;i<n;i++)
        {a[i][0]=matrix[i][0];
        for(int j=1;j<m;j++)
        {a[i][j]=a[i][j-1]+matrix[i][j];}}}}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
        for(int i=row1;i<=row2;i++)
        {ans+=a[i][col2];
         if(col1-1>=0)
             ans-=a[i][col1-1];
        }
        return ans;
    }