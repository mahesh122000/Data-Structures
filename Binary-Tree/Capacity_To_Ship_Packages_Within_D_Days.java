class Solution {
    public int shipWithinDays(int[] a, int d) {
        int h=0,l=1;
        for(int i:a)
        {
            h+=i;
            l=Math.max(l,i);
        }
        int ans=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            int k=0;
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum+=a[i];
                if(sum>=m)
                {
                    if(sum==m)
                        sum=0;
                    else
                        sum=a[i];
                    k++;
                }
                if(i==a.length-1 && sum>0)
                    k++;
            }
            if(k>d)
                l=m+1;
            else
            {
                ans=m;
                h=m-1;
            }
        }
        return ans;
    }
}