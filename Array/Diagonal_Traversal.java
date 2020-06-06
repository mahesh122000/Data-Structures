class Solution {
    public int[] findDiagonalOrder(int[][] a) {
        int n=a.length;
        if(n==0)
            return new int[0];
        int m=a[0].length;
        if(m==0)
            return new int[0];
        int k=n+m;
        int p=1;
        int ans[]=new int[n*m];
        int q=0;
        while(p<=k)
        {
            if(p%2==0)
            {
                int i=1;
                int j=p+1-i;
                while(i<=p && j>=1)
                {if(i<=n && i>=1 && j<=m && j>=1)
                {ans[q]=a[i-1][j-1];
                q++;}
                i++;
                j--;}
            }
            else
            {
                int j=1;
                int i=p+1-j;
                while(j<=p && i>=1)
                {if(i<=n && i>=1 && j<=m && j>=1)
                {ans[q]=a[i-1][j-1];
                q++;}
                i--;
                j++;}
            }
            p++;
        }
        return ans;
    }
}