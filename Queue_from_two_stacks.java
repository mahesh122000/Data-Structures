
public class Solution {
    public static void check(Stack<Long>a,Stack<Long>b)
    {if(b.isEmpty())
    {while(!a.isEmpty())
    {b.add(a.peek());
    a.pop();}}}
    public static void main(String[] args) {
        Stack<Long>st1=new Stack<>();
        Stack<Long>st2=new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int c = s.nextInt();
            if (c == 1) { 
              st1.push(s.nextLong());
            } else if (c == 2) { 
              check(st1,st2);
              st2.pop();
            } else if (c == 3) {
                check(st1,st2);
              System.out.println(st2.peek());
            }    
        }
    }
}