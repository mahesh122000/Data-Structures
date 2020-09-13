class Solution {
    public String shiftingLetters(String s, int[] a) {
        int n=a.length;
        a[n-1]=a[n-1]%26;
        for(int i=n-2;i>=0;i--)
        {
            a[i]=(a[i]+a[i+1])%26;
        }
        String ans="";
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            ans+=(char)((c-'a'+a[i])%26+'a');
        }
        return ans;
    }
}