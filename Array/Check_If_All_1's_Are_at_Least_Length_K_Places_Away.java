class Solution {
    public boolean kLengthApart(int[] a, int k) {
        int n=a.length;
        int p=-1;
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                if(p==-1)
                    p=i;
                else
                {
                    if(i-p-1<k)
                        return false;
                    else
                        p=i;
                }
            }
        }
        return true;
    }
}