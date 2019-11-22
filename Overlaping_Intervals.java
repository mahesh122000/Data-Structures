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
	 int a[][]=new int[n][3];
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<2;j++)
	 a[i][j]=s.nextInt();}
	 for(int i=0;i<n-1;i++)
	 {for(int j=0;j<n-i-1;j++)
	 {if(a[j+1][0]<a[j][0])
	 {int temp=a[j][0];
	 a[j][0]=a[j+1][0];
	 a[j+1][0]=temp;
	 temp=a[j][1];
	 a[j][1]=a[j+1][1];
	 a[j+1][1]=temp;}}}
	 for(int i=0;i<n;i++)
	 {if(a[i][2]!=1)
	 for(int j=i+1;j<n;j++)
	 {if(a[i][1]>=a[j][0] && a[j][2]!=1)
	 {if(a[i][1]<a[j][1])
	 {a[i][1]=a[j][1];}
	 a[j][2]=1;
	 }}}
	 for(int i=0;i<n;i++)
	 {if(a[i][2]!=1)
	 System.out.print(a[i][0]+" "+a[i][1]+" ");}System.out.println();}
}}