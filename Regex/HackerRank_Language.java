import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String str="(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)";
        s.nextLine();
        while(t-->0)
        {
            String c[]=s.nextLine().split("\\s+");
            String d=c[1];
            if(Pattern.matches("^"+str+"$",d))
            System.out.println("VALID");
            else
            System.out.println("INVALID");
        }
    }
}
