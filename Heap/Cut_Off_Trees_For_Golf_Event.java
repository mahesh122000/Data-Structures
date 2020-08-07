class Solution {
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    public int cutOffTree(List<List<Integer>> forest) {
        int ans=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[2]-q[2]);
        for(int i=0;i<forest.size();i++)
        {
            for(int j=0;j<forest.get(i).size();j++)
            {
                if(forest.get(i).get(j)!=0 && forest.get(i).get(j)!=1)
                {
                    pq.add(new int[]{i,j,forest.get(i).get(j)});
                }
            }
        }
        int i=0,j=0;
        while(!pq.isEmpty())
        {
            int x[]=pq.poll();
            int k=find(i,j,x[0],x[1],forest);
            System.out.println(k+" "+x[2]);
            if(k==-1)
                return -1;
            ans+=k;
            i=x[0];
            j=x[1];
        }
        return ans;
    }
    int find(int i,int j,int r,int s,List<List<Integer>> forest)
    {
        Queue<int[]>q=new LinkedList<>();
        HashSet<String>hs=new HashSet<>();
        q.add(new int[]{i,j});
        int count=0;
        hs.add(i+"$"+j);
        while(!q.isEmpty())
        {
            int si=q.size();
            while(si-->0)
            {
                int x[]=q.poll();
                if(x[0]==r && x[1]==s)
                    return count;
                for(int k=0;k<4;k++)
                {
                    int x_i=x[0]+row[k];
                    int y_i=x[1]+col[k];
                    if(forest.get(x[0]).size()>y_i && forest.size()>x_i && !hs.contains(x_i+"$"+y_i) && y_i>=0 && x_i>=0 && forest.get(x_i).get(y_i)!=0)
                    {
                        q.add(new int[]{x_i,y_i});
                        hs.add(x_i+"$"+y_i);
                    }
                }
            }
            count++;
        }
        return -1;
    }
}