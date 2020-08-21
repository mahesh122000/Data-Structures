class Solution {
    public int[] asteroidCollision(int[] a) {
        int n=a.length;
        if(n==0)
            return a;
        Stack<Integer>st=new Stack<>();
        st.add(a[0]);
        for(int i=1;i<n;i++)
        {
            if(a[i]<0)
            {
                boolean f=false,g=false;
                while(!st.isEmpty() && st.peek()>0)
                {
                    if(st.peek()>Math.abs(a[i]))
                    {
                        f=true;
                        break;
                    }
                    else if(st.peek()==Math.abs(a[i]))
                    {
                        g=true;
                        st.pop();
                        break;
                    }
                    else
                    {
                        st.pop();
                    }
                }
                if(f==false && g==false)
                    st.add(a[i]);
            }
            else
            {
                st.add(a[i]);
            }
        }
        int l=st.size();
        int ans[]=new int[l];
        for(int i=l-1;i>=0;i--)
        {
            ans[i]=st.peek();
            st.pop();
        }
        return ans;
    }
}