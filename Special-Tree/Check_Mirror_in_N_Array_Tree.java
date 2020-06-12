import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static ArrayList<ArrayList<Integer>>al;
    static ArrayList<ArrayList<Integer>>bl;
	public static void main (String[] args)
	 {
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  while(t-->0)
	  {
	      int n=s.nextInt();
	      int e=s.nextInt();
	      al=new ArrayList<>();
	      bl=new ArrayList<>();
	      for(int i=0;i<n;i++)
	      {al.add(new ArrayList<>());
	      bl.add(new ArrayList<>());}
	      for(int i=0;i<e;i++)
	      {int p=s.nextInt()-1;
	      int q=s.nextInt()-1;
	      al.get(p).add(q);}
	      for(int i=0;i<e;i++)
	      {int p=s.nextInt()-1;
	      int q=s.nextInt()-1;
	      bl.get(p).add(0,q);}
	      if(find(n))
	      System.out.println("1");
	      else
	      System.out.println("0");
	  }
	 }
	public static boolean find(int n)
	{
	    for(int i=0;i<n;i++)
	    {if(al.get(i).size()!=bl.get(i).size())
	    return false;
	    else
	    {for(int j=0;j<al.get(i).size();j++)
	    {if(al.get(i).get(j)!=bl.get(i).get(j))
	    return false;}}}
	    return true;
	}
}