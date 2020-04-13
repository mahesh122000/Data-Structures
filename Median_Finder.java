 ArrayList<Integer>al;
    public MedianFinder() {
        al=new ArrayList<>();
    }
    
    public void addNum(int num) {
        if(al.size()==0)
        al.add(num);
        else
        findIndex(0,al.size(),num);
    }
    
    public double findMedian() {
        int n=al.size();
        if(n%2==0)
        {double x=al.get(n/2-1);
        double y=al.get(n/2);
        return (x+y)/2;}
        else
        {double val=al.get(n/2);
        return val;}
    }
     public void findIndex(int start, int end, int num) {
        int mid = (start+end)/2;
        if(start >= end || num == al.get(mid) )
                al.add(mid,num);
        else if(num < al.get(mid)) 
                findIndex(start,mid,num); 
        else if( num > al.get(mid)) 
                findIndex(mid+1,end,num);
    }