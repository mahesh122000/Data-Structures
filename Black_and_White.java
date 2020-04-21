 static long solve(int N, int M)
    {
        long ans=0;
        ans=find(N,M);
        return ans;
    }
    static long find(int n,int m)
    {
        long val=n*m*(n*m-1);
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(i-2>=0 && j-1>=0)
        val--;
        if(i-2>=0 && j+1<m)
        val--;
        if(i+2<n && j-1>=0)
        val--;
        if(i+2<n && j+1<m)
        val--;
        if(j-2>=0 && i-1>=0)
        val--;
        if(j-2>=0 && i+1<n)
        val--;
        if(j+2<m && i-1>=0)
        val--;
        if(j+2<m && i+1<n)
        val--;
        }}
        
        return val;
    }