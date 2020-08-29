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
	         String a=s.next();
	         String b=s.next();
	         int arr[][]=new int[26][2];
	         if(a.length()==b.length())
	         {for(int i=0;i<a.length();i++)
	         {
	             if(i%2==0)
	             {
	                 arr[a.charAt(i)-'a'][0]++;
	                 arr[b.charAt(i)-'a'][0]--;
	             }
	             else
	             {
	                 arr[a.charAt(i)-'a'][1]++;
	                 arr[b.charAt(i)-'a'][1]--;
	             }
	         }
	         boolean flag=false;
	         for(int i=0;i<26;i++)
	         {
	             if(arr[i][0]!=0||arr[i][1]!=0)
	             {
	                 flag=true;
	                 break;
	             }
	         }
	         if(flag)
	         System.out.println("0");
	         else
	         System.out.println('1');
	         }
	         else
	         System.out.println("0");
	     }
	 }
}