class MyCalendarThree {

    TreeMap<Integer,Integer>tm;
    public MyCalendarThree() {
        tm=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        if(tm.isEmpty())
        {
            tm.put(start,1);
            tm.put(end,-1);
            return 1;
        }
        tm.put(start,tm.getOrDefault(start,0)+1);
        tm.put(end,tm.getOrDefault(end,0)-1);
        int val=0,ans=0;
        for(Integer i:this.tm.keySet())
        {
            val+=this.tm.get(i);
            ans=Math.max(ans,val);
        }
        return ans;
    }
}