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
	 {String a=s.next();
	 int n=a.length();
	 HashSet<Character>hs=new HashSet<>();
	 for(int i=0;i<n;i++)
	 hs.add(a.charAt(i));
	 int l=hs.size();
	 int aa[]=new int[128];
	 for(char c:hs)
	 aa[(int)c]++;
	 int left=0,count=0,min=n;
	 for(int right=0;right<n;right++)
	 {if(--aa[(int)a.charAt(right)]>=0)
	 count++;
	 while(count==l)
	 {min=Math.min(min,right-left+1);
	 if(++aa[(int)a.charAt(left)]>0)
	 count--;
	 left++;}}
	 System.out.println(min);}}}