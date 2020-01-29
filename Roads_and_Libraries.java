import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int m=s.nextInt();
        int cl=s.nextInt();
        int cr=s.nextInt();
        HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
        for(int i=1;i<=n;i++)
        {ArrayList<Integer>al=new ArrayList<>();
        al.add(i);
        hm.put(i,al);
        }
        for(int j=0;j<m;j++)
        {int p=s.nextInt();
        int q=s.nextInt();
        ArrayList<Integer>al1=hm.get(p);
        ArrayList<Integer>al2=hm.get(q);
        if(al1!=al2)
        {al1.addAll(al2);
        al2.forEach(i -> hm.put(i,al1));}
        }
        if(cl<cr)
        System.out.println((long)cl*n);
        else
        {
            long ans=0;
            for(ArrayList<Integer>al:hm.values())
            {int si=al.size();
            if(si>0)
            {ans=ans+cl;
            ans+=(si-1)*cr;
            al.removeIf(i -> true);}}
        System.out.println(ans);
        }}}}   