class Solution {
    public String solveEquation(String equation) {
        String s[]=equation.split("=");
        int a[]=find(s[0]);
        int b[]=find(s[1]);
        //System.out.println(a[0]+" "+a[1]+" "+b[0]+" "+b[1]);
        a[0]-=b[0];
        a[1]=b[1]-a[1];
        if(a[0]==0 && a[1]==0)
            return "Infinite solutions";
        else if(a[0]==0 && a[1]!=0)
            return "No solution";
        else
            return "x="+(a[1]/a[0]);
    }
    int [] find(String s)
    {
        if(s.charAt(0)!='+'||s.charAt(0)!='-')
            s="+"+s;
        int a[]=new int[2];
        int val=0;
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
            {
                val=val*10+c-'0';
            }
            else if(c=='x')
            {
                if(val==0)
                {
                    if(i>0 && s.charAt(i-1)=='0')
                    {}
                    else
                        val=1;
                }
                if(p==0)
                    a[0]+=val;
                else
                    a[0]-=val;
                val=0;
            }
            else
            {
                if(p==0)
                    a[1]+=val;
                else
                    a[1]-=val;
                val=0;
                if(c=='+')
                    p=0;
                else
                    p=1;
            }
        }
        if(p==0)
            a[1]+=val;
        else
            a[1]-=val;
        return a;
    }
}