 public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==0)
            return ;
        int p=n-1;
        for(int i=n-2;i>=0;i--)
        {if(nums[i+1]>nums[i])
         {p=i;
         break;}
        }
        int in=-1,min=Integer.MAX_VALUE;
        for(int i=p+1;i<n;i++)
        {int t=nums[i]-nums[p];
        if(min>=t && t>0)
        {min=t;
        in=i;}}
       // System.out.println(p+" "+in);
        if(in!=-1)
        {
            int t=nums[in];
            nums[in]=nums[p];
            nums[p]=t;
           // System.out.println(nums[p]+" "+nums[in]);
            int a[]=new int[n-p-1];
            for(int i=p+1,j=0;i<n;i++,j++)
                a[j]=nums[i];
            Arrays.sort(a);
            for(int i=p+1,j=0;i<n;i++,j++)
                nums[i]=a[j];
        }
        else
            Arrays.sort(nums);
    }