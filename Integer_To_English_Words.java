class Solution {
        static String dig[]={"","Thousand ","Million ","Billion "};
    static String digits[]={"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
    static String tens[]={"","","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
    static String ten[]={"Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
        static String hun="Hundred ";
    public String numberToWords(int num) {
        if(num==0)
            return "Zero";
        String s=String.valueOf(num);
        int n=s.length();
        String ans="";
        int i=0;
        while(n-3>=0)
        {ans=find(s.substring(n-3,n),i)+ans;
        n-=3;
        i++;}
        if(n>0)
        {ans=find(s.substring(0,n),i)+ans;
        n=0;}
        return ans.strip();
    }
    public String find(String s,int i)
    {
        String val="";
        int n=s.length();
        if(n==3)
        {int p=s.charAt(n-3)-'0';
        val+=digits[p];
        if(p!=0)
            val+=hun;}
        if(n>=2)
        {int p=s.charAt(n-2)-'0';
        if(p==1)
        {int k=s.charAt(n-1)-'0';
        val+=ten[k];
        n=0;}
         else
        val+=tens[p];}
        if(n>=1)
        {int p=s.charAt(n-1)-'0';
        val+=digits[p];}
        if(s.equals("000")|s.equals("00")|s.equals("0"))
        {}
        else
        val+=dig[i];
        return val;
    }
    
}