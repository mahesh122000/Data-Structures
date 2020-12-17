class GfG
{
    static int st[];
    
    public static int[] constructST(int arr[], int n)
    {
        st=new int[4*n+1];
        build(arr,1,0,n-1);
        return st;
    }
    static void build(int a[],int i,int l,int r)
    {
        if(l>r)
        return;
        if(l==r)
        {
            st[i]=a[l];
            return;
        }
        int m=(l+r)/2;
        build(a,2*i,l,m);
        build(a,2*i+1,m+1,r);
        st[i]=Math.min(st[2*i],st[2*i+1]);
    }
    
    public static int RMQ(int st[], int n, int l, int r)
    {
       return find(1,0,n-1,l,r);
    }
    static int find(int i,int l,int r,int gl,int gr)
    {
        if(l>=gl && r<=gr)
        {
            return st[i];
        }
        if(gl>r || gr<l)
        return Integer.MAX_VALUE;
        int m=(l+r)/2;
        int left=find(2*i,l,m,gl,gr);
        int right=find(2*i+1,m+1,r,gl,gr);
        return Math.min(left,right);
    }
    
    
}