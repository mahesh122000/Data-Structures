class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        ArrayList<ArrayList<int[]>>al=new ArrayList<>();
        for(int i=0;i<=n;i++)
            al.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++)
        {
            al.get(flights[i][0]).add(new int[]{flights[i][1],flights[i][2]});
        }
        Queue<int[]>q=new LinkedList<>();
        int val=Integer.MAX_VALUE;
        q.add(new int[]{src,0});
        int steps=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                int x[]=q.poll();
                if(x[0]==dst)
                    val=Math.min(val,x[1]);
                for(int y[]:al.get(x[0]))
                {if(y[1]+x[1]>val)
                {}
                else
                {q.add(new int[]{y[0],x[1]+y[1]});}}
            }
            if(steps++>K)
                break;
        }
    return val==Integer.MAX_VALUE?-1:val;
    }
}