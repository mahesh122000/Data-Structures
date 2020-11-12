class Solution {
    public int strStr(String s, String t) {
        if(s.length()<t.length())
            return -1;
        int n=s.length();
        int m=t.length();
        for(int i=0;i<=n-m;i++)
        {
            String c=s.substring(i,i+m);
            if(c.equals(t))
                return i;
        }
        return -1;
    }
}