class Solution {
    public List<String> removeComments(String[] source) {
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        List<String>ans=new ArrayList<>();
        for(String s:source)
        {
            for(int i=0;i<s.length();i++)
            {
                String c=(i<s.length()-1)?s.substring(i,i+2):"";
                if(flag)
                {
                    if(c.equals("*/"))
                    {
                        flag=false;
                        i++;
                    }
                }
                else if(c.equals("/*"))
                {
                    flag=true;
                    i++;
                }
                else if(c.equals("//"))
                {
                    break;
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            if(flag==false && sb.length()>0)
            {
                ans.add(sb.toString());
                sb=new StringBuilder();
            }
        }
        return ans;
    }
}

