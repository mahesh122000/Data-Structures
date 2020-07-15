class Solution {
    public int findMinDifference(List<String> t) {
        int n=t.size();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            String s1[]=t.get(i).split(":");
            a[i][0]=Integer.parseInt(s1[0]);
            a[i][1]=Integer.parseInt(s1[1]);
        }
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(a[i][0]==a[i+1][0])
            {
            int val=Math.abs(a[i][1]-a[i+1][1]);
            ans=Math.min(ans,val);
            }
            else
            {
            int h=(a[i+1][0]-a[i][0])*60;
            int m=a[i+1][1]-a[i][1];
           // System.out.println(a[i+1][1]+" "+a[i][1]);
            h+=m;
            ans=Math.min(ans,Math.min(h,24*60-h));
            }
        }
        if(a[0][0]==a[n-1][0])
        {
            int val=Math.abs(a[0][1]-a[n-1][1]);
            ans=Math.min(ans,val);
        }
        else
        {
            int h=(a[n-1][0]-a[0][0])*60;
            int m=a[n-1][1]-a[0][1];
            h+=m;
            ans=Math.min(ans,Math.min(h,24*60-h));
        }  
        return ans;
    }
}