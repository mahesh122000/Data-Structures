static int maxNumOfChocolates(int arr[], int n, int k) 
    { 
       HashMap<Integer,Integer>hm=new HashMap<>();
    int max=0;
    int sum=0;
    hm.put(0,0);
    for(int i=0;i<n;i++)
    {sum+=arr[i];
    if(hm.containsKey(sum%k))
    {max=Math.max(max,sum-hm.get(sum%k));}
    else
    {hm.put(sum%k,sum);}
    }
    return max/k;
    } 