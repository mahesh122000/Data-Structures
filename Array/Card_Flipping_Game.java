class Solution {
    public int flipgame(int[] f, int[] b) {
        int n=f.length;
        int a[]=new int[20001];
        for(int i=0;i<n;i++)
        {
            if(f[i]==b[i])
                a[f[i]]=-1;
            else
            {
                if(a[f[i]]!=-1)
                    a[f[i]]=1;
                if(a[b[i]]!=-1)
                    a[b[i]]=1;
            }
        }
        for(int i=0;i<=2000;i++)
        {
            if(a[i]==1)
                return i;
        }
        return 0;
    }
}