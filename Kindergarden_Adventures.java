import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {if(a[i]>0 && a[i]<n)
        {b[(i+1)%n]++;
        b[(i+1-a[i]+n)%n]--;}}
        int max=-1,sum=0,j=0;
        for(int i=0;i<n;i++)
        {sum+=b[i];
        if(sum>max)
        {max=sum;
        j=i;}}
        System.out.println(j+1);
    }
}
