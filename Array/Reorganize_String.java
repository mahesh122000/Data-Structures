class Solution {
    public String reorganizeString(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)-'a']++;
        int max=0;
        for(int i=0;i<26;i++)
            max=Math.max(max,a[i]);
        if(max>(s.length()+1)/2)
            return "";
        char c[]=new char[s.length()];
        int l=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[1]==q[1]?p[0]-q[0]:q[1]-p[1]);
        for(int i=0;i<26;i++)
        {
            pq.add(new int[]{i,a[i]});
        }
        while(!pq.isEmpty())
        {
            int x[]=pq.poll();
            if(x[1]==0)
                break;
            for(int j=0;j<x[1];j++)
            {
                c[l]=(char)(x[0]+'a');
                System.out.print(c[l]+" "+l);
                l=(l+2)%c.length;
                if(l==0)
                    l=1;
            }
        }
        return new String(c);
    }
}