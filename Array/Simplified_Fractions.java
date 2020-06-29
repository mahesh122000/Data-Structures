class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String>al=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(i==1 || gcd(i,j)==1)
                {
                    al.add(i+"/"+j);
                }
            }
        }
        return al;
    }
    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
        
    }
}