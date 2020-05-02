 public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n=tokens.length;
        if(n==0)
            return 0;
        for(int i=0;i<n;i++)
        {
            String c=tokens[i];
            if(c.equals("+")|c.equals("-")|c.equals("*")|c.equals("/"))
            {int p=st.peek();
            st.pop();
            int q=st.peek();
            st.pop();
            int ans=0;
            if(c.equals("+"))
             ans=p+q;
            else if(c.equals("-"))
                ans=q-p;
            else if(c.equals("*"))
                ans=q*p;
            else
             ans=q/p;
            st.push(ans);}
            else
            {int p=Integer.parseInt(c);
            st.push(p);}
        }
        return st.peek();
    }