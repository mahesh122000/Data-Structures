class Solution {
    ArrayList<Integer>al;
    String arr[]={"zero","eight","six","two","seven","five","four","three","one","nine"};
    int val[]={0,8,6,2,7,5,4,3,1,9};
    public String originalDigits(String s) {
        int a[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            a[s.charAt(i)-'a']++;
        }
        al=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            find(a,arr[i],val[i]);
        }
        Collections.sort(al);
        String ans="";
        for(int i=0;i<al.size();i++)
            ans+=al.get(i)+"";
        return ans;
    }
    void find(int a[],String c,int k)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<c.length();i++)
        {
            min=Math.min(min,a[c.charAt(i)-'a']);
        }
        if(min==0)
            return;
        for(int i=0;i<c.length();i++)
        {
            a[c.charAt(i)-'a']-=min;
        }
        for(int i=0;i<min;i++)
            al.add(k);
    }
}