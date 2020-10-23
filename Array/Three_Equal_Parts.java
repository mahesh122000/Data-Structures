class Solution {
    public int[] threeEqualParts(int[] a) {
        int n=a.length;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            al.add(i);
        }
        if(al.size()==0)
            return new int[]{0,2};
        if(al.size()%3!=0)
            return new int[]{-1,-1};
        int l=al.size()/3;
        int i1=0,i2=l,i3=2*l;
        for(int i=0;i<l-1;i++)
        {
            int g1=al.get(i1+i+1)-al.get(i1+i);
            int g2=al.get(i2+i+1)-al.get(i2+i);
            int g3=al.get(i3+i+1)-al.get(i3+i);
            if(g1!=g2||g2!=g3)
                return new int[]{-1,-1};
        }
        int r1=al.get(i2)-al.get(i2-1)-1;
        int r2=al.get(i3)-al.get(i3-1)-1;
        int r3=n-al.get(al.size()-1)-1;
        if(r1<r3||r2<r3)
            return new int[]{-1,-1};
        return new int[]{
            al.get(i2-1)+r3,
            al.get(i3-1)+r3+1
        };
    }
}

