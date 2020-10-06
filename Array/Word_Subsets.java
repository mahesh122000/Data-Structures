class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String>l=new ArrayList<>();
        int a[]=new int[26];
        for(String c:B)
        {
            int b[]=new int[26];
            for(char d:c.toCharArray())
            {
                b[d-'a']++;
                a[d-'a']=Math.max(a[d-'a'],b[d-'a']);
            }
        }
        for(String c:A)
        {
            if(safe(c,a))
                l.add(c);
        }
        return l;
    }
    boolean safe(String c,int a[])
    {
        int b[]=new int[26];
        for(char d:c.toCharArray())
        {
            b[d-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(b[i]<a[i])
                return false;
        }
        return true;
    }
}