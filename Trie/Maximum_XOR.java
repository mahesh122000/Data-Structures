import java.io.*;
import java.util.*;

public class Solution {
    static class Trie
    {
        Trie left=null;
        Trie right=null;
    }

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int m=s.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        b[i]=s.nextInt();
        Trie root=new Trie();
        for(int i=0;i<n;i++)
        insert(root,a[i]);
        for(int i=0;i<m;i++)
        {System.out.println(xor(root,b[i]));}
    }
    static int[] binary(int n)
    {
        int a[]=new int[32];
        for(int i=0;i<32;i++)
        {a[i]=n&1;
        n=n>>1;}
        return a;
    }
    static void insert(Trie root,int n)
    {
        int a[]=binary(n);
        for(int i=31;i>=0;i--)
        {if(a[i]==1)
            {if(root.right==null)
             root.right=new Trie();
            root=root.right;}
        if(a[i]==0)
         {if(root.left==null)
             root.left=new Trie();
            root=root.left;}
        }
    }
    static  public int xor(Trie root,int n)
    {
        int v=0;
        int a[]=binary(n);
        for(int i=31;i>=0;i--)
        {
            v=v<<1;
            if(a[i]==1)
            {
                if(root.left==null)
                {v=v|1;
                root=root.right;}
                else
                root=root.left;
            }
            if(a[i]==0)
            {
                if(root.right==null)
                    root=root.left;
                else
                {v=v|1;
                root=root.right;}
            }
        }
        return v^n;
    }
}