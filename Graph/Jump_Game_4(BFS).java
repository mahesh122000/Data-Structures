class Solution {
    public int minJumps(int[] a) {
        int n=a.length;
        HashMap<Integer,List<Integer>>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(a[i]))
                hm.get(a[i]).add(i);
            else
            {
                ArrayList<Integer>l=new ArrayList<>();
                l.add(i);
                hm.put(a[i],l);
            }
        }
        Queue<int[]>q=new LinkedList<>();
        int count=0;
        int b[]=new int[n];
        q.add(new int[]{0,0});
        b[0]=1;
        while(!q.isEmpty())
        {
            int x[]=q.poll();
            if(x[0]==n-1)
                return x[1];
            if(b[x[0]+1]==0)
            {
                q.add(new int[]{x[0]+1,x[1]+1});
                if(x[0]+1==n-1)
                    return x[1]+1;
                b[x[0]+1]=1;
            }
            if(x[0]>0 && b[x[0]-1]==0)
            {
                q.add(new int[]{x[0]-1,x[1]+1});
                b[x[0]-1]=1;
            }
            List<Integer>l=hm.get(a[x[0]]);
            for(int j=l.size()-1;j>=0;j--)
            {
                int i=l.get(j);
                if(b[i]==0)
                {
                    b[i]=1;
                    if(i==n-1)
                        return x[1]+1;
                    q.add(new int[]{i,x[1]+1});
                }
            }
        }
        return n-1;
    }
}
        