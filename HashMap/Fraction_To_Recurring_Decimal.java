class Solution {
    public String fractionToDecimal(int n, int d) {
        StringBuilder ans=new StringBuilder("");
        if(n==0)
            return "0";
        if(d==0)
            return "";
        boolean f1 = (n < 0) ^ (d < 0);
        long nu = Math.abs(new Long(n));
		long de = Math.abs(new Long(d));
        if(f1==true)
            ans.append("-");
        ans.append(nu/de);
        long r=(nu%de)*10;
        if(r!=0)
            ans.append(".");
        HashMap<Long,Integer>hm=new HashMap<>();
        while(r!=0)
        {
            if(hm.containsKey(r))
            {
                ans.insert(hm.get(r),"(");
                ans.append(")");
                break;
            }
            hm.put(r,ans.length());
            ans.append(r/de);
            r=(r%de)*10;
        }
        return ans.toString();
    }
}