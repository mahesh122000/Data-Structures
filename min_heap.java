import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int q=s.nextInt();
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       while(q-->0)
       {int p=s.nextInt();
       if(p==1)
       pq.add(s.nextInt());
       else if(p==2)
       pq.remove(s.nextInt());
       else
       System.out.println(pq.peek());}}
}
