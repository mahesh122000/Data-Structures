class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int n=A.length;
        int m=B.length;
        if(n==0&& m==0)
            return new int[0][0];
        if(n!=0 && A[0].length==0)
            return new int[0][0];
        if(m!=0 && B[0].length==0)
            return new int[0][0];
        
        int a[][]=new int[n+m][2];
        for(int i=0;i<n;i++)
        {a[i][0]=A[i][0];
        a[i][1]=A[i][1];}
        for(int j=0,i=n;j<m;i++,j++)
        {a[i][0]=B[j][0];
         a[i][1]=B[j][1];}
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        ArrayList<int[]>al=new ArrayList<>();
        for(int j=0;j<a.length-1;j++)
        {int l=a[j][0];
        int h=a[j][1];
        two:for(int i=j+1;i<a.length;i++)
        {
            if(a[i][0]<=h)
            {al.add(new int[]{Math.max(l,a[i][0]),Math.min(h,a[i][1])});}
            else
            {break two;}
        }}
        int b[][]=new int[al.size()][2];
        int i=0;
        for(int x[]:al)
        {b[i][0]=x[0];
        b[i][1]=x[1];
        i++;}
        return b;
    }
}