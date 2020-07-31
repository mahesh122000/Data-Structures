class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int n=nums.size();
        PriorityQueue<Integer>pq[]=new PriorityQueue[n];
        int index[]=new int[n];
        int size[]=new int[n];
        int range[]=new int[2];
        for(int i=0;i<n;i++)
        {
            index[i]=1;
            size[i]=nums.get(i).size();
            pq[i]=new PriorityQueue<>();
            pq[i].add(nums.get(i).get(0));
        }
        boolean found=false;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int diff=Integer.MAX_VALUE;
        while(found==false)
        {
            found=find(index,size,range,nums,pq);
            if(diff>range[1]-range[0])
            {
                min=range[0];
                max=range[1];
                diff=range[1]-range[0];
            }
        }
        return new int[]{min,max};
    }
    boolean find(int index[],int size[],int range[],List<List<Integer>>nums,PriorityQueue<Integer>pq[])
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int idx=-1;
        int count=0;
        int prev=pq[0].peek();
        for(int i=0;i<size.length;i++)
        {
            int cur=pq[i].peek();
            if(i>0 && cur==prev)
                count++;
            if(min>cur)
            {
                min=cur;
                idx=i;
            }
            max=Math.max(max,cur);
            prev=cur;
        }
        range[0]=min;
        range[1]=max;
        if(count==size.length-1)
            return true;
        else
        {
            if(index[idx]<size[idx])
            {
                pq[idx].poll();
                pq[idx].add(nums.get(idx).get(index[idx]));
                index[idx]++;
                return false;
            }
        }
        return true;
    }
}


