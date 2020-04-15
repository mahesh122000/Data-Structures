import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
     
static class Trie
{
    class Tree
    {Tree next[];
    boolean isWord;
    HashMap<Character,Integer>hm;
    Tree()
    {
        next=new Tree[26];
        hm=new HashMap<>();
    }
    }
    Tree root;
    Trie()
    {root=new Tree();
    }
    void insert(String word)
    {
        Tree node=root;
        for(int i=0;i<word.length();i++)
        {if(node.next[word.charAt(i)-'a']==null)
        {node.next[word.charAt(i)-'a']=new Tree();
        node.hm.put(word.charAt(i),1);}
        else
        {int k=node.hm.get(word.charAt(i));
        k++;
        node.hm.put(word.charAt(i),k);}
        node=node.next[word.charAt(i)-'a'];
        }
        node.isWord=true;
    }
    int count(String word)
    {
        Tree node=root;
        int val=0;
        for(int i=0;i<word.length();i++)
        {if(node.next[word.charAt(i)-'a']==null)
        return 0;
        val=node.hm.get(word.charAt(i));
        node=node.next[word.charAt(i)-'a'];
        }
        return val;
    }
}
     
     
	public static void main (String[] args)
	 {
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  while(t-->0)
	  {int n=s.nextInt();
	  Trie tr=new Trie();
	  for(int i=0;i<n;i++)
	  {tr.insert(s.next());}
	  System.out.println(tr.count(s.next()));
	  }
	 }
}