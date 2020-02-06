import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
        for(int i=1;i<=2*n;i++)
        {ArrayList<Integer>al=new ArrayList<>();
        al.add(i);
        hm.put(i,al);}
        for(int i=0;i<n;i++)
        {int p=s.nextInt();
        int q=s.nextInt();
        ArrayList<Integer>al1=hm.get(p);
        ArrayList<Integer>al2=hm.get(q);
        if(al1!=al2)
        {al1.addAll(al2);
        al2.forEach(j -> hm.put(j,al1));}}
        int max=0;
        int min=99999;
        for(ArrayList<Integer>al:hm.values())
        {int ss=al.size();
        if(ss>1)
        {min=Math.min(min,ss);
        max=Math.max(max,ss);}
        al.removeIf( i -> true);
        }
        System.out.println(min+" "+max);
        }
    }