class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->(p[0]+p[1])-(q[0]+q[1]));
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                pq.add(new int[]{i,j});
            }
        }
        List<List<Integer>>al=new ArrayList<>();
        while(!pq.isEmpty() && k-->0)
        {
            List<Integer>l=new ArrayList<>();
            int x[]=pq.poll();
            l.add(x[0]);
            l.add(x[1]);
            al.add(l);
        }
        return al;
    }
}