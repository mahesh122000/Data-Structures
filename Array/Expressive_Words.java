class Solution {
    public int expressiveWords(String s, String[] words) {
        int count=0;
        for(String c:words)
        {
            if(poss(c,s))
            {
                count++;
                System.out.println(c);
            }
        }
        return count;
    }
    boolean poss(String c,String s)
    {
        int i=0,j=0;
        int n=c.length(),m=s.length();
        while(i<n && j<m)
        {
            int cn1=0,cn2=0;
            char c1=c.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2)
                return false;
            while(i<n && c1==c.charAt(i))
            {
                i++;
                cn1++;
            }
            while(j<m && c2==s.charAt(j))
            {
                j++;
                cn2++;
            }
            if(cn1>cn2)
                return false;
            if(cn1==1 && cn2==2)
                return false;
            //System.out.println(c1+" "+cn1+" "+cn2);
        }
        if(j<m||i<n)
            return false;
        return true;
    }
}