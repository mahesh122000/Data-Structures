class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,ArrayList<String>>hm=new HashMap<>();
        for(String s:wordList)
        {for(int i=0;i<s.length();i++)
        {String word=s.substring(0,i)+'*'+s.substring(i+1,s.length());
            if(hm.containsKey(word))
            {hm.get(word).add(s);}
            else
            {ArrayList<String>al=new ArrayList<>();
            al.add(s);
            hm.put(word,al);}}
        }
        HashSet<String>hs=new HashSet<>();
        int ans=1;
        Queue<String>q=new LinkedList<>();
        q.add(beginWord);
        hs.add(beginWord);
        while(!q.isEmpty())
        {
            int size=q.size();
            ans++;
            while(size-->0)
            {String s=q.poll();
            for(int i=0;i<s.length();i++)
            {String word=s.substring(0,i)+'*'+s.substring(i+1,s.length());
            if(hm.containsKey(word))
            {for(String c:hm.get(word))
            {if(c.equals(endWord))
                return ans;
             if(!hs.contains(c))
            {hs.add(c);
            q.add(c);}}}}}
        }
        return 0;
    }
}

