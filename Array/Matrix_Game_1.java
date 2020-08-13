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
	     {
	         int n=s.nextInt();
	         int a[][]=new int[n][n];
	         for(int i=0;i<n;i++)
	         {
	             String c=s.next();
	             for(int j=0;j<n;j++)
	             {
	                 a[i][j]=c.charAt(j)-'0';
	             }
	         }
	         HashSet<String>hs=new HashSet<>();
	         int k=0;
	         for(int i=0;i<n;i++)
	         {
	             String c="";
	             for(int j=0;j<n;j++)
	             {
	                 if(a[i][j]==1)
	                 {
	                     c+=j+'$';
	                 }
	             }
	             if(!hs.contains(c) && c.length()>0)
	             {
	                 hs.add(c);
	                 System.out.print(k+" ");
	                 k++;
	             }
	         }
	         if(k==0)
	         System.out.print("-1");
	         System.out.println();
	     }
	 }
}