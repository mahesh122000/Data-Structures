import java.io.*;
import java.util.*;


public class Solution {
    static class Node
    {
        int r,c;
        Node an;
        String s;
        Node(int a,int b,Node n,String c)
        {
            this.r=a;
            this.c=b;
            this.an=n;
            this.s=c;
        }
    }
    public static int find(String s[],int i,int j,int n,int m)
    {
        Node goal=null;
        Stack<Node>st=new Stack<>();
        Queue<Node>q=new LinkedList<>();
        int b[][]=new int[n][m];
        q.add(new Node(i,j,null,""));
        while(!q.isEmpty())
        {Node t=q.poll();
         b[t.r][t.c]=1;
        if(s[t.r].charAt(t.c)=='*')
        {goal=t;
        break;}
        if(t.r-1 >= 0 && b[t.r-1][t.c]==0 && s[t.r-1].charAt(t.c) != 'X') {
                Node newNode = new Node(t.r-1, t.c, t,"UP");
                b[t.r-1][t.c] = 1;
                q.add(newNode);                
            }
         if(t.c-1 >= 0 && b[t.r][t.c-1]==0 && s[t.r].charAt(t.c-1) != 'X') {
                Node newNode = new Node(t.r, t.c-1, t,"LEFT");
                b[t.r][t.c-1] = 1;
                q.add(newNode);                 
            }
          
        if(t.c+1 <m && b[t.r][t.c+1]==0 && s[t.r].charAt(t.c+1) != 'X') {
                Node newNode = new Node(t.r, t.c+1, t,"RIGHT");
                b[t.r][t.c+1] = 1;
                q.add(newNode);                  
            }
         if(t.r+1 <n && b[t.r+1][t.c]==0 && s[t.r+1].charAt(t.c) != 'X') {
                Node newNode = new Node(t.r+1, t.c, t,"DOWN");
                b[t.r+1][t.c] = 1;
                q.add(newNode);                 
            }
        }
    Node t=goal;
    while(t!=null)
    {st.push(t);
    t=t.an;}
    int count=0;
    t=st.peek();
    st.pop();
    boolean flag=true;
    while(!st.isEmpty())
    {Node x=st.peek();
    int k=check(t,s,n,m);
    if(flag)
    {if(k>1)
    count++;
    flag=false;}
    else
    {if(k>2)
    count++;}
    st.pop();
    t=x;}
    //System.out.println(t.r+" "+t.c);
    return count;
    }
    public static int check(Node t,String s[],int n,int m)
    {
        int count=0;
        if(t.r-1 >= 0 && s[t.r-1].charAt(t.c) != 'X')
        count++;
        if(t.c-1 >= 0 && s[t.r].charAt(t.c-1) != 'X')
        count++; 
        if(t.c+1 <m && s[t.r].charAt(t.c+1) != 'X')
        count++;
        if(t.r+1 <n && s[t.r+1].charAt(t.c) != 'X') 
        count++;
        return count;
    }
    

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int m=s.nextInt();
            int p=-1,q=-1;
            String a[]=new String[n];
            for(int i=0;i<n;i++)
            {a[i]=s.next();
            for(int j=0;j<m;j++)
            {if(a[i].charAt(j)=='M')
            {p=i;
            q=j;}}}
            int v=s.nextInt();
            int k=find(a,p,q,n,m);
           // System.out.println(k+" "+v);
            if(k==v)
            System.out.println("Impressed");
            else
            System.out.println("Oops!");
        }
    }
}