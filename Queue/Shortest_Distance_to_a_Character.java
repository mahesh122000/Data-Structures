class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int a[]=new int[n];
        char b[]=s.toCharArray();
        Queue<int[]>q=new LinkedList<>();
        Arrays.fill(a,Integer.MAX_VALUE);
        int g[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(b[i]==c)
            {
                a[i]=0;
                g[i]=1;
                q.add(new int[]{i,0});
            }
        }
        while(!q.isEmpty())
        {
            int x[]=q.poll();
            int p=x[0]+1;
            int r=x[0]-1;
            int d=x[1]+1;
            if(p<n && g[p]==0)
            {
                g[p]=1;
                a[p]=Math.min(a[p],d);
                q.add(new int[]{p,d});
            }
            if(r>=0 && g[r]==0)
            {
                g[r]=1;
                a[r]=Math.min(a[r],d);
                q.add(new int[]{r,d});
            }
        }
        return a;
    }
}