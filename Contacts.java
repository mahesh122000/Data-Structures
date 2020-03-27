import java.io.*;
import java.util.*;

class TrieNode {
    private HashMap<Character, TrieNode> children = new HashMap<>();
    public int size = 0; // this was the main trick to decrease runtime to pass tests.

    public void putChildIfAbsent(char ch) {
        children.putIfAbsent(ch, new TrieNode());
    }

    public TrieNode getChild(char ch) {
        return children.get(ch);
    }
}

class Trie {
    TrieNode root = new TrieNode();
    
    public void insert(String str) {
        TrieNode curr = root;
        for (char ch : str.toCharArray()) {
            curr.putChildIfAbsent(ch);
            curr = curr.getChild(ch);
            curr.size++;
        }
    }
    
    public int search(String prefix) {
        TrieNode curr = root;
        
        for (char ch : prefix.toCharArray()) {
            curr = curr.getChild(ch);
            if (curr == null) {
                return 0;
            }
        }
        return curr.size;
    }
}
public class Solution {

    public static void main(String[] args) 
           {
               Scanner s=new Scanner(System.in);
               int n=s.nextInt();
               Trie trie=new Trie();
               for(int i=0;i<n;i++)
               {String a=s.next();
               String b=s.next();
               if(a.equals("add"))
               trie.insert(b);
               else
               System.out.println(trie.search(b));}
           }
}