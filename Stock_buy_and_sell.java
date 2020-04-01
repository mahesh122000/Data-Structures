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
	 int a[]=new int[n+1];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 a[n]=0;
	 int i=0,j=0;
	 boolean flag=true;
	 while(j<n)
	 {if(a[j]>a[j+1])
	 {if(i==j)
	 {}
	 else
	 {System.out.print("("+i+" "+j+") ");flag=false;}
	 i=j+1;}
	 j++;
	 }
	 if(flag)
	 System.out.println("No Profit");
	 else
	 System.out.println();
	 }
	 }}