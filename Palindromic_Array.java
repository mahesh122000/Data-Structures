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
	 int count=0;
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int i=0,j=n-1;
	 while(i<=j)
	 {if(a[i]==a[j])
	 {i++;
	 j--;}
	 else if(a[i]>a[j])
	 {a[j-1]+=a[j];
	 j--;count++;}
	 else
	 {a[i+1]+=a[i];
	 i++;count++;}
	 }
	 System.out.println(count);}
	 }
}