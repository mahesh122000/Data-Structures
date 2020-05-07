import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
       {Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       while(t-->0)
       {int n=s.nextInt();
       long k=s.nextLong();
       long a[]=new long[n];
       for(int i=0;i<n;i++)
       a[i]=s.nextLong()%k;
       TreeSet<Long>ts=new TreeSet<>();
       long sum=0,max=0;
       for(int i=0;i<n;i++)
       {
           sum=(sum+a[i])%k;
           max=Math.max(max,sum);
           Long p=ts.higher(sum);
           if(p!=null)
           {max=Math.max(max,(sum-p+k)%k);}
           ts.add(sum);
       }
       System.out.println(max);
       }
       }
}