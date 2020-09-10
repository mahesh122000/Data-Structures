class Solution {
    public int minEatingSpeed(int[] piles, int k) {
        int n=piles.length;
        int h=0;
        int l=1;
        for(int i=0;i<n;i++)
            h=Math.max(h,piles[i]);
        while(l<h)
        {
            int m=l+(h-l)/2;
            int count=0;
            for(int i=0;i<n;i++)
            {
                count+=(piles[i]/m)+(piles[i]%m==0?0:1);
            }
            if(count<=k)
                h=m;
            else
                l=m+1;
        }
        return l;
    }
}