import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);;
    int n=s.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    {a[i]=s.nextLong();}
    Stack<int[]>st=new Stack<>();
    a=Arrays.copyOf(a,n+1);
    int j=0;
    long max=0;
    for(int i=0;i<=n;i++)
    {for(j=i;!st.isEmpty() && a[st.peek()[0]]>=a[i];)
    {
        int[] x=st.pop();
        j=x[1];
        max=Math.max(max,a[x[0]]*(i-j));
       // System.out.println(x[0]+" "+x[1]+" "+max);
    }
    st.push(new int[]{i,j});}
    System.out.println(max);}}
