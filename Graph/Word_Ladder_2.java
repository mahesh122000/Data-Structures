class Solution {
    static class Node
    {
        String s;
        Node an;
        Node(String s,Node an)
        {
            this.s=s;
            this.an=an;
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
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
        Queue<Node>q=new LinkedList<>();
        q.add(new Node(beginWord,null));
        ArrayList<Node>node=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            if(node.size()>0)
                break;
            while(size-->0)
            {Node n=q.poll();
             String s=n.s;
             hs.add(s);
            for(int i=0;i<s.length();i++)
            {String word=s.substring(0,i)+'*'+s.substring(i+1,s.length());
            if(hm.containsKey(word))
            {for(String c:hm.get(word))
            {if(c.equals(endWord))
            {node.add(new Node(endWord,n));
            continue;}
             if(!hs.contains(c))
            {q.add(new Node(c,n));}}}}}
        }
      List<List<String>>al=new ArrayList<>();
      for(Node n:node)
      {
          List<String>l=new ArrayList<>();
          while(n!=null)
          {String s=n.s;
          l.add(0,s);
          n=n.an;}
          al.add(l);
      }
    return al;
    }
}