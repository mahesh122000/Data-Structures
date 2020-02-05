import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
       for(int i=0;i<n;i++)
       {ArrayList<Integer>al=new ArrayList<>();
       al.add(i);
       hm.put(i,al);}
       for(int i=0;i<k;i++)
       {int p=s.nextInt();
       int q=s.nextInt();
       ArrayList<Integer>al1=hm.get(p);
       ArrayList<Integer>al2=hm.get(q);
       if(al1!=al2)
       {
           al1.addAll(al2);
           al2.forEach(j -> hm.put(j,al1));
       }}
       int l=hm.size();
       int a[]=new int[l];
       int j=0;
       for(ArrayList<Integer> al:hm.values())
       {a[j]=al.size();al.removeIf(i -> true);
       j++;}
      long sum=a[0];long ans=0;
      for(int i=1;i<l;i++)
      {
      ans+=sum*a[i];
      sum+=a[i];}
      System.out.println(ans);
       } 
    } 