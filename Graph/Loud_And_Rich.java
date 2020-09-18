class Solution {
    static List<List<Integer>>l;
    static int ans[];
    public int[] loudAndRich(int[][] richer, int[] q) {
        l=new ArrayList<>();
        int n=q.length;
        for(int i=0;i<n;i++)
            l.add(new ArrayList<>());
        for(int i=0;i<richer.length;i++)
        {
            l.get(richer[i][1]).add(richer[i][0]);
        }
        ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>hs=new HashSet<>();
            ans[i]=find(q,i,hs);
        }
        return ans;
    }
    int find(int q[],int i,HashSet<Integer>hs)
    {
        if(ans[i]!=-1)
            return ans[i];
        hs.add(i);
        int val=i;
        for(Integer j:l.get(i))
        {
            if(!hs.contains(j))
            {
                int cur=find(q,j,hs);
                if(ans[j]==-1)
                    ans[j]=cur;
                if(q[val]>q[cur])
                    val=cur;
            }
        }
        return val;
    }
}