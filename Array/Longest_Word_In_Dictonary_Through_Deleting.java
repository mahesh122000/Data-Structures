class Solution {
    public String findLongestWord(String s, List<String> d) {
        String ans="";
        for(String c:d)
        {
            if(c.length()>=ans.length() && possible(s,c))
            {
                if(c.length()>ans.length())
                {
                    ans=c;
                }
                else if(c.length()==ans.length())
                {
                    ans=compare(ans,c);
                }
            }
        }
        return ans;
    }
    String compare(String s,String c)
    {
        if(s.compareTo(c)<=0)
            return s;
        else
            return c;
    }
    boolean possible(String s,String c)
    {
        int i=0,j=0;
        while(i<s.length() && j<c.length())
        {
            if(s.charAt(i)==c.charAt(j))
                j++;
            i++;
        }
        return j==c.length();
    }
}