import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     int a[][]={{0,1,0},{2,1,0},{2,1,0}};
	     while(t-->0)
	     {
	         String c=s.next();
	         int count=0;
	         int state=0;
	         for(int i=0;i<c.length();i++)
	         {
	             char d=c.charAt(i);
	             if(d!='0'&&d!='1')
	             {
	                 state=0;
	                 continue;
	             }
	             if(state==2 && d=='1')
	             count++;
	             state=a[state][d-'0'];
	         }
	         System.out.println(count);
	     }
	 }
}