import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static String convert(int a[],int k)
    {
        String ans="";
        for(int i=0;i<a.length;i++)
        ans+=(char)(a[i]+'0');
        if(k==1)
        ans="1"+ans;
        return ans;
    }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String c=s.next();
	         int l=c.length();
	         int a[]=new int[l];
	         for(int i=0;i<l;i++)
	         a[i]=c.charAt(i)-'0';
	         int ad=0;
	         if(a[l-1]<=5)
	         a[l-1]=0;
	         else
	         {
	             ad=1;
	             a[l-1]=0;
	             for(int i=l-2;i>=0;i--)
	             {
	                 a[i]=a[i]+ad;
	                 if(a[i]>=10)
	                 {
	                     a[i]%=10;
	                     ad=1;
	                 }
	                 else
	                 ad=0;
	             }
	         }
	         System.out.println(convert(a,ad));
	     }
	 }
}