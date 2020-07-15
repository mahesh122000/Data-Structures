class Solution {
    static Queue<Integer>q;
    static HashSet<Integer>visited;
    public int findCircleNum(int[][] m) {
        int n=m.length;
        if(n==0)
            return 0;
        q=new LinkedList<>();
        int count=0;
        visited=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!visited.contains(i))
            {
                visited.add(i);
                count++;
                q.add(i);
                find(m,n);
            }
        }
        return count;
    }
    void find(int a[][],int n)
    {
        while(!q.isEmpty())
        {
            int k=q.poll();
            visited.add(k);
            for(int j=0;j<n;j++)
            {
                if(a[k][j]==1 && !visited.contains(j))
                    q.add(j);
            }
        }
    }
}