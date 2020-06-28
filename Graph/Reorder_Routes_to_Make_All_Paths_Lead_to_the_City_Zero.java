class Solution {
    public int minReorder(int n, int[][] c) {
        int count=0;
        ArrayList<int[]>al=new ArrayList<>();
        for(int i=0;i<c.length;i++)
            al.add(new int[]{c[i][0],c[i][1]});
        HashSet<Integer>hs=new HashSet<>();
        hs.add(0);
        int ans=0;
        while(count<c.length)
        {
            int b[]=al.get(0);
            if(hs.contains(b[1]))
            {
                hs.add(b[0]);
                al.remove(0);
                count++;
            }
            else if(hs.contains(b[0]))
            {
                ans++;
                count++;
                hs.add(b[1]);
                al.remove(0);
            }
            else
            {
                al.add(al.get(0));
                al.remove(0);
            }
        }
        return ans;
    }
}