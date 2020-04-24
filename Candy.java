 public int candy(int[] r) {
        int n=r.length;
        if(n==0)
            return 0;
        int a[]=new int[n];
        Arrays.fill(a,1);
        for(int i=1;i<n;i++)
        {if(r[i]<r[i-1] && a[i]>=a[i-1])
        {a[i-1]=a[i]+1;}
        else if(r[i]>r[i-1] && a[i]<=a[i-1])
        {a[i]=a[i-1]+1;}
        else
        {}}
        for(int i=n-2;i>=0;i--)
        {if(r[i]<r[i+1] && a[i]>=a[i+1])
        {a[i+1]=a[i]+1;}
        else if(r[i]>r[i+1] && a[i]<=a[i+1])
        {a[i]=a[i+1]+1;}
        else
        {}}
        int count=0;
        for(int i=0;i<n;i++)
        { System.out.print(a[i]+" ");
         count+=a[i];}
        return count;
    }