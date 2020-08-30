class Solution {
    public boolean canTransform(String s, String e) {
        if(s.length()!=e.length())
            return false;
        int l=0,r=0;
        char last='X';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R'||e.charAt(i)=='R')
            {
                if(last=='X')
                    last='R';
                else if(last=='L' && l!=0)
                    return false;
                if(s.charAt(i)=='R')
                    r++;
                if(e.charAt(i)=='R')
                    r--;
            }
            if(s.charAt(i)=='L'||e.charAt(i)=='L')
            {
                if(last=='X')
                    last='L';
                else if(last=='R' && r!=0)
                    return false;
                if(s.charAt(i)=='L')
                    l--;
                if(e.charAt(i)=='L')
                    l++;
            }
            if(r<0||l<0)
                return false;
        }
        return (r==l)&&(l==0);
    }
}

