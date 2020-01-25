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
	long a[]=new long[n];
	HashMap<Long,Integer>hm=new HashMap<>();
	for(int i=0;i<n;i++)
	{a[i]=s.nextLong();
	if(hm.containsKey(a[i]))
	{int k=hm.get(a[i]);
	k++;
	hm.put(a[i],k);}
	else
     hm.put(a[i],1);
	 }
	 boolean flag=false;
	 for(int i=0;i<n;i++)
	 {if(hm.get(a[i])==1)
	 {System.out.println(a[i]);flag=true;
	 break;}}
	    if(flag)
	    {}
	    else
	    System.out.println("0");
	}}}