class Solution {

public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2)
            return n;
        Set<String>hs=new HashSet<>();
        int max=1;
        for(int i=0;i<n;i++)
        {
            int a[]=points[i];
            if(hs.contains(a[0]+"$"+a[1]))
                continue;
            int lmax=1;
            int count=0;
            HashMap<Double,Integer>hm=new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                if(same(a,points[j]))
                {
                    count++;
                    continue;
                }
                double s=slope(a,points[j]);
                hm.put(s,hm.getOrDefault(s,1)+1);
                lmax=Math.max(lmax,hm.get(s));
            }
            hs.add(a[0]+"$"+a[1]);
            max=Math.max(max,lmax+count);
        }
        return max;
    }
    public double slope(int a[],int b[])
    {
 	if (a[0] == b[0]) return Double.MAX_VALUE;
	if (a[1] == b[1]) return 0;
    double x=(double) (a[0] - b[0]);
    double y=(double) (a[1] - b[1]);
        if(x==y)
            return 1.0;
        return ((y*1000000000)/x)/1000000000;
    }
    public boolean same(int a[],int b[])
    {
        return a[0] == b[0] && a[1] == b[1];
    }
}


