class Solution {
    public String removeKdigits(String num, int k) {
        String ans=num;
        for(int i=1;i<=k;i++)
        {ans=find(ans);}
        if(ans.length()==0)
            ans="0";
        return ans;
    }
    public String find(String s)
    {
        int n=s.length();
        int in=n-1;
        for(int j=0;j<n-1;j++)
        {if(s.charAt(j)>s.charAt(j+1))
        {in=j;
        break;}}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {char c=s.charAt(i);
         if((sb.length()==0 && c=='0')||(i==in))
            {}
        else
            sb.append(c);
        }
        return sb.toString();
    }
}