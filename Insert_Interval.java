class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
        ArrayList<int[]>al=new ArrayList<>();
        ArrayList<int[]>bl=new ArrayList<>();
        int n=intervals.length;
        if(n==0)
        {if(ni.length==0)
         return new int[1][0];
        else
        {int[][] b=new int[1][2];
        b[0][0]=ni[0];
        b[0][1]=ni[1];
        return b;}}
        int q=intervals[0][1];
        int p=intervals[0][0];
        for(int i=1;i<n;i++)
        {if(q>=intervals[i][0])
        {p=Math.min(p,intervals[i][0]);
        q=Math.max(q,intervals[i][1]);}
        else
        {al.add(new int[]{p,q});
        p=intervals[i][0];
        q=intervals[i][1];}}
        al.add(new int[]{p,q});
        if(ni.length==0)
        {int k=al.size();
        int a[][]=new int[k][2];
        for(int i=0;i<k;i++)
        {a[i][0]=al.get(i)[0];
        a[i][1]=al.get(i)[1];}
        return a;}   
        boolean flag=false,f=false;
        for(int i=0;i<al.size();i++)
        {
            if(!(ni[1]>al.get(i)[1] && ni[0]>al.get(i)[1])&&!(ni[0]<al.get(i)[0] &&ni[1]<al.get(i)[0]))
            {ni[1]=Math.max(ni[1],al.get(i)[1]);
            ni[0]=Math.min(ni[0],al.get(i)[0]);
            flag=true;}
            else
            {if(flag)
            {bl.add(new int[]{ni[0],ni[1]});flag=false;f=true;
            bl.add(al.get(i));}
            else
             bl.add(al.get(i));}
        }
        if(f==false)
            bl.add(new int[]{ni[0],ni[1]});
        int k=bl.size();
        Collections.sort(bl,(g,h)->g[0]-h[0]);
        int a[][]=new int[k][2];
        for(int i=0;i<k;i++)
        {a[i][0]=bl.get(i)[0];
        a[i][1]=bl.get(i)[1];}
        return a;
    }
}