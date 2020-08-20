import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        while(t-->0)
        {
            String c=s.nextLine();
            if(Pattern.matches("\\([+-]?(90(\\.0+)?|([1-8][0-9]|[1-9])(\\.\\d+)?), [+-]?(180(\\.0+)?|(1[0-7][0-9]|[1-9][0-9]|[1-9])(\\.\\d+)?)\\)",c))
            System.out.println("Valid");
            else
            System.out.println("Invalid");
        }
    }
}