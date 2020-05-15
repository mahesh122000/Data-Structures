class Solution {
    public String decodeString(String s) {
        int n=s.length();
        if(n==0)
            return s;
        String ans="";
        int i=0,j=0;
        while(i<n)
        {if(s.charAt(i)>='0' && s.charAt(i)<='9')
        {int num=0;
         while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
         {num=num*10+s.charAt(i)-'0';
         i++;}
         //System.out.println(num);
        Stack<Character>st=new Stack<>();
        one:for(j=i;j<n;j++)
        {char g=s.charAt(j);
         if(g=='[')
         st.push('[');
        else if(g==']')
        {st.pop();
        if(st.isEmpty())
        {break one;}}}
        String c=expand(s.substring(i,j+1));
        for(int k=0;k<num;k++)
         ans+=c;
        i=j+1;}
        else
        {ans+=s.charAt(i);
        i++;}}
        return ans;
    }
    public String expand(String s)
    {
        String ans="";
        int n=s.length();
        int i=1,j=0;
        while(i<n-1)
        {if(s.charAt(i)>='0' && s.charAt(i)<='9')
        {int num=0;
         while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
         {num=num*10+s.charAt(i)-'0';
         i++;}
        // System.out.println(num);
        Stack<Character>st=new Stack<>();
        one:for(j=i;j<n;j++)
        {char g=s.charAt(j);
         if(g=='[')
         st.push('[');
        else if(g==']')
        {st.pop();
        if(st.isEmpty())
        {break one;}}}
        String c=expand(s.substring(i,j+1));
        for(int k=0;k<num;k++)
         ans+=c;
        i=j+1;}
        else
        {ans+=s.charAt(i);
        i++;}}
        return ans;
    }
}