class Solution {
    public int[] beautifulArray(int N) {
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<=N;i++)
            l.add(i);
        List<Integer>al=split(l);
        int a[]=new int[N];
        for(int i=0;i<al.size();i++)
            a[i]=al.get(i);
        return a;
    }
    List<Integer> split(List<Integer>l)
    {
        if(l.size()<3)
            return l;
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        for(int i=0;i<l.size();i++)
        {
            if(i%2==0)
                odd.add(l.get(i));
            else
                even.add(l.get(i));
        }
        odd=split(odd);
        even=split(even);
        List<Integer>temp=new ArrayList<>();
        temp.addAll(odd);
        temp.addAll(even);
        return temp;
    }
}