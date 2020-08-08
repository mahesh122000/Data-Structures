class MyCircularDeque {
    ArrayList<Integer>al;
    int size;
    int n;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        al=new ArrayList<>();
        size=0;
        n=k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size==n)
            return false;
        size++;
        al.add(0,value);
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size==n)
            return false;
        size++;
        al.add(value);
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size==0)
            return false;
        size--;
        al.remove(0);
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size==0)
            return false;
        size--;
        al.remove(al.size()-1);
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(size==0)
            return -1;
        return al.get(0);
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
         if(size==0)
            return -1;
        return al.get(al.size()-1);
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==n;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

