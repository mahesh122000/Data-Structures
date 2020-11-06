class Solution {
    public int smallestDivisor(int[] a, int k) {
        int n=a.length;
        int l=1,h=1000000;
        while(l<h)
        {
            int m=(h+l)/2;
            int count=0;
            for(int i:a)
            {
                count+=(i+m-1)/m;
            }
            if(count>k)
                l=m+1;
            else
                h=m;
        }
        return l;
    }
}

