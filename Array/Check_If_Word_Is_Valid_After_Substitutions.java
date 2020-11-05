class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n<=2)
            return false;
        int m=n;
        while(true)
        {
            s=s.replaceAll("abc","");
            n=s.length();
            if(n==m)
                return false;
            if(n==0)
                return true;
            m=n;
        }
    }
}