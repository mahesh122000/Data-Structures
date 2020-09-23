class Solution {
    static class Trie
    {
        Trie next[];
        Trie()
        {
            next=new Trie[26];
        }
    }
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(p,q)->q.length()-p.length());
        int ans=0;
        Trie root=new Trie();
        for(int i=0;i<words.length;i++)
        {
            if(insert(words[i],root))
            {
                ans+=words[i].length()+1;
            }
        }
        return ans;
    }
    boolean insert(String s,Trie root)
    {
        boolean val=false;
        char c[]=s.toCharArray();
        Trie node=root;
        for(int i=c.length-1;i>=0;i--)
        {
            if(node.next[c[i]-'a']==null)
            {
                val=true;
                node.next[c[i]-'a']=new Trie();
            }
            node=node.next[c[i]-'a'];
        }
        return val;
    }
}