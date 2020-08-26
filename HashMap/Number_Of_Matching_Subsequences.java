class Solution {
    static HashSet<String>hs1;
    static HashSet<String>hs2;
    public int numMatchingSubseq(String s, String[] words) {
        hs1=new HashSet<>();
        hs2=new HashSet<>();
        int count=0;
        for(String c:words)
        {
            if(find(c,s))
                count++;
        }
        return count;
    }
    boolean find(String c,String s)
    {
        if(hs1.contains(c))
            return true;
        if(hs2.contains(c))
            return false;
        int i=0,j=0;
        while(i<c.length() && j<s.length())
        {
            if(c.charAt(i)==s.charAt(j))
                i++;
            j++;
        }
        if(i==c.length())
        {
            hs1.add(c);
            return true;
        }
        else
        {
            hs2.add(c);
            return false;
        }
        
    }
}