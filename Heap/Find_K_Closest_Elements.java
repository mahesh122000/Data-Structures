class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[1]==q[1]?p[0]-q[0]:p[1]-q[1]);
        for(int i=0;i<a.length;i++)
        {
            pq.add(new int[]{a[i],Math.abs(x-a[i])});
        }
        List<Integer>l=new ArrayList<>();
        int i=0;
        while(i<k)
        {
            int c[]=pq.poll();
            l.add(c[0]);
            i++;
        }
        Collections.sort(l);
        return l;
    }
}