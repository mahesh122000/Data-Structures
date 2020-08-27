class Solution {
    public String customSortString(String s, String t) {
        int a[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            a[t.charAt(i)-'a']++;
        }
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<a[s.charAt(i)-'a'];j++)
                ans+=s.charAt(i);
            a[s.charAt(i)-'a']=0;
        }
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<a[i];j++)
                ans+=(char)(i+'a');
        }
        return ans;
    }
}