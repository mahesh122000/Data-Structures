int maxLen(int[] arr) {
    int n=arr.length;
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {if(arr[i]==0)
    b[i]=-1;
    else
    b[i]=1;}
    HashMap<Integer,Integer>hm=new HashMap<>();
    int sum=0;
    int max=0;
    hm.put(0,-1);
    for(int i=0;i<n;i++)
    {sum+=b[i];
    if(hm.containsKey(sum))
    {max=Math.max(max,i-hm.get(sum));}
    else
    {hm.put(sum,i);}}
    return max;
    }