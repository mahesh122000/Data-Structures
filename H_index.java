public int check(int k,int a[])
    {int count=0;
    for(int i=0;i<a.length;i++)
    {if(k<=a[i])
     count++;}
    return count;
    }
    public int hIndex(int[] citations) {
        int n=citations.length;
        if(n==0)
            return 0;
        int l=0;
        int h=n;
        int ans=0;
        while(l<=h)
        {int m=(l+h)/2;
        int k=check(m,citations);
        if(k>=m)
        {ans=m;
         l=m+1;}
        else
         h=m-1;}
        return ans;
    }
}