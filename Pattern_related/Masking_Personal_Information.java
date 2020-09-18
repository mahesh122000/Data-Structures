class Solution {
    public String maskPII(String s) {
        if(s.length()==0)
            return s;
        if(s.contains("@"))
        {
            return emailMask(s);
        }
        else
        {
            return numberMask(s);
        }
    }
    String emailMask(String s)
    {
        String arr[]=s.toLowerCase().split("[.@]+");
        String ans="";
        ans+=arr[0].charAt(0)+"*****"+arr[0].charAt(arr[0].length()-1);
        ans+="@"+arr[1]+"."+arr[2];
        return ans;
    }
    String numberMask(String s)
    {
        int count=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
                count++;
        }
        String ans="";
        int i=s.length()-1,k=0;
        while(k<4)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                k++;
                ans=s.charAt(i)+ans;
            }
            i--;
        }
        ans="-"+ans;
        for(i=1;i<=count-4;i++)
        {
            ans="*"+ans;
            if(i%3==0 && i!=count-4)
                ans="-"+ans;
        }
        if(count!=10)
            ans="+"+ans;
        return ans;
    }
}

