class Solution {
    public String sortString(String s) {
        TreeSet<Character>hs=new TreeSet<>();
        int n=s.length();
        for(int i=0;i<n;i++)
            hs.add(s.charAt(i));
        int l=hs.size();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {if(hm.containsKey(s.charAt(i)))
        {int p=hm.get(s.charAt(i));
        p++;
        hm.put(s.charAt(i),p);}
        else
        {hm.put(s.charAt(i),1);}}
        String ans="";
        ArrayList<Character>al=new ArrayList<>();
        Iterator<Character>it=hs.iterator();
         while(it.hasNext())
        {al.add(it.next());}
        hs.clear();
        while(hs.size()<l)
        {Collections.sort(al);
        for(Character c:al)
        {if(hm.containsKey(c) && !hs.contains(c))
        {int p=hm.get(c);
        p--;
        if(p==0)
        {hm.remove(c);
        hs.add(c);}
        else
        {hm.put(c,p);}
        ans+=c+"";}}
        Collections.sort(al,Collections.reverseOrder());
         for(Character c: al)
        {
        if(hm.containsKey(c) && !hs.contains(c))
        {int p=hm.get(c);
        p--;
        if(p==0)
        {hm.remove(c);
        hs.add(c);}
        else
        {hm.put(c,p);}
        ans+=c+"";}}}
    return ans;}
}