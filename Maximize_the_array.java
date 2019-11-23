import java.util.*;
import java.util.Collections;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 HashSet<Integer>hs=new HashSet<Integer>();
	 for(int i=0;i<n;i++)
	 hs.add(a[i]);
	 for(int i=0;i<n;i++)
	 hs.add(b[i]);
	 int l=hs.size();

	 int c[]=new int[l];
	 Iterator<Integer>it=hs.iterator();
	 int i=0;
	 while(it.hasNext())
	 {c[i]=it.next();
	 i++;}
	 hs.clear();
     Arrays.sort(c);
     int d[]=new int[l];
     int j=0;
     for(j=0,i=l-1;j<l;j++,i--)
     {d[j]=c[i];}
     for(i=0;i<n;i++)
     hs.add(d[i]);
	 for(i=0;i<n;i++)
	 {if(hs.contains(b[i]))
	 System.out.print(b[i]+" ");hs.remove(b[i]);}
	 for(i=0;i<n;i++)
	 {if(hs.contains(a[i]))
	 System.out.print(a[i]+" ");hs.remove(a[i]);}
	 
	     System.out.println();
	 }}}