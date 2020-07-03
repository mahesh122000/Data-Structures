class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int n=a.length;
        if(n<=2)
            return 0;
        int ans=0;
        int diff=a[1]-a[0];
        int count=2;
        for(int i=2;i<n;i++)
        {
            if(a[i-1]+diff==a[i])
            {
                count++;
            }
            else
            {
                ans+=calculate(count);
                count=2;
                diff=a[i]-a[i-1];
            }
        }
        ans+=calculate(count);
        return ans;
    }
    int calculate(int n)
    {
        if(n<3)
            return 0;
        n--;
        return (n*(n-1))/2;
    }
}