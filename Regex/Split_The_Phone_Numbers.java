import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      s.nextLine();
      String regex = "([0-9]{1,3})[- ]([0-9]{1,3})[- ]([0-9]{4,10})";
      while(t-->0)
      {
          String c=s.nextLine();
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(c);
          String output="";
          while (matcher.find()){
                output +="CountryCode="+matcher.group(1)+",LocalAreaCode="+matcher.group(2)+",Number="+matcher.group(3)+"\n";
            }
            System.out.print(output);  
      }
    }
}
