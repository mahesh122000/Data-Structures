class Solution {
    public int nextGreaterElement(int m) {
        ArrayList<Integer>al=new ArrayList<>();
        while(m>0)
        {
            al.add(0,m%10);
            m=m/10;
        }
        int n=al.size();
        int ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(al.get(i)<al.get(i+1))
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
            return -1;
        int j=-1;
        int val=al.get(ind);
        int min=Integer.MAX_VALUE;
        for(int i=ind+1;i<n;i++)
        {
            if(al.get(i)>val && min>al.get(i)-val)
            {
                min=al.get(i)-val;
                j=i;
            }
        }
        al.set(ind,al.get(j));
        al.set(j,val);
        int b[]=new int[n-ind-1];
        for(int i=ind+1,g=0;i<n;i++,g++)
        {
            b[g]=al.get(i);
        }
        Arrays.sort(b);
        for(int i=ind+1,g=0;i<n;i++,g++)
        {
            al.set(i,b[g]);
        }
        long ans=0;
        for(int i=0;i<n;i++)
            ans=ans*10+al.get(i);
        if(ans>Integer.MAX_VALUE)
            return -1;
        return (int)ans;
    }
}