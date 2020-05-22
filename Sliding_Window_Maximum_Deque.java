 public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        int b[]=new int[n+1-k];
        Deque<Integer>dq=new LinkedList<>();
        int left=0,right=0,i=0;
        while(right<n)
        {
            int val=a[right];
            while(!dq.isEmpty() && val>dq.getLast())
                dq.removeLast();
            dq.add(val);
            right++;
            if(right-left==k)
            {b[i]=dq.getFirst();
            i++;
            if(a[left]==dq.getFirst())
                dq.removeFirst();
            left++;}
        }
        return b;
    }