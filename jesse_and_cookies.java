import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
    for(int i=0;i<n;i++)
    {int k=s.nextInt();
    pq.add(k);}
    int count=0;
    while(pq.size()>1 && pq.peek()<m)
    {int a=pq.poll();
    int b=pq.poll();
    count++;
    pq.add(a+2*b);}
    if(pq.size()==1 && pq.peek()<m)
    {System.out.println("-1");}
    else
    System.out.println(count);}
    }
