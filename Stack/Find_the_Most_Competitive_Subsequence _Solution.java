class Solution {
    public int[] mostCompetitive(int[] a, int k) {
        Stack<Integer>st=new Stack<>();
        int n=a.length;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            boolean flag=false;
            while(!st.isEmpty() && a[st.peek()]>a[i] && k-st.size()<=n-i-1)
            {
                flag=true;
                st.pop();
            }
            st.push(i);
        }
        int b[]=new int[k];
        while(st.size()!=k)
            st.pop();
        for(int i=k-1;i>=0;i--)
        {
            b[i]=a[st.pop()];
        }
        return b;
    }
}