class MyCircularQueue {
    int a[];
    int r;
    int f;
    int size;
    int n;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        a=new int[k];
        r=-1;
        f=-1;
        n=k;
        size=0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(size==n)
            return false;
        size++;
        if(f==-1)
        {
            f=0;
            r=0;
            a[r]=value;
        }
        else
        {
            r=(r+1)%n;
            a[r]=value;
        }
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(size==0)
            return false;
        size--;
        f=(f+1)%n;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(size==0)
            return -1;
        return a[f];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(size==0)
            return -1;
        return a[r];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size==n;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */