class Solution {
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        int n=path.length();
        if(n==0)
            return "";
        String c[]=path.split("/");
        for(int i=0;i<c.length;i++)
        {
           if(!c[i].equals(".") && !c[i].equals("..") && !c[i].equals(""))
               st.add(c[i]);
            if(c[i].equals(".."))
            {
                if(!st.isEmpty())
                    st.pop();
            }
        }
        String ans="";
        if(st.isEmpty())
            ans+="/";
        while(!st.isEmpty())
        {
            ans=st.peek()+ans;
            ans="/"+ans;
            st.pop();
        }
        return ans;
    }
}