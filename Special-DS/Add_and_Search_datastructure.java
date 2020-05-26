class Trie
{
    class Tree
    {
        Tree next[];
        boolean isWord;
        Tree()
        {
            next=new Tree[26];
        }
    }
    Tree root;
    Trie()
    {
        root=new Tree();
    }
    public void insert(String s)
    {
        Tree node=root;
        for(int i=0;i<s.length();i++)
        {if(node.next[s.charAt(i)-'a']==null)
            node.next[s.charAt(i)-'a']=new Tree();
         node=node.next[s.charAt(i)-'a'];
         }
        node.isWord=true;
    }
    public boolean search(String word)
    {
      return  check(word , 0 , root);  
    }
        
    boolean  check(String word ,  int idx,  Tree node){        
        if(idx>= word.length())
             return node.isWord;
        boolean  ans = false;
        char ch = word.charAt(idx);
         if(ch=='.'){
            for(int i=0 ;i<node.next.length;i++)
                if(node.next[i]!=null)
                    ans = ans ||  check(word,idx+1,node.next[i]);
                
        }else if(node.next[ch-'a']!=null)                  
                 ans = check(word , idx+1, node.next[ch-'a']);
        return  ans;
    }
}
        

class WordDictionary {
Trie trie;
    /** Initialize your data structure here. */
    public WordDictionary() {
        trie=new Trie();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        trie.insert(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return trie.search(word);
    }
}

