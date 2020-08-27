import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< t; i++){
            sb.append(sc.nextLine());
        }
        int n = sc.nextInt(); 
        for(int i = 0; i< n; i++){
            int count = 0;
            String s = sc.next();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(sb.toString());
            while(m.find()){
            count += 1;
           }
            s = s.replace(s.charAt(s.length()-2),'s');
            p = Pattern.compile(s);
            Matcher m1 = p.matcher(sb.toString());
            while(m1.find()){
            count += 1;
           }
            System.out.println(count);
        } 
    }
}
