class SummaryRanges {

    /** Initialize your data structure here. */
    ArrayList<int[]>al;
    public SummaryRanges() {
        al=new ArrayList<>();
    }
    
    public void addNum(int val) {
        int l=0,r=al.size()-1;
        while(l<=r)
        {
            int m=(l+r)>>1;
            int x[]=al.get(m);
            if(x[0]<=val && x[1]>=val)
                return;
            if(val==x[0]-1||val==x[1]+1)
            {
                x[0]=Math.min(x[0],val);
                x[1]=Math.max(x[1],val);
                mergeIntervals();
                return;
            }
            if(val<x[0]-1)
                r=m-1;
            else if(val>x[1]+1)
                l=m+1;
        }
        al.add(l,new int[]{val,val});
    }
    
    void mergeIntervals()
    {
        for(int i=1;i<al.size();i++)
        {
            if(al.get(i-1)[1]==al.get(i)[0]-1)
            {
                al.get(i-1)[1]=al.get(i)[1];
                al.remove(i);
                return;
            }
        }
    }
    
    public int[][] getIntervals() {
        return al.toArray(new int[al.size()][]);
    }
}