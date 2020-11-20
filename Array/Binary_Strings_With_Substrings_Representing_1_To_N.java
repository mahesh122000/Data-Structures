class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++)
        {
            if(s.indexOf(Integer.toBinaryString(i))<0)
                return false;
        }
        return true;
    }
}