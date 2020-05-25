class Solution {
    public int findKthNumber(int n, int k) {
        long cur=1;
        k--;
        while(k>0)
        {
            long steps=getSteps(n,cur,cur+1);
            if(steps<=k)
            {
                k-=steps;
                cur+=1;
            }
            else
            {
                cur*=10;
                k--;
            }
        }
        return (int)cur;
    }
    public long getSteps(int n,long n1,long n2)
    {
        long steps=0;
        while(n1<=n)
        {
            steps+=Math.min(n+1,n2)-n1;
            n1*=10;
            n2*=10;
        }
        return steps;
    }
}


Ref: https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/discuss/92242/ConciseEasy-to-understand-Java-5ms-solution-with-Explaination
