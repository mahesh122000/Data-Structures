class Solution {
    public int scheduleCourse(int[][] a) {
        Arrays.sort(a,(p,q)->p[1]==q[1]?p[0]-q[0]:p[1]-q[1]);
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
        int count=0;
        int start=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(start+a[i][0]<=a[i][1])
            {
                count++;
                start+=a[i][0];
                pq.add(a[i][0]);
            }
            else if(!pq.isEmpty() && pq.peek()>a[i][0])
            {
                start+=a[i][0]-pq.peek();
                pq.poll();
                pq.add(a[i][0]);
            }
        }
        return count;
    }
}