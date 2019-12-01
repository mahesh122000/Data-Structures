import java.util.*;
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
	 int m=s.nextInt();
	 int a[]=new int[n];
	 HashMap<Integer,Integer>hm=new HashMap();
	 for(int i=0;i<n;i++)
	 {int k=s.nextInt();
	 a[i]=k;
	 if(hm.containsKey(k))
	 {int p=hm.get(k);
	 p++;
	 hm.replace(k,p);}
	 else
	 {hm.put(k,1);}}
	 Arrays.sort(a);
	 for(int i=0;i<m;i++)
	 {int k=s.nextInt();
	 int p=hm.get(k);
	 for(int j=0;j<p;j++)
	 {System.out.print(k+" ");}
	 hm.remove(k);}
	 for(int i=0;i<n;i++)
	 {if(hm.containsKey(a[i]))
	 System.out.print(a[i]+" ");}}
	 }
}