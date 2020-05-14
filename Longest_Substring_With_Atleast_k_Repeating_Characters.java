class Solution {
    public int longestSubstring(String s, int k) {
        int a[]=new int[26];
        int n=s.length();
        if(n<k)
            return 0;
        for(int i=0;i<n;i++)
            a[s.charAt(i)-'a']++;
        int count=0;
        for(int i=0;i<n;i++)
        {if(a[s.charAt(i)-'a']>=k)
        {count++;}
        else
        {String left=s.substring(0,count);
         String right;
         while(count<n && a[s.charAt(count)-'a']<k)
             count++;
         right=s.substring(count,n);
         return Math.max(longestSubstring(left,k),longestSubstring(right,k));
        }}
        return count;
    }
}