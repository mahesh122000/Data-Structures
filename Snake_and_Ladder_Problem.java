import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static HashMap<Integer,ArrayList<Integer>>hm;
     static HashMap<Integer,Integer>hs;

     static class Node
     {
         int i;
         int count;
         Node(int i,int count)
         {
             this.i=i;
             this.count=count;
         }
     }
     public static int find()
     {
         Queue<Node>q=new LinkedList<>();
         int a[]=new int[31];
         q.add(new Node(1,0));
         Node goal=null;
         while(!q.isEmpty())
         {
             Node n=q.poll();
             if(n.i==30)
             {return n.count;}
             a[n.i]=1;
             ArrayList<Integer>al=hm.get(n.i);
             for(int i=0;i<al.size();i++)
             {int k=al.get(i);
             if(hs.containsKey(k))
             {int kk=hs.get(k);
             if(a[kk]==0)
             {q.add(new Node(kk,n.count+1));
             a[kk]=1;}}
             if(a[k]==0)
             {q.add(new Node(al.get(i),n.count+1));
             a[al.get(i)]=1;}}
         }
         return -1;
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     hm=new HashMap<>();
	     hs=new HashMap<>();
	     for(int i=1;i<=30;i++)
	     {hm.put(i,new ArrayList<>());}
	     int n=s.nextInt();
	     int a[][]=new int[n][2];
	     for(int i=0;i<n;i++)
	     {a[i][0]=s.nextInt();
	     a[i][1]=s.nextInt();
	     hs.put(a[i][0],a[i][1]);}
	     for(int i=1;i<=30;i++)
	     {for(int j=1;j<=6 && i+j<=30;j++)
	     hm.get(i).add(i+j);}
	     for(int i=0;i<n;i++)
	     {ArrayList<Integer>al=hm.get(a[i][0]);
	         al.add(a[i][1]);
	         hm.put(a[i][0],al);
	     }
	     System.out.println(find());
	 }
	 }
}