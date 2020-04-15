class Solution {
    public boolean canFinish(int n, int[][] p) {
        int m=p.length;
        if(m==0)
            return true;
        int a[]=new int[n];
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {ArrayList<Integer>l=new ArrayList<>();
        al.add(l);}
        for(int i=0;i<m;i++)
        {a[p[i][1]]++;
         al.get(p[i][0]).add(p[i][1]);
        }
        int count=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {if(a[i]==0)
         q.add(i);}
        while(!q.isEmpty())
        {int in=q.poll();
        for(Integer j:al.get(in))
        {if(--a[j]==0)
         q.add(j);}
        count++;}
        return count==n;
    }
}