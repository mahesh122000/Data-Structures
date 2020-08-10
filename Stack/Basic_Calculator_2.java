class Solution {
    public int calculate(String s) {
        s=s.replaceAll("\\s+","");
        s=s+"+";
        Stack<Integer>st=new Stack<>();
        int temp=0;
        char sign='+';
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if(d>='0' && d<='9')
            {
                temp=temp*10+(d-'0');
            }
            else
            {
                if(sign=='+')
                {
                    st.push(temp);
                }
                else if(sign=='-')
                {
                    st.push(-temp);
                }
                else if(sign=='*')
                {
                    int k=st.peek();
                    st.pop();
                    st.push(temp*k);
                }
                else if(sign=='/')
                {
                    int k=st.peek();
                    st.pop();
                    st.push(k/temp);
                }
                temp=0;
                sign=d;
            }
        }
        int ans=0;
        while(!st.isEmpty())
        {
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
}