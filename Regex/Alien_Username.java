import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String c=s.next();
            if(Pattern.matches("^[_.][0-9]+[a-zA-Z]*[_]?$",c))
            System.out.println("VALID");
            else
            System.out.println("INVALID");
        }
    }
}
