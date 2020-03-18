public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        if(n==0)
            return -1;
        int sum=0,pre=0,start=0;
        for(int i=0;i<n;i++)
        {sum+=gas[i]-cost[i];
        if(sum<0)
        {start=i+1;
        pre+=sum;
        sum=0;}}
        if(sum+pre>=0)
            return start;
        return -1;
    }