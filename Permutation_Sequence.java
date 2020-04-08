int fact[];
    Solution()
    {
        fact=new int[10];
        find(fact);
    }
    public String getPermutation(int n, int k) {
        char nums[]=new char[10];
        ArrayList<Character>al=new ArrayList<>();
            for(int i=1;i<=n;i++)
                al.add((char)(i+'0'));
        String ans="";
        int ind=0;
        for(int i=n-1;i>=0;i--)
        {ind=k/fact[i];
        if(k%fact[i]==0)
         ind--;
        ans+=al.get(ind);
        al.remove(ind);
        k-=fact[i]*ind;
        }
        return ans;
    }
    public void find(int a[])
    {
        a[0]=1;
        a[1]=1;
        a[2]=2;
        a[3]=6;
        for(int i=4;i<10;i++)
            a[i]=i*a[i-1];
    }
}


