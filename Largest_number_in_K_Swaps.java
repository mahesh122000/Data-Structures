static void findMaximumNum(char ar[], int k, Res r) {
        int n=ar.length;
        if(k==0)
        return;
        for(int i=0;i<n-1;i++)
        {for(int j=i+1;j<n;j++)
        {if(ar[i]<ar[j])
        {char t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
        String cur=new String(ar);
        if(cur.compareTo(r.max)>0)
        r.max=cur;
        findMaximumNum(ar,k-1,r);
        t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
        }}}
    }