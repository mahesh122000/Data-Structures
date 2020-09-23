class Solution {
    public boolean reorderedPowerOf2(int N) {
        int val=1;
        HashSet<String>hs=new HashSet<>();
        while(val<1000000000)
        {
            String c=Integer.toString(val);
            char a[]=c.toCharArray();
            Arrays.sort(a);
            hs.add(new String(a));
            val*=2;
        }
        String c=Integer.toString(N);
        char a[]=c.toCharArray();
        Arrays.sort(a);
        return hs.contains(new String(a));
    }
}