import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        Pattern p = Pattern.compile("hackerrank",Pattern.CASE_INSENSITIVE);
        Matcher m;
        while(s.hasNext()){
            m = p.matcher(s.next());
            if(m.find() == true)
                count++;
        }
         System.out.println(count);
    }
}