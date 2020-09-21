class Solution {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                      int q) {
        ArrayList<Boolean>al=new ArrayList<>();
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=n-1;
        int ind=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            ind=i;
            left[i]=ind;
        }
        ind=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
            ind=i;
            right[i]=ind;
        }
        for(int i=0;i<q;i++)
        {
            int l=queries.get(i).l;
            int r=queries.get(i).r;
            if(right[l]>=left[r])
            al.add(true);
            else
            al.add(false);
        }
    return al;
                                      }
}