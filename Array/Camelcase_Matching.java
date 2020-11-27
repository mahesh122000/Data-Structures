class Solution {
    public List<Boolean> camelMatch(String[] s, String p) {
        List<Boolean>l=new ArrayList<>();
        for(String c:s)
        {
            l.add(find(c.toCharArray(),p.toCharArray()));
        }
        return l;
    }
    boolean find(char a[],char b[])
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(j<b.length && a[i]==b[j])
                j++;
            else if(a[i]>='A' && a[i]<='Z')
                return false;
        }
        return j==b.length;
    }
}