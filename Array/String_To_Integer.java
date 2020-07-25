class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        boolean isNegative=false;
        while(i<n)
        {
            if(s.charAt(i)==' ')
                i++;
            else
                break;
        }
        if(i==n)
            return 0;
        if(s.charAt(i)=='-')
        {
            isNegative=true;
            i++;
        }
        if(i<n && s.charAt(i)=='+')
        {
            if(isNegative)
                return 0;
            i++;
        }
        long ans=0;
        while(i<n)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                ans=ans*10+s.charAt(i)-'0';
                if(ans>Integer.MAX_VALUE)
                    break;
                i++;
            }
            else
                break;
        }
        if(isNegative)
            ans=-ans;
        if(ans>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(ans<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)ans;
    }
}


