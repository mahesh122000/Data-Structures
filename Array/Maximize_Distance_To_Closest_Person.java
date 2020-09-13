class Solution {
    public int maxDistToClosest(int[] a) {
        int first=0;
        int last=0;
        int max=0;
        int n=a.length;
        int i=0,j=n-1;
        while(i<n && a[i]==0)
        {
            i++;
        }
        first=i;
        while(j>=0 && a[j]==0)
        {
            j--;
        }
        last=n-j-1;
        int count=0;
        for(;i<=j;i++)
        {
            if(a[i]==1)
                count=0;
            else
                count++;
            max=Math.max(max,count);
        }
        return Math.max((max+1)/2,Math.max(first,last));
        
    }
}