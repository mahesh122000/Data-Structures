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
	         int a=s.nextInt();
	         int b=s.nextInt();
	         HashMap<Integer,Integer>hm=new HashMap<>();
	         int r=a/b;
	         int d=a%b;
	         StringBuilder ans=new StringBuilder("");
	         ans.append(r);
	         if(d==0)
	         {
	             System.out.println(ans.toString());
	         }
	         else
	         {
	             ans.append(".");
	             int k=0;
	             while(d>0 && !hm.containsKey(d))
	             {
	                 hm.put(d,ans.length());
	                 d=d*10;
	                 k=d/b;
	                 ans.append(k);
	                 d=d%b;
	             }
	             if(d!=0)
	             {ans.insert(hm.get(d),"(");
	             ans.append(")");}
	             System.out.println(ans);
	         }
	     }
	 }
}




