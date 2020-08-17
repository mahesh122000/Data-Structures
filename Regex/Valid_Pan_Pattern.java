import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            String c=s.next();
            if(Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]$",c))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}