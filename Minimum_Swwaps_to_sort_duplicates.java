class pair
{
    int start, end;
    pair(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}

class solver
{
    static HashMap<Integer,pair> map;
    static int sorted_arr[];
    
    public static int min(int a, int b)
    {
        if(a<b) return a;
        return b;
    }
    
    public static int set_arr(int arr[], int index, int n)
    {
        if(index==n) return 0;
        if(arr[index] == sorted_arr[index])
            return set_arr(arr, index+1, n);
            // moving to next index if current one has correct value stored
        
        pair range = map.get(arr[index]);
        // [range.start , range.end] is the range of
        // valid indexes for current value ( arr[index] )
        
        int ret = Integer.MAX_VALUE;
        for( int i=range.start; i<=range.end; i++ )
        {
            if( arr[i] == arr[index] ) continue;
            // if i already has same value, no point in swapping
            
            arr[i] += arr[index];                //
            arr[index] = arr[i] - arr[index];    // swapping values
            arr[i] = arr[i] - arr[index];        //
            
            int val = 1 + set_arr(arr, index, n);
            ret = min( ret, val );
            
            arr[i] += arr[index];                //
            arr[index] = arr[i] - arr[index];    // backtracking
            arr[i] = arr[i] - arr[index];        //
        }
        return ret;
    }
    
    public static int min_swaps(int arr[], int n)
    {
        sorted_arr = new int[n];
        for(int i=0; i<n; i++)
            sorted_arr[i] = arr[i];
        Arrays.sort(sorted_arr);
        
        map = new HashMap<>();
        // this map will give range of valid indexes
        // (in sorted array) for a given value
        for(int i=0; i<n; i++)
        {
            int key = sorted_arr[i];
            if( map.containsKey(key) )
                map.get(key).end = i;
            else
                map.put(key, new pair(i,i));
        }
        
        return set_arr( arr, 0, n );
    }
}