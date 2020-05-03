 List<String>l;
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        String s="";
        find(s,n,0,0);
        return l;
    }
    public void find(String s,int n,int i,int j)
    {
        if(i>n || j>n || i<j)
            return;
        if(i==j && i==n)
        {
            String c=s;
            l.add(c);
            return;
        }
        s=s+'(';
        find(s,n,i+1,j);
        s=s.substring(0,s.length()-1);
        s=s+')';
        find(s,n,i,j+1);
        s=s.substring(0,s.length()-1);
    }