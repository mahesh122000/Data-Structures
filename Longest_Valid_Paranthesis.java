 public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer>st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {st.push(i);}
            else
            {
                if (!st.isEmpty() && s.charAt(st.peek())=='(')
                {st.pop();}
                else
                    st.push(i);
            }
        }
        if(st.isEmpty())
            return s.length();
        int a=s.length();
        int b=0;
        while(!st.isEmpty())
        {
            b=st.pop();
            max=Math.max(max,a-b-1);
            a=b;
        }
        max=Math.max(max,a);
        return max;
    }