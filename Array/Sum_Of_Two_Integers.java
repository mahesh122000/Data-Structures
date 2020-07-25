class Solution {
    
    public int getSum(int a, int b) {
        boolean negative=false;
        boolean carry=false;
        if(a<0||b<0)
            negative=true;
        int count=0;
        int ans=0;
        for(int i=0;i<32;i++)
        {
            if((a&1)==1 && (b&1)==1)
            {
                if(carry)
                {
                    ans=ans|1<<i;
                }
                else
                {
                    carry=true;
                }
            }
            else if((a&1)==1 || (b&1)==1)
            {
                if(carry)
                {}
                else
                {
                    ans=ans|1<<i;
                }
            }
            else
            {
                if(carry)
                {
                    carry=false;
                    ans=ans|1<<i;
                }
                else
                {}
            }
            count++;
            a=a>>1;
            b=b>>1;
        }
        if(carry && !negative)
            ans=ans|1<<count;
        return ans;
    }
}



