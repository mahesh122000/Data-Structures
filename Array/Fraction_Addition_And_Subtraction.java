class Solution {
    int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public String fractionAddition(String s) {
        ArrayList<int[]>al=new ArrayList<>();
        int sign=0;
        s=s.replaceAll("\\s+","");
        for(int i=0;i<s.length();)
        {
            char c=s.charAt(i);
            if(c=='-')
                sign=1;
            if(c=='+')
                sign=0;
            if(c>='0' && c<='9')
            {
                int p=c-'0';
                if(i<s.length()-1 && p==1 && s.charAt(i+1)=='0')
                {
                    p=10;
                    i++;
                }
                i+=2;
                if(sign==1)
                    p=-p;
                char d=s.charAt(i);
                int q=d-'0';
                if(i<s.length()-1 && q==1 && s.charAt(i+1)=='0')
                {
                    q=10;
                    i++;
                }
                al.add(new int[]{p,q});
            }
            i++;
        }
        int deno=1;
        for(int x[]:al)
            deno=lcm(deno,x[1]);
        int num=0;
        for(int x[]:al)
        {
            num+=x[0]*(deno/x[1]);
        }
        if(num==0)
            return "0/1";
        else
        {
            int v=gcd(Math.abs(num),deno);
            num=num/v;
            deno=deno/v;
            return num+"/"+deno;
        }
    }
}