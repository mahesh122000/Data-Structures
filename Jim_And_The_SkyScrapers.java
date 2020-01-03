import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    Stack<long []>st=new Stack<>();
    long count=0;
    for(int i=0;i<n;i++)
    {long k=s.nextLong();
    if(st.isEmpty()||k<st.peek()[0])
    st.push(new long[]{k,1});
    else if(k==st.peek()[0])
    {st.peek()[1]++;}
    else
    {while(!st.isEmpty() && k>st.peek()[0])
    {count=count+st.peek()[1]*(st.peek()[1]-1);
        st.pop();}
        if(st.isEmpty()||k<st.peek()[0])
        st.push(new long[]{k,1});
        else
        st.peek()[1]++;
    }}
    while(!st.isEmpty())
    {count+=st.peek()[1]*(st.peek()[1]-1);
    st.pop();}
    System.out.println(count);}}