import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {

	public static void main (String[] args)
	{Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 long sum=0;
	 LinkedHashMap<Long,Integer>hm=new LinkedHashMap<>();
	 int count=0;
	 hm.put((long)0,1);
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextLong();
	     sum=sum+a[i];
	 if(hm.containsKey(sum))
	 {count=count+hm.get(sum);
	     int k=hm.get(sum);
	     hm.put(sum,k+1);
	 }
	 else
	 {hm.put(sum,1);}}
	 System.out.println(count);}
	 }
}