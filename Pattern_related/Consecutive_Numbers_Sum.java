class Solution {
    public int consecutiveNumbersSum(int N) {
        int ans=1;
        for(int i=2;i<100000;i++)
        {
            int sum=(i*(i+1))/2;
            if(N-sum<0)
                return ans;
            if((N-sum)%i==0)
                ans++;
        }
        return ans;
    }
}