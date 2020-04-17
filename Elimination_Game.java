public int lastRemaining(int n) {
        int d[]={2,1};
        if(n<1)
            return -1;
        if(n==1)
            return 1;
        return n-2 * lastRemaining(n/2)+d[n%2];
    }