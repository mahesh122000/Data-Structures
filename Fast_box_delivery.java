public static long minTime(List<Integer> boxes) {
    long ans=0;
    int n=boxes.size();
    long tt=0;
    for(int i=0;i<n;i++)
    {tt=tt+boxes.get(i);}
    long val=0;
    for(int i=0;i<n;i++)
    {long k=boxes.get(i)-val;
    if(k<=0)
    {}
    else
    {ans=ans+k*(n-i);
    val+=k;}}
    ans=ans+tt;
    return ans;
    }


