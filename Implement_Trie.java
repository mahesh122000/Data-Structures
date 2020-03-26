class Trie {
    private Tree root;

    /** Initialize your data structure here. */
    public Trie() {
        root=new Tree();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Tree node=root;
        for(int i=0;i<word.length();i++)
        {if(node.next[word.charAt(i)-'a']==null)
         node.next[word.charAt(i)-'a']=new Tree();
        node=node.next[word.charAt(i)-'a'];}
        node.isWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Tree node=root;
        for(int i=0;i<word.length();i++)
        {if(node.next[word.charAt(i)-'a']==null)
         return false;
        node=node.next[word.charAt(i)-'a'];}
        return node.isWord;
    }
    