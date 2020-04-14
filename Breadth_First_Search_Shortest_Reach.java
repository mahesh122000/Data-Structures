import java.io.*;
import java.util.*;

public class Solution {
    static HashMap<Integer,ArrayList<Integer>>hm;
    public static void bfs(int v[],int i)
    {
        if(v[i]!=-1)
        return;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        int val=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {int k=q.poll();
            if(v[k]==-1)
            {for(Integer in:hm.get(k))
            {q.add(in);}
            v[k]=val;}
            }
            val+=6;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int m=s.nextInt();
        hm=new HashMap<>();
        for(int i=1;i<=n;i++)
        {ArrayList<Integer>l=new ArrayList<>();
        l.add(i);
        hm.put(i,l);
        }
        int vis[]=new int[n+1];
        Arrays.fill(vis,-1);
        for(int i=0;i<m;i++)
        {int p=s.nextInt();
        int q=s.nextInt();
        ArrayList<Integer>al=hm.get(p);
        al.add(q);
        hm.put(p,al);
        ArrayList<Integer>bl=hm.get(q);
        bl.add(p);
        hm.put(q,bl);}
        int k=s.nextInt();
        bfs(vis,k);
        for(int i=1;i<=n;i++)
        {if(i!=k)
        System.out.print(vis[i]+" ");
        }
        System.out.println();}
    }}
