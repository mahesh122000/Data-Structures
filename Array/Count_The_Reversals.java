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
	        int n=c.length();
	        int count1=0,count2=0;
	        for(int i=0;i<n;i++)
	        {
	            if(c.charAt(i)=='{')
	            count1++;
	            else
	            {
	                if(count1==0)
	                {
	                    count2++;
	                }
	                else
	                {
	                    count1--;
	                }
	            }
	        }
	        if((count1+count2)%2==1)
	        System.out.println("-1");
	        else
	        {
	            int ans=0;
	            if(count1%2==0)
	            ans+=count1/2;
	            else
	            ans+=count1/2+1;
	            if(count2%2==0)
	            ans+=count2/2;
	            else
	            ans+=count2/2+1;
	            System.out.println(ans);
	        }
	    }
	}
}