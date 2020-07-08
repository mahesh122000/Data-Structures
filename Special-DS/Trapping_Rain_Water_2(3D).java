class Solution {
    static class Node
    {
        int val,i,j;
        Node(int val,int i,int j)
        {
            this.val=val;
            this.j=j;
            this.i=i;
        }
    }
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    public int trapRainWater(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        PriorityQueue<Node>pq=new PriorityQueue<>((p,q)->p.val-q.val);
        for(int i=0;i<m;i++)
        {
            pq.add(new Node(a[0][i],0,i));
            a[0][i]=-1;
            pq.add(new Node(a[n-1][i],n-1,i));
            a[n-1][i]=-1;
        }
        for(int i=0;i<n;i++)
        {
            pq.add(new Node(a[i][0],i,0));
            a[i][0]=-1;
            pq.add(new Node(a[i][m-1],i,m-1));
            a[i][m-1]=-1;
        }
        int ans=0;
        while(!pq.isEmpty())
        {
            Node t=pq.poll();
            for(int i=0;i<4;i++)
            {
                int pi=t.i+row[i];
                int pj=t.j+col[i];
                if(pi<0||pj<0||pi>=n||pj>=m||a[pi][pj]==-1)
                    continue;
                if(t.val>a[pi][pj])
                {
                    ans+=t.val-a[pi][pj];
                    pq.add(new Node(t.val,pi,pj));
                    a[pi][pj]=-1;
                }
                else
                {
                    pq.add(new Node(a[pi][pj],pi,pj));
                    a[pi][pj]=-1;
                }
            }
        }
        return ans;
    }
}


