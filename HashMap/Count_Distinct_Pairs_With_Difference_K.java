import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static String convert(int i,int j)
     {
         return String.valueOf(i)+'$'+String.valueOf(j);
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int a[]=new int[n];
	     for(int i=0;i<n;i++)
	     a[i]=s.nextInt();
	     int k=s.nextInt();
	     HashSet<String>hs=new HashSet<>();
	     HashSet<Integer>h=new HashSet<>();
	     HashMap<Integer,Integer>hm=new HashMap<>();
	     for(int i=0;i<n;i++)
	     {h.add(a[i]);
	     if(hm.containsKey(a[i]))
	     {hm.put(a[i],hm.get(a[i])+1);}
	     else
	     hm.put(a[i],1);}
	     Arrays.sort(a);
	     int count=0;
	     for(int i=0;i<n;i++)
	     {
	         if(k==0 && hm.get(a[i])>=2)
	         {if(h.contains(k+a[i]))
	         {String c=convert(a[i],k+a[i]);
	         if(hs.contains(c))
	         {}
	         else
	         {count++;hs.add(c);
	             String cc=convert(k+a[i],a[i]);
	             hs.add(cc);
	         }
	         }
	         if(h.contains(a[i]-k))
	         {String c=convert(a[i],a[i]-k);
	         if(hs.contains(c))
	         {}
	         else
	         {count++;hs.add(c);
	             String cc=convert(a[i]-k,a[i]);
	             hs.add(cc);
	         }
	         }}
	         else if(k!=0)
	         {if(h.contains(k+a[i]))
	         {String c=convert(a[i],k+a[i]);
	         if(hs.contains(c))
	         {}
	         else
	         {count++;hs.add(c);
	             String cc=convert(k+a[i],a[i]);
	             hs.add(cc);
	         }
	         }
	         if(h.contains(a[i]-k))
	         {String c=convert(a[i],a[i]-k);
	         if(hs.contains(c))
	         {}
	         else
	         {count++;hs.add(c);
	             String cc=convert(a[i]-k,a[i]);
	             hs.add(cc);
	         }
	         }}
	     }
	     System.out.println(count);
	 }
	 }
}