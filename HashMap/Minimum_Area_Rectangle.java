class Solution {
    public int minAreaRect(int[][] a) {
        int n=a.length;
        Set<Pair<Integer,Integer>>hs=new HashSet<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int x1=a[i][0];
                int y1=a[i][1];
                int x2=a[j][0];
                int y2=a[j][1];
                if(hs.contains(new Pair(x1,y2)) && hs.contains(new Pair(x2,y1)))
                {
                    int val=Math.abs(x1-x2)*Math.abs(y1-y2);
                    if(val!=0)
                    ans=Math.min(ans,val);
                }
                else
                {
                    hs.add(new Pair(x1,y1));
                    hs.add(new Pair(x2,y2));
                }
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}