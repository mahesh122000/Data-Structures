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
	 int q=s.nextInt();
	 char gg[]=new char[n];
	 HashMap<Character,HashSet<Character>>hm=new HashMap<>();
	 for(int i=0;i<n;i++)
	 {char h=s.next().charAt(0);
	 gg[i]=h;
	 HashSet<Character>hs=new HashSet<>();
	 hs.add(h);
	 hm.put(h,hs);
	 }
	 
	 for(int i=0;i<q;i++)
	 {String c=s.next();
	 if(c.equals("addincircle"))
	 {char a=s.next().charAt(0);
	 char b=s.next().charAt(0);
	 HashSet<Character>hs1=hm.get(a);
	 HashSet<Character>hs2=hm.get(b);
	 hs1.addAll(hs2);
	 Iterator<Character>it1=hs1.iterator();
	 while(it1.hasNext())
	 {char kk=it1.next();
	 if(kk!=a)
	 hm.put(kk,hs1);}
	 }
	 else
	 {
	 char a=s.next().charAt(0);
	 char b=s.next().charAt(0); 
	 boolean flag=false;
	 if(hm.containsKey(a) && hm.get(a).contains(b))
	 flag=true;
	 if(flag)
	 System.out.println("1");
	 else
	 System.out.println("0");
	 }}}
	 }
}