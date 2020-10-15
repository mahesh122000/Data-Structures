class Solution {
    public int snakesAndLadders(int[][] a) {
        int n=a.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int p=1;
        for(int i=n-1,k=0;i>=0;i--,k++)
        {
            if(k%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    hm.put(p++,a[i][j]);
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    hm.put(p++,a[i][j]);
                }
            }
        }
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{1,0});
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        while(!q.isEmpty())
        {
            int x[]=q.poll();
           if(x[0]==n*n)
               return x[1];
            for(int k=1;k<=6 && x[0]+k<=n*n;k++)
            {
                if(!hs.contains(x[0]+k))
                {
                    hs.add(x[0]+k);
                    if(hm.get(x[0]+k)==-1)
                        q.add(new int[]{x[0]+k,x[1]+1});
                    else
                        q.add(new int[]{hm.get(x[0]+k),x[1]+1});
                }
            }
        }
        return -1;
    }
}