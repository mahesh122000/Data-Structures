  public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        if(n==0)
            return l;
        int p=0,q=0,r=0,s=0;
        for(int i=0;i<n;i++)
        {if(p==nums[i])
         r++;
        else if(q==nums[i])
         s++;
        else if(r==0)
        {p=nums[i];
        r++;}
        else if(s==0)
        {q=nums[i];
        s++;}
        else
        {r--;
        s--;}}
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {if(p==nums[i])
         a++;
        else if(q==nums[i])
         b++;}
        if(a>(int)n/3)
            l.add(p);
        if(b>(int)n/3)
            l.add(q);
        return l;
    }