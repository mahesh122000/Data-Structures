class Solution {
    public int numRescueBoats(int[] a, int limit) {
        int n=a.length;
        Arrays.sort(a);
        int count=0;
        int i=0,j=n-1;
        while(i<j)
        {
            if(a[i]+a[j]<=limit)
            {
                a[i]=a[j]=-1;
                i++;
                j--;
                count++;
            }
            else
            {
                j--;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=-1)
                count++;
        }
        return count;
    }
}