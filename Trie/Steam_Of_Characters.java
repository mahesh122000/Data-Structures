class StreamChecker {
    static class Trie
    {
        Trie a[];
        boolean isWord;
        Trie()
        {
            a=new Trie[26];
            isWord=false;
        }
    }
    Trie node;
    String ans;
    public StreamChecker(String[] words) {
        ans="";
        node=new Trie();
        for(String s:words)
        {
            Trie root=node;
            for(int i=s.length()-1;i>=0;i--)
            {
                if(root.a[s.charAt(i)-'a']==null)
                    root.a[s.charAt(i)-'a']=new Trie();
                root=root.a[s.charAt(i)-'a'];
            }
            root.isWord=true;
        }
    }
    
    public boolean query(char letter) {
        ans=letter+ans;
        Trie root=node;
        for(int i=0;i<ans.length();i++)
        {
            Trie next=root.a[ans.charAt(i)-'a'];
            if(next==null)
                return false;
            if(next.isWord)
                return true;
            root=next;
        }
        return false;
    }
}