import java.util.*;
import java.io.*;

class GFG
 {
     public static int stringCompare(String str1, String str2) 
    { 
        for (int i = 0; i < str1.length() &&  i < str2.length(); i++) { 
            if ((int)str1.charAt(i) ==  (int)str2.charAt(i))
                continue; 
            else
                return (int)str1.charAt(i) -  (int)str2.charAt(i); 
        } 
        
        return str1.length()-str2.length(); 
    } 
     static HashMap<String,PriorityQueue<String>>hm;
     static HashSet<String>hs;
     static void insert(String s)
     {
         if(hs.contains(s))
         return;
         hs.add(s);
         for(int i=0;i<s.length();i++)
         {String c=s.substring(0,i+1);
         if(hm.containsKey(c))
         hm.get(c).add(s);
         else
         {PriorityQueue<String>al=new PriorityQueue<>((p,q)->stringCompare(p,q));
         al.add(s);
         hm.put(c,al);
         }}
     }
     
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	    int n=s.nextInt();
	    hm=new HashMap<>();
	    hs=new HashSet<>();
	    for(int i=0;i<n;i++)
	    insert(s.next());
	    String check=s.next();
	    for(int i=0;i<check.length();i++)
	    {String c=check.substring(0,i+1);
	    if(hm.containsKey(c))
	    {PriorityQueue<String>pq=hm.get(c);
	    while(!pq.isEmpty())
	    {System.out.print(pq.poll()+" ");}
	    System.out.println();
	    }
	    else
	    System.out.println("0");
	    }
	 }
	 }
}
