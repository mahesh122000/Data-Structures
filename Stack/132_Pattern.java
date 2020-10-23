class Solution {
    public boolean find132pattern(int[] a) {
        int n=a.length;
        if(n<3)
            return false;
        Stack<Integer>st=new Stack<>();
        int val=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]<val)
                return true;
            while(!st.isEmpty() && a[i]>st.peek())
            {
                val=st.pop();
            }
            st.add(a[i]);
        }
        return false;
    }
}