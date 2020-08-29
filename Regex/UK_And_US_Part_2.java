import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        String str[]=new String[N];
        for(int i=0; i<N; i++)
        {
        str[i]=sc.nextLine();
        }
       
        int K=Integer.parseInt(sc.nextLine());
        for(int j=0; j<K; j++)
        {
            int count=0;
         String TestCase=sc.nextLine();
      String se=TestCase.replace("our","or");
         for(int i=0; i<N; i++)
        {
            
            Pattern p=Pattern.compile("\\b"+TestCase+"\\b"+"|"+"\\b"+se+"\\b");
            Matcher m=p.matcher(str[i]);
        while(m.find())
        {
            count++;
        }
   
        }
        System.out.println(count); 

        }
        
    
    }
}