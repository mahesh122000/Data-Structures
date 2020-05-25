class Solution {
    public List<Integer> findDuplicates(int[] a) {
        List<Integer>l=new ArrayList<>();
        int n=a.length;
        for(int i=0;i<n;)
        {if(a[i]-1==i|a[i]==-1)
        {i++;}
        else
        {int t=a[i];
        int k=a[a[i]-1];
        if(t==k)
        {l.add(t);
        a[i]=-1;
        i++;}
        else
        {a[a[i]-1]=t;
        a[i]=k;}}}
        return l;
    }
}