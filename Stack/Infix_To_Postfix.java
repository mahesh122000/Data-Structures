import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    static int prec(char c)
    {
    switch(c){
      case '^':
        return 3;

      case '*':
      case '/':
          return 2;

    case '+':
    case '-':
          return 1;
        }
        return -1;

  }
  public static void main(String[] args)throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String s = br.readLine().trim();
      convert(s);
    }
  }

  


  static void convert(String s)
  {
    int n = s.length();

    String ans = "";
    Stack<Character> st = new Stack<Character>();

    for(int i = 0; i<n; i++)
    {
      char c = s.charAt(i);

      if(Character.isLetterOrDigit(c))
      {
        ans += c;
      }
      else if( c == '(' ){
        st.push(c);
      }
      else if(c == ')')
      {
        while( !st.isEmpty() && st.peek() != '(')
        {
            ans += st.pop();
        }
        if(!st.isEmpty())
          st.pop();
      }
      else 
      {
        while(!st.isEmpty() && prec(c) <= prec(st.peek())) 
        {
          ans += st.pop();
          }
        st.push(c);
        }
      }
    while(!st.isEmpty())
    {
      ans += st.pop();
    }
    System.out.println(ans);
  }
}