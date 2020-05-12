class Solution {
    List<List<String>>al;
    public List<List<String>> partition(String s) {
        int n=s.length();
        al=new ArrayList<>();
        List<String>l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {String c=s.substring(0,i+1);
        if(isPalin(c))
        {l.add(c);
        find(s,i+1,n,l);
        l.remove(l.size()-1);
        }}
        if(al.size()==0)
            al.add(l);
        return al;
    }
    public boolean isPalin(String c)
    {
        int n=c.length();
        for(int i=0;i<=n/2;i++)
        {if(c.charAt(i)!=c.charAt(n-i-1))
         return false;}
        return true;
    }
    public void find(String s,int i,int n,List<String>l)
    {
        if(i==n)
        {List<String>ll=new ArrayList<>();
        ll.addAll(l);
        al.add(ll);
        return ;}
        for(int j=i;j<n;j++)
        {String c=s.substring(i,j+1);
        if(isPalin(c))
        {l.add(c);
        find(s,j+1,n,l);
        l.remove(l.size()-1);}}
    }
}