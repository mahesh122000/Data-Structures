class Solution {
    static HashMap<String,Integer>hm;
    static HashMap<Integer,ArrayList<String>>rhm;
    static List<List<Integer>>al;
    static HashSet<String>hs;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        hm=new HashMap<>();
        rhm=new HashMap<>();
        al=new ArrayList<>();
        hs=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {for(int j=i+1;j<n;j++)
        {int k=nums[i]+nums[j];
         String c=convert(i,j);
        hm.put(c,k);
        if(rhm.containsKey(k))
         rhm.get(k).add(c);
        else
        {ArrayList<String>l=new ArrayList<>();
        l.add(c);
        rhm.put(k,l);}}}
        for(int i=0;i<n;i++)
        {for(int j=i+1;j<n;j++)
        {int k=nums[i]+nums[j];
        if(rhm.containsKey(target-k))
         check(target-k,i,j,nums);}}
        return al;
    }
 String convert(int i,int j)
    {
     String r="";
     r=String.valueOf(i)+'$'+String.valueOf(j);
     return r;
    }
 void check(int v,int i,int j,int a[])
    {
     String d=convert(a[i],a[j]);
    ArrayList<String>bl=rhm.get(v);
     for(String s:bl)
     {String c[]=find(s);
     // System.out.print(c[0].substring(4,c[1].length())+" ");
     int p=Integer.parseInt(c[0].substring(4,c[0].length()));
     int q=Integer.parseInt(c[1].substring(4,c[1].length()));
     if(j<p)
     {String e=convert(a[p],a[q]);
     String g=d+"$"+e;
     if(!hs.contains(g))
     {List<Integer>l=new ArrayList<>();
     l.add(a[i]);
     l.add(a[j]);
     l.add(a[p]);
     l.add(a[q]);
     al.add(l);
     hs.add(g);}}    
     }
    }
    String[] find(String s)
    {
        String c[]=new String[2];
        int i=0;
        for(i=0;i<s.length();i++)
        {if(s.charAt(i)=='$')
         break;
        c[0]+=s.charAt(i);}
        i++;
        for(;i<s.length();i++)
        {
        c[1]+=s.charAt(i);}
        return c;
    }
}