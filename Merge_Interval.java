public int[][] merge(int[][] a) {
        int n=a.length;
        if(n==0)
            return new int[0][0];
        Arrays.sort(a,(p,q)->p[0]-q[0]);
        List<int[]>l=new ArrayList<>();
        int i=Integer.MIN_VALUE,j=i;
        for(int b[]:a)
        {
         if(b[0]>j)
        {if(i>Integer.MIN_VALUE)
            l.add(new int[]{i,j});
        i=b[0];
        j=b[1];
        }
        else
        {j=Math.max(j,b[1]);}
        }
        if(i>Integer.MIN_VALUE)
            l.add(new int[]{i,j});
        return l.toArray(new int[][]{});
    }