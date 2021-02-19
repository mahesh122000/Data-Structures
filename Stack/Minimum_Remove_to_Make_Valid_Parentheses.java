class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Integer>st=new Stack<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
                st.push(i);
            else if(s.charAt(i)==')')
            {
                if(st.isEmpty())
                {
                    hs.add(i);
                }
                else
                    st.pop();
            }
        }
        while(!st.isEmpty())
        {
            hs.add(st.peek());
            st.pop();
        }
        String c="";
        for(int i=0;i<n;i++)
        {
            if(hs.contains(i))
            {}
            else
                c+=s.charAt(i);
        }
        return c;
    }
}