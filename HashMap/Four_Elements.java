import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static boolean check(int k,int i,int j)
    {
        ArrayList<int[]>al=hm.get(k);
        
        for(int[] a:al)
        {
            if(a[0]!=i && a[0]!=j && a[1]!=i && a[1]!=j)
            return true;
        }
        return false;
    }
    
    static HashMap<Integer,ArrayList<int[]>>hm;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]=s.nextInt();
	         }
	         int sum=s.nextInt();
	         hm=new HashMap<>();
	         for(int i=0;i<n;i++)
	         {
	             for(int j=i+1;j<n;j++)
	             {
	                 int k=a[i]+a[j];
	                 if(hm.containsKey(k))
	                 {
	                     hm.get(k).add(new int[]{i,j});
	                 }
	                 else
	                 {
	                     ArrayList<int[]>al=new ArrayList<>();
	                     al.add(new int[]{i,j});
	                     hm.put(k,al);
	                 }
	             }
	         }
	         boolean flag=false;
	         one:for(int i=0;i<n;i++)
	         {
	             for(int j=i+1;j<n;j++)
	             {
	                 if(hm.containsKey(sum-a[i]-a[j]))
	                 {
	                     if(check(sum-a[i]-a[j],i,j))
	                     {
	                         flag=true;
	                         break;
	                     }
	                 }
	             }
	         }
	         if(flag)
	         System.out.println("1");
	         else
	         System.out.println("0");
	     }
	 }
}
