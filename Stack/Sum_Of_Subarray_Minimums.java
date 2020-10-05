class Solution {
    static int mod=1000000007;
    public int sumSubarrayMins(int[] A) {
        int n=A.length;
        Stack<Integer>st=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && A[st.peek()]>A[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                left[i]=i+1;
            else
                left[i]=i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && A[st.peek()]>=A[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                right[i]=n-i;
            else
                right[i]=st.peek()-i;
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=(ans+A[i]*(left[i]*right[i])%mod)%mod;
        }
        return ans;
    }
}