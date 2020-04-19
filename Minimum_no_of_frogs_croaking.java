public int minNumberOfFrogs(String s) {
        int count=1;
        int a[]=new int[5];
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length();i++)
        {int pre=a[0];
         if(s.charAt(i)=='c')
        a[0]++; 
        else if(s.charAt(i)=='r')
        a[1]++;
        else if(s.charAt(i)=='o')
        a[2]++;
        else if(s.charAt(i)=='a')
        a[3]++;
        else
        a[4]++;
         int min=Integer.MAX_VALUE;
        int max=0;
        for(int j=0;j<5;j++)
        {max=Math.max(a[j],max);
        min=Math.min(a[j],min);}
        if(a[0]==max)
        {if(max>=min+2 && pre!=max)
        count=Math.max(count,max-min);
        }
        else
         return -1;}
        for(int i=1;i<5;i++)
        {if(a[i]==a[i-1])
        {}
        else
         return -1;}
        return count;
    }