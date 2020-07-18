class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a[][]=new int[4][2];
        a[0]=p1;
        a[1]=p2;
        a[2]=p3;
        a[3]=p4;
        double dis1=Double.MAX_VALUE;
        double dis2=0;
        HashMap<Double,Integer>hm=new HashMap<>();
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                double v=find(a[i],a[j]);
                dis1=Math.min(dis1,v);
                dis2=Math.max(dis2,v);
                int count=1;
                if(hm.containsKey(v))
                {
                    count+=hm.get(v);
                }
                hm.put(v,count);
            }
        }
        if(hm.size()==2 && hm.get(dis1)==4 && hm.get(dis2)==2)
            return true;
        return false;
    }
    double find(int a[],int b[])
    {
        return Math.sqrt((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]));
    }
}