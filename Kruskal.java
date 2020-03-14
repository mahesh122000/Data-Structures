import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    int v;
    int e;
    Edge[] edge;
    Solution(int v,int e)
    {this.v=v;
    this.e=e;
    edge=new Edge[e];
    for(int i=0;i<e;i++)
    edge[i]=new Edge();}
    public void sub(int i,int a,int b,int c)
    {edge[i].source=a;
    edge[i].dest=b;
    edge[i].wt=c;}
    
    class Edge
    {
        int source;
        int dest;
        int wt;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        Solution s1=new Solution(n,e);
        for(int i=0;i<e;i++)
        {int p=s.nextInt();
        int q=s.nextInt();
        int r=s.nextInt();
        s1.sub(i,p,q,r);
        }
        Arrays.sort(s1.edge,new Comparator<Edge>(){
            public int compare(Edge a,Edge b)
            {if(a.wt!=b.wt)
            return a.wt-b.wt;
            return a.source+a.dest-(b.source+b.dest);}
        });
        Solution s2=new Solution(n,n-1);
        int j=0;
        int b[]=new int[s2.v+1];
        Arrays.fill(b,-1);
        for(int i=0;i<s2.e;)
        {if(s2.cycle(b,s1.edge[j]))
        {j++;}
        else
        {s2.edge[i]=s1.edge[j];
        j++;i++;}}
        int ans=0;
        for(Edge ed:s2.edge)
        {ans+=ed.wt;//System.out.println(ed.source+" "+ed.dest);
        }
        System.out.println(ans);
    }
public boolean cycle(int a[],Edge e)
{int p=find(a,e.source);
int q=find(a,e.dest);
if(p==q)
return true;
union(a,p,q);
return false;}
public void union(int a[],int p,int q)
{
    a[p]=q;
}
public int find(int a[],int p)
{if(a[p]==-1)
return p;
return find(a,a[p]);}
} 