import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String string[] = bi.readLine().trim().split(" ");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = Integer.parseInt(string[i]);  
            }
	         HashSet<Integer>hs1=new HashSet<>();
	         HashSet<Integer>hs2=new HashSet<>();
	         int v2=a[0];
	         hs1.add(n-1);
	         hs2.add(0);
	         int v1=a[n-1];
	         for(int i=1,j=n-2;i<n;i++,j--)
	         {
	             if(a[i]>v2)
	             {
	                 hs2.add(i);
	                 v2=a[i];
	             }
	             if(a[j]>v1)
	             {
	                 hs1.add(j);
	                 v1=a[j];
	             }
	         }
	         String ans1="";
	         String ans2="";
	         for(int i=0;i<n;i++)
	         {
	             if(hs1.contains(i))
	             ans1+=a[i]+" ";
	             if(hs1.contains(i) && hs2.contains(i))
	             ans2+=a[i]+" ";
	         }
	         if(ans1.equals(""))
	         System.out.println("-1");
	         else
	         System.out.println(ans1);
	         if(ans2.equals(""))
	         System.out.println("-1");
	         else
	         System.out.println(ans2);
	          
	     }
	 }
}