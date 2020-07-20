import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static boolean same(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            return false;
        }
        return true;
    }
    static void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==0)
            return ;
        int p=n-1;
        for(int i=n-2;i>=0;i--)
        {if(nums[i+1]>nums[i])
         {p=i;
         break;}
        }
        int in=-1,min=Integer.MAX_VALUE;
        for(int i=p+1;i<n;i++)
        {int t=nums[i]-nums[p];
        if(min>=t && t>0)
        {min=t;
        in=i;}}
        if(in!=-1)
        {
            int t=nums[in];
            nums[in]=nums[p];
            nums[p]=t;
            int a[]=new int[n-p-1];
            for(int i=p+1,j=0;i<n;i++,j++)
                a[j]=nums[i];
            Arrays.sort(a);
            for(int i=p+1,j=0;i<n;i++,j++)
                nums[i]=a[j];
        }
        else
            {}
    }  
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String c=s.next();
	         int n=c.length();
	         int k=n/2;
	         int a[]=new int[k];
	         int b[]=new int[k];
	         for(int i=0;i<k;i++)
	         {
	             a[i]=c.charAt(i)-'0';
	             b[i]=a[i];
	         }
	         nextPermutation(a);
	         if(same(a,b))
	         System.out.println("-1");
	         else
	         {
	             char d[]=c.toCharArray();
	             int l=0,r=n-1;
	             int i=0;
	             while(l<r)
	             {
	                 d[l++]=d[r--]=(char)(a[i++]+'0');
	             }
	         System.out.println(new String(d));
	         }
	     }
	 }
}
