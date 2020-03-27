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
	 int a[]=new int[n];
	 int b[]=new int[n];
	 int min=Integer.MAX_VALUE;
	 int max=Integer.MIN_VALUE;
	 for(int i=0;i<n;i++)
	 {
	     a[i]=s.nextInt();
	     min=Math.min(min,a[i]);
	 }
	 for(int i=0;i<n;i++)
	 {
	     b[i]=s.nextInt();
	     max=Math.max(max,b[i]);
	 }
	 int c[]=new int[max+1];
	 for(int i=0;i<n;i++)
	 {c[a[i]]++;
	 if(b[i]==max)
	 {}
	 else
	 c[b[i]+1]--;}
	 for(int i=min;i<c.length;i++)
	 c[i]=c[i]+c[i-1];
	 int maxx=0;
	 int ind=0;
	 for(int i=min;i<c.length;i++)
	 {if(maxx<c[i])
	 {maxx=c[i];
	 ind=i;}}
	 System.out.println(maxx+" "+ind);
	 }
	 }
}