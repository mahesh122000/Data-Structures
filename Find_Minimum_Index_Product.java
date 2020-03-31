import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextLong();
        long ans=0;
        for(int i=0;i<n;i++)
        {long l=-1,r=-1;
        for(int j=i-1;j>=0;j--)
        {if(a[j]>a[i])
        {l=j;
        break;}}
        if(l==-1)
        continue;
        for(int j=i+1;j<n;j++)
        {if(a[j]>a[i])
        {r=j;
        break;}}
        if(r==-1)
        continue;
        ans=Math.max(ans,(l+1)*(r+1));}
        System.out.println(ans);
    }
    }