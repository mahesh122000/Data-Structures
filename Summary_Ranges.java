public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String>l=new ArrayList<>();
        if(n==0)
            return l;
        int k=nums[0];
        for(int i=1;i<=n;i++)
        {if(i==n)
        {if(k==nums[i-1])
        {String ans=String.valueOf(k);
         l.add(ans);}
        else
        {String ans=String.valueOf(k)+"->"+String.valueOf(nums[i-1]);
        l.add(ans);}
        }
        else
        {if(nums[i]-nums[i-1]==1)
        {}
        else
        {if(k==nums[i-1])
        {String ans=String.valueOf(k);
         l.add(ans);}
        else
        {String ans=String.valueOf(k)+"->"+String.valueOf(nums[i-1]);
        l.add(ans);}
        k=nums[i];}}
        }
         return l;
    }