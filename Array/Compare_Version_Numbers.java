class Solution {
    public int compareVersion(String version1, String version2) {
     String s1[]=version1.split("\\.");
     String s2[]=version2.split("\\.");
     int n=Math.max(s1.length,s2.length);
     int i=0;
     while(i<n)
     {
         int v1=0;
         if(i<s1.length)
             v1=value(s1[i]);
         int v2=0;
         if(i<s2.length)
             v2=value(s2[i]);
         if(v1<v2)
             return -1;
         if(v2<v1)
             return 1;
         i++;
     }
        return 0;
    }
    public int value(String s)
    {
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            int j=s.charAt(i)-'0';
            v=v*10+j;
        }
        return v;
    }
}