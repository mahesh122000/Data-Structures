class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        int n=dict.size();
        String c[]=sentence.split(" ");
        String b[]=new String[c.length];
        HashSet<String>hs=new HashSet<>();
        for(String s:dict)
            hs.add(s);
        for(int i=0;i<c.length;i++)
        {
            boolean flag=false;
            one:for(int j=1;j<=c[i].length();j++)
            {
                String s=c[i].substring(0,j);
                if(hs.contains(s))
                {
                    b[i]=s;
                    flag=true;
                    break one;
                }
            }
            if(flag==false)
                b[i]=c[i];
        }
        String ans="";
        for(int i=0;i<b.length-1;i++)
            ans+=b[i]+" ";
        ans+=b[b.length-1];
        return ans;
    }
}