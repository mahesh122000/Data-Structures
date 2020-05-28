import java.io.*;
import java.util.*;

public class Solution {

    static HashMap<Integer,Integer>hm;
    static HashMap<Integer,HashSet<Integer>>fre;
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        hm=new HashMap<>();
        fre=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int q=s.nextInt();
            int p=s.nextInt();
            if(q==1)
            {if(hm.containsKey(p))
            {fre.get(hm.get(p)).remove(p);
            int k=hm.get(p);
            k++;
            hm.put(p,k);
            if(fre.containsKey(k))
            fre.get(k).add(p);
            else
            {fre.put(k,new HashSet<>());
            fre.get(k).add(p);
            }}
            else
            {hm.put(p,1);
            if(fre.containsKey(1))
            fre.get(1).add(p);
            else
            {fre.put(1,new HashSet<>());
            fre.get(1).add(p);
            }}}
            else if(q==2)
            {if(hm.containsKey(p))
            {fre.get(hm.get(p)).remove(p);
            int k=hm.get(p);
            k--;
            if(k==0)
            {hm.remove(p);
            continue;}
            hm.put(p,k);
            if(fre.containsKey(k))
            fre.get(k).add(p);
            else
            {fre.put(k,new HashSet<>());
            fre.get(k).add(p);
            }}}
            else
            {if(fre.containsKey(p) &&fre.get(p).size()>=1)
            System.out.println("1");
            else
            System.out.println("0");
            }
        }
    }
}