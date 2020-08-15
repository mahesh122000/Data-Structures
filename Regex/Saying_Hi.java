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
           if(Pattern.matches("^[hH][Ii]\\s[^Dd].*",c))
           System.out.println(c);
       }
    }
}
