/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
    static ArrayList<ArrayList<Integer>>al;
    static ArrayList<HashSet<Integer>>bl;
    static int ans;
    static void find(int i)
    {
        System.out.println(i);
        ArrayList<Integer>l=al.get(i);
        for(int k=0;k<l.size();k++)
        {
            int j=l.get(k);
            if(al.get(j).size()>=2)
            {
                
                calc(i,j);
            }
        }
    }
    static void calc(int i,int j)
    {
        System.out.println(i+" "+j);
        HashSet<Integer>hs=new HashSet<>(bl.get(i));
        hs.retainAll(bl.get(j));
        if(hs.size()==0)
        return ;
        Iterator<Integer>it=hs.iterator();
        while(it.hasNext())
        {
            int k=it.next();
            ans=Math.min(ans,al.get(i).size()-2+al.get(j).size()-2+al.get(k).size()-2);
            System.out.println(ans);
        }
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        al=new ArrayList<>();
        bl=new ArrayList<>();
        int m=s.nextInt();
        for(int i=0;i<n;i++)
        {
            al.add(new ArrayList<>());
            bl.add(new HashSet<>());
        }
        for(int i=0;i<m;i++)
        {
            int p=s.nextInt()-1;
            int q=s.nextInt()-1;
            al.get(p).add(q);
            al.get(q).add(p);
            bl.get(p).add(q);
            bl.get(q).add(p);
        }
        ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(al.get(i).size()>=2)
            {
                find(i);
            }
        }
        if(ans==Integer.MAX_VALUE)
        System.out.println("-1");
        else
        System.out.println(ans);
    }
}