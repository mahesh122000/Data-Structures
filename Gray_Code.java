class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<(int)Math.pow(2,n);i++)
        {String c=Integer.toBinaryString(i);
         String s=gray(c);
         int m=Integer.parseInt(s,2);
         l.add(m);
        }
        return l;
    }
    public String gray(String c)
    {
        String s=c.substring(0,1);
        for(int i=1;i<c.length();i++)
        {s+=xor(c.charAt(i),c.charAt(i-1));}
        return s;
    }
    public char xor(char a,char b)
    {
        if(a==b)
            return '0';
        return '1';
    }
}