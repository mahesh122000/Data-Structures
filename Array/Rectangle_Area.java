class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a[]={A,B};
        int b[]={C,D};
        int c[]={E,F};
        int d[]={G,H};
        int ans=0;
        if(overlap(a,b,c,d))
            ans=area(a,b,c,d);
        return find(a,b)+find(c,d)-ans;
    }
    public int find(int a[],int b[])
    {
        int x=(b[0]-a[0]);
        int y=(b[1]-a[1]);
        return x*y;
    }
    public boolean overlap(int a[],int b[],int c[],int d[])
    {
        if(b[0]<=c[0]|d[0]<=a[0])
            return false;
        if(b[1]<=c[1]|a[1]>=d[1])
            return false;
        return true;
    }
    public int area(int a[],int b[],int c[],int d[])
    {
        int x=Math.abs(Math.max(a[0],c[0])-Math.min(b[0],d[0]));
        int y=Math.abs(Math.max(a[1],c[1])-Math.min(b[1],d[1]));
        return x*y;
    }
}

  