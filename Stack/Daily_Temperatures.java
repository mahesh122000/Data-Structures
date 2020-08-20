class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && a[st.peek()]<a[i])
            {
                int k=st.peek();
                st.pop();
                b[k]=i-k;
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            b[st.peek()]=0;
            st.pop();
        }
        return b;
    }
}