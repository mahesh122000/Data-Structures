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
	     String c=s.next();
	     int a[]=new int[26];
	     int sum=0;
	     for(int i=0;i<c.length();i++)
	     {
	         char b=c.charAt(i);
	         if(b>='A' && b<='Z')
	         {
	             a[b-'A']++;
	         }
	         else
	         {sum+=b-'0';}
	     }
	     for(int i=0;i<26;i++)
	     {
	         for(int j=0;j<a[i];j++)
	         System.out.print((char)(i+'A'));
	     }
	     if(sum!=0)
	     System.out.print(sum);
	     System.out.println();
	 }
	 }
}