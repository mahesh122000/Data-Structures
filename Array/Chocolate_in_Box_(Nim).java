import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            long a[]=new long[n];
            long val=0;
            for(int i=0;i<n;i++)
            {a[i]=s.nextInt();
            val^=a[i];}
            int ans=0;
            for(int i=0;i<n;i++)
            {
                if((val^a[i])<a[i])
                ans++;
            }
            System.out.println(ans);
    }
}