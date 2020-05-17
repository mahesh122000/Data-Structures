import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int m=s.nextInt();
    int x=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[m];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    for(int j=0;j<m;j++)
    b[j]=s.nextInt();
    int sum=0;
    int count=0;
    int i=0,j=0;
    while(i<n && sum+a[i]<=x)
    {sum+=a[i];
    i++;
    count++;}
    while(j<m && i>=0)
    {sum+=b[j];
    j++;
    while(sum>x && i>0)
    {i--;
    sum-=a[i];
    }
    if(sum<=x && i+j>count)
    count=i+j;
    }
    System.out.println(count);
    }
    }
}