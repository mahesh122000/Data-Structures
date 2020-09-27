class Solution {
    public double[] calcEquation(List<List<String>> e, double[] v, List<List<String>> q) {
        HashSet<String>hs=new HashSet<>();
        HashMap<String,Integer>hm=new HashMap<>();
        int ind=0;
        for(int i=0;i<e.size();i++)
        {
            if(!hm.containsKey(e.get(i).get(0)))
                hm.put(e.get(i).get(0),ind++);
            if(!hm.containsKey(e.get(i).get(1)))
                hm.put(e.get(i).get(1),ind++);
            hs.add(e.get(i).get(0));
            hs.add(e.get(i).get(1));
        }
        double a[][]=new double[ind][ind];
        for(int i=0;i<e.size();i++)
        {
            int x=hm.get(e.get(i).get(0));
            int y=hm.get(e.get(i).get(1));
            a[x][y]=v[i];
            a[y][x]=1.0/(v[i]);
        }
        for(int k=0;k<2;k++)
        {for(int i=0;i<ind;i++)
        {
            a[i][i]=1.0;
            for(int j=i+1;j<ind;j++)
            {
                if(a[i][j]<=0)
                {
                    a[i][j]=find(i,j,a);
                    a[j][i]=1.0/a[i][j];
                }
            }
        }}
        double ans[]=new double[q.size()];
        for(int i=0;i<q.size();i++)
        {
            if(!hs.contains(q.get(i).get(0))||!hs.contains(q.get(i).get(1)))
                ans[i]=-1.0;
            else
                ans[i]=a[hm.get(q.get(i).get(0))][hm.get(q.get(i).get(1))];
        }
        return ans;
    }
    double find(int x,int y,double a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[x][i]>0 && a[y][i]>0)
                return a[x][i]/a[y][i];
        }
        return -1.0;
    }
    
}