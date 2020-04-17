public int maxRotateFunction(int[] A) {
        int n=A.length;
        if(n==0)
            return 0;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=A[i];
        int msum=0;
        for(int i=0;i<n;i++)
            msum+=(i)*A[i];
        int max=msum;
        for(int i=1;i<n;i++)
        {msum=msum+sum-A[n-i]*(n);
        max=Math.max(max,msum);}
        return max;
    }