import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        String c[]=new String[n];
        for(int i=0;i<n;i++)
        {String inp = br.readLine();
        String arr[] = inp.split(" ");
            a[i]=Integer.parseInt(arr[0]);
        if(a[i]==1)
        c[i]=arr[1];
        else if(a[i]==2 || a[i]==3)
        b[i]=Integer.parseInt(arr[1]);}
        Stack<String>st=new Stack<String>();
        String ans="";
        st.add(ans);
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {ans+=c[i];st.add(ans);}
            else if(a[i]==3)
            System.out.println(ans.charAt(b[i]-1));
            else if(a[i]==2)
            {int l=ans.length();
            ans=ans.substring(0,l-b[i]);st.add(ans);}
            else
            {st.pop();
                ans=st.peek(); 
        }}}}