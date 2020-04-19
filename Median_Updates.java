import java.io.*;
import java.util.*;

public class Solution {
    static ArrayList<Long>al;
    static void insert(long a)
    {if(al.size()==0)
    {al.add(a);
    return;}
    int k=Collections.binarySearch(al,a);
    if(k<0)
    al.add(-k-1,a);
    else
    al.add(k,a);
    }
    static void median()
    {
        int n=al.size();
        long val=0;
        long v=0;
        if(n%2==1)
        {val=al.get(n/2);
        System.out.print(val);
        return;}
        else
        {val=al.get(n/2)+al.get(n/2-1);
        v=val/2;
        long k=v*2;
        String ans=String.valueOf(v);
        ans+=".5";
        if(val<0 && v>=0)
        ans="-"+ans;
        if(k==val)
        System.out.print(v);
        else
        System.out.print(ans);
        }
    }

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       HashMap<Long,Integer>hm=new HashMap<>();
       al=new ArrayList<>();
       int n=s.nextInt();
       for(int i=0;i<n;i++)
       {char c=s.next().charAt(0);
       long a=s.nextLong();
       if(c=='r')
       {if(al.size()==0||!hm.containsKey(a))
       System.out.print("Wrong!");
       else
       {al.remove(a);
       int k=hm.get(a);
       k--;
       if(k==0)
       hm.remove(a);
       else
       hm.put(a,k);
       if(al.size()==0)
       System.out.print("Wrong!");
       else
       median();}}
       else 
       {if(hm.containsKey(a))
       {int k=hm.get(a);
       k++;
       hm.put(a,k);
       }
       else
       {hm.put(a,1);}
       insert(a);median();}
       System.out.println();}
    }
}
