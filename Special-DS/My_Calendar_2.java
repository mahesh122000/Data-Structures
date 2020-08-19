class MyCalendarTwo {
    List<int[]>s;
    List<int[]>f;
    public MyCalendarTwo() {
        s=new ArrayList<>();
        f=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int x[]:s)
        {
            if((x[0]<=start && x[1]>start)||(start<=x[0] && end>x[0]))
                return false;
        }
        for(int x[]:f)
        {
            if((x[0]<=start && x[1]>start)||(start<=x[0] && end>x[0]))
            {
                s.add(new int[]{Math.max(x[0],start),Math.min(x[1],end)});
            }
        }
        f.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */