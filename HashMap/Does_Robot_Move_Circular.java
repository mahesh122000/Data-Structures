import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static String convert(int i,int j)
     {
         return String.valueOf(i)+'$'+String.valueOf(j);
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     String c=s.next();
	     HashSet<String>hs=new HashSet<>();
	     hs.add(convert(0,0));
	     int p=0;
	     int q=0;
	     int k=1;
	     for(int i=0;i<c.length();i++)
	     {
	         if(c.charAt(i)=='G')
	         {if(k==1)
	         p=p+1;
	         else if(k==2)
	         q=q+1;
	         else if(k==3)
	         p=p-1;
	         else
	         q=q-1;
	         hs.add(convert(p,q));
	         }
	         else if(c.charAt(i)=='L')
	         {if(k==1)
	         k=2;
	         else if(k==2)
	         k=3;
	         else if(k==3)
	         k=4;
	         else
	         k=1;
	         }
	         else
	         {if(k==1)
	         k=4;
	         else if(k==2)
	         k=1;
	         else if(k==3)
	         k=2;
	         else
	         k=3;
	         }
	     }
	     if(p==0 &&q==0)
	     System.out.println("Circular");
	     else
	     System.out.println("Not Circular");
	 }
	 }
}