class Solution {
    public boolean isSelfCrossing(int[] x) {
        int n=x.length;
        for(int i=3;i<n;i++)
        {
            if(i>=3 && x[i-3]>=x[i-1] && x[i]>=x[i-2])
                return true;
            if(i>=4 && x[i]+x[i-4]>=x[i-2] && x[i-3]==x[i-1])
                return true;
            if(i>=5 && x[i-2]>=x[i-4] && x[i-5]+x[i-1]>=x[i-3] && x[i-1]<=x[i-3] && x[i-4]+x[i]>=x[i-2])
                return true;
        }
        return false;
    }
}