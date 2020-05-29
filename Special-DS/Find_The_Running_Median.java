import java.io.*;
import java.util.*;

public class Solution {

    static ArrayList<Double>al;
    static void add(double i)
    {
        if(al.size()==0)
        al.add(i);
        else
        {
            int k=Collections.binarySearch(al,i);
            if(k<0)
            k=-k-1;
            al.add(k,i);
        }
    }
    static double median()
    {
        double ans=0.0;
        if(al.size()%2==1)
        return al.get(al.size()/2);
        ans+=al.get(al.size()/2)+al.get(al.size()/2-1);
        return ans/2;
    }
    public static void main(String[] args) 
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     al=new ArrayList<>();
     for(int i=0;i<n;i++)
     {add(s.nextDouble());
     System.out.println(median());
     }
    }
}