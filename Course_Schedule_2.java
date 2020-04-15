class Solution {
    public int[] findOrder(int n, int[][] p) {
        int m=p.length;
        int a[]=new int[n];
        int b[]=new int[n];
        if(m==0)
        {for(int i=n-1;i>=0;i--)
         b[i]=i;
        return b;}
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {ArrayList<Integer>l=new ArrayList<>();
        al.add(l);}
        for(int i=0;i<m;i++)
        {a[p[i][0]]++;
         al.get(p[i][1]).add(p[i][0]);
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
        b[count++]=in;}
        if(count==n)
        return b;
        else
            return new int[0];
    }
}