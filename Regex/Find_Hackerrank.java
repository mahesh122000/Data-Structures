import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       s.nextLine();
       while(n-->0)
       {
           String c=s.nextLine();
           if(Pattern.matches("^(hackerrank).*\\1$|^(hackerrank)$",c))
           System.out.println("0");
           else if(Pattern.matches("^(hackerrank).*",c))
           System.out.println("1");
           else if(Pattern.matches(".*hackerrank$",c))
           System.out.println("2");
           else
           System.out.println("-1");
       }
    }
}
