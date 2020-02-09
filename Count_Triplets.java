import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long r=s.nextLong();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextLong();
        long count=0;
        if(r!=1)
        {HashMap<Long,Long>hm1=new HashMap<>();
        HashMap<Long,Long>hm2=new HashMap<>();
        for(int i=0;i<n;i++)
        {long k=a[i]/r;
        if(hm1.containsKey(k) && a[i]%r==0)
        {count+=hm1.get(k);}
        if(hm2.containsKey(k) && a[i]%r==0)
        {long p=hm2.get(k);
        hm1.put(a[i],hm1.getOrDefault(a[i],0L)+p);}
        hm2.put(a[i],hm2.getOrDefault(a[i],0L)+1);}}
        else
        {HashMap<Long,Long>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {if(hm.containsKey(a[i]))
        {long k=hm.get(a[i]);
        k++;
        hm.put(a[i],k);}
        else
        {long k=1;
        hm.put(a[i],k);}}
        for(Long k:hm.values())
        {long val=(k*(k-1)*(k-2))/6;
        if(val<=0)
        val=0;
        count=count+val;}
        }
        System.out.println(count);
    }}
