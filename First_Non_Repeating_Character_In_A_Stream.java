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
	 char c[]=new char[n];
	 for(int i=0;i<n;i++)
	 c[i]=s.next().charAt(0);
	 Queue<Character>q=new LinkedList<>();
	 int a[]=new int[26];
	 for(int i=0;i<n;i++)
	 {if(a[(int)(c[i]-'a')]==0)
	 {q.add(c[i]);
	 a[(int)(c[i]-'a')]++;
	 System.out.print(q.peek()+" ");}
	 else
	 {q.remove(c[i]);
	 a[(int)(c[i]-'a')]++;
	  if(q.isEmpty())
	 System.out.print("-1 ");
	 else
	 System.out.print(q.peek()+" ");}}
	     System.out.println();
}}}