class Solution {
    public boolean isNStraightHand(int[] hand, int w) {
        int n=hand.length;
        if(n%w!=0)
            return false;
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->p-q);
        for(int i=0;i<n;i++)
            pq.add(hand[i]);
        while(!pq.isEmpty())
        {
            int val=pq.poll();
            for(int i=1;i<w;i++)
            {
                if(pq.remove(val+i)==false)
                    return false;
            }
        }
        return true;
    }
}