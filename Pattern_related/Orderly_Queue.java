class Solution {
    public String orderlyQueue(String s, int k) {
        char c[]=s.toCharArray();
        Arrays.sort(c);
        if(k>=2)
            return new String(c);
        String cur=s+s;
        for(int i=1;i<s.length();i++)
        {
            String temp=cur.substring(i,i+s.length());
            s=(s.compareTo(temp)>0)?temp:s;
        }
        return s;
    }
}