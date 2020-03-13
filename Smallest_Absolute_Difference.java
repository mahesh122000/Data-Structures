import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int find(int a[],int k)
    {int n=a.length;
    int l=0;
    int h=a[n-1]-a[0];
    while(l<h)
    {int m=(l+h)/2;
    int left=0,count=0;
    for(int right=0;right<n;right++)
    {while(a[right]-a[left]>m)left++;
    count+=right-left;}
    if(count>=k)
    h=m;
    else
    l=m+1;
    }
    return l;
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 Arrays.sort(a);
	 int k=s.nextInt();
	 System.out.println(find(a,k));
	 }
	 }
}