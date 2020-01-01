import java.io.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long g[]=new long[n];
    long d[]=new long[n];
    for(int i=0;i<n;i++)
    {g[i]=s.nextLong();
    d[i]=s.nextLong();}
    int start=0,i=0,passed=0;
    long gas=0;
    while(passed<n)
    {
        gas=gas+g[i];
        if(gas>=d[i])
        {passed++;
        gas-=d[i];}
        else
        {start=i+1;
        gas=0;passed=0;}
        i++;
        i=i%n;
    }
    System.out.println(start);}}