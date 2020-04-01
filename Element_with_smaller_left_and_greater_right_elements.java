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
	 a[0]=s.nextInt();
	 int max=a[0];
	 int l[]=new int[n];
	 for(int i=1;i<n;i++)
	     a[i]=s.nextInt();
	 l[0]=a[0];
	 for(int i=1;i<n;i++)
	 l[i]=Math.max(l[i-1],a[i]);
	 int r[]=new int[n];
	 r[n-1]=a[n-1];
	 for(int i=n-2;i>=0;i--)
	 r[i]=Math.min(r[i+1],a[i]);
	 int j=-1;
	 for(int i=0;i<n;i++)
	 {if(l[i]==r[i] && i!=0 && i!=n-1)
	 {j=i;break;}}
	 if(j==-1)
	 System.out.println(j);
	 else
	 System.out.println(a[j]);
	 }
	 }
}