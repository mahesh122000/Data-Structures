class Solution {
    public int shortestSubarray(int[] a, int k) {
        int n=a.length;
        Deque<Integer>dq=new ArrayDeque<>();
        int b[]=new int[n+1];
        for(int i=0;i<n;i++)
            b[i+1]=b[i]+a[i];
        int ans=n+1;
        dq.add(0);
        for(int i=1;i<=n;i++)
        {
            while(!dq.isEmpty() && b[i]-b[dq.peekFirst()]>=k)
            {
                ans=Math.min(ans,i-dq.pollFirst());
            }
            while(!dq.isEmpty() && b[dq.peekLast()]>=b[i])
            {
                dq.pollLast();
            }
            dq.add(i);
        }
        return ans==n+1?-1:ans;
    }
}