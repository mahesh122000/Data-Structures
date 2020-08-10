import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
   static  String[] day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

static void find(int d,int m,int y)
{
    if(m<3)
    {
        m+=12;
        y-=1;
    }
    
    int c=y/100;
    y%=100;
    
    int dow=(c/4-2*c+y+y/4+13*(m+1)/5+d-1)%7;
    
    System.out.println(day[(dow+7)%7]);
    
}

	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int d=s.nextInt();
	         int m=s.nextInt();
	         int y=s.nextInt();
	         find(d,m,y);
	     }
	 }
}