class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,int[]>hm=new HashMap<>();
        int n=s.length();
        List<Integer>l=new ArrayList<>();
        if(n==0)
            return l;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(hm.containsKey(c))
            {
                int x[]=hm.get(c);
                x[1]=i;
                hm.put(c,x);
            }
            else
            {
                int x[]=new int[2];
                x[0]=x[1]=i;
                hm.put(c,x);
            }
        }
        int start=0,max=0;
        while(start<n)
        {
            char c=s.charAt(start);
            int k=hm.get(c)[1];
            max=k;
            for(int i=start;i<=max;i++)
            {
                char d=s.charAt(i);
                max=Math.max(max,hm.get(d)[1]);
            }
            l.add(max-start+1);
            start=max+1;
        }
        return l;
    }
}