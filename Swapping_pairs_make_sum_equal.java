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
	 HashSet<Integer>hs=new HashSet<Integer>();
	 long sum1=0,sum2=0;
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();hs.add(a[i]);sum1+=a[i];}
	 int b[]=new int[m];
	 for(int i=0;i<m;i++)
	 {b[i]=s.nextInt();sum2+=b[i];}
	 boolean flag=false;
	 for(int i=0;i<m;i++)
	 {long p=sum1+b[i];
	 long q=sum2-b[i];
	 int r=(int)(p-q);
	 r=r/2;
	 if(hs.contains(r))
	 {flag=true;break;}}
	 if(flag)
	 System.out.println("1");
	 else
	 System.out.println("-1");}}}