static void subarraySum(int n, int s, int[] m) {
        
        int start=0;
        int sum=0;
        boolean flag=false;
        for(int end=0;end<n;end++)
        {
            sum+=m[end];
            while(start<end && sum>s)
            {
                sum-=m[start];
                start++;
            }
            if(sum==s)
            {
                start++;
                end++;
                System.out.print(start+" "+end);
                flag=true;
                break;
            }
        }
        if(flag==false)
        System.out.print("-1");
    }