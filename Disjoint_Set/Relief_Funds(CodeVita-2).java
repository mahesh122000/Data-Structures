


import java.util.*;
import java.io.*;

class Main {
    static int p[];
    static int a[];
    static void assign(int x,int y)
    {
        int xx=find(x);
        int yy=find(y);
        if(xx!=yy)
        fill(x,yy);
    }
    static void func(int x,int y)
    {
        if(p[y]==-1)
        {
            p[x]=y;
            return;
        }
        else
        {
            func(y,p[y]);
            p[x]=p[y];
        }
    }
    static void fill(int x,int y)
    {
        if(p[x]==-1)
        {
            p[x]=y;
            return;
        }
        else
        {
            fill(p[x],y);
            p[x]=y;
        }
    }
    static int find(int x)
    {
        if(p[x]==-1)
        return x;
        p[x]=find(p[x]); 
        return p[x];
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        a=new int[n];
        p=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            p[i]=-1;
        }
        int k=s.nextInt();
        for(int i=0;i<k;i++)
        {
            int u=s.nextInt()-1;
            int v=s.nextInt()-1;
            assign(u,v);
        //    for(int j=0;j<n;j++)
        //    {
        //        System.out.print(p[j]+" ");
        //    }
        //    System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            if(p[i]!=-1)
            {
                func(i,p[i]);
            }
        }
        HashMap<Integer,HashSet<Integer>>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>al=new HashSet<>();
            al.add(i);
            hm.put(i,al);
        }
        for(int i=0;i<n;i++)
        {
            if(p[i]!=-1)
            {
                hm.get(p[i]).add(i);
            }
        }
        int len=n,ind=0;
        long max=0;
        for(int i=0;i<n;i++)
        {
            
            //System.out.println(hm.get(i).size());
            if(hm.get(i).size()>1)
            {
                long val=0;
                HashSet<Integer>al=hm.get(i);
                int l=al.size();
                for(int j:al)
                {
                    val+=a[j];
                }
                if(max<val)
                {
                    max=val;
                    len=l;
                    ind=i;
                }
                else if(val==max)
                {
                   if(l<len)
                   {
                     len=l;
                     ind=i;
                   }
                }
            }
        }
        HashSet<Integer>hs=hm.get(ind);
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:hs)
        al.add(i);
        Collections.sort(al);
        for(int i:al)
        {
            int kk=i+1;
            System.out.print(kk+" ");
        }
    }
}
  
  
/*
An NGO wants to arrange funds for flood relief. It has divided volunteers into groups. A volunteer can only be a part of single group. Your task is to identify the members of the group which collects the maximum funds.

You will be given the funds collected by each volunteer and grouping pairs of the volunteers. You need group the volunteers through these pairs.

If there are more than one group, collecting maximum funds, then print the group having lesser members
*/
  
  