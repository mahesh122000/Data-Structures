import java.io.*;
import java.util.*;

public class Solution {
    static class Node
    {
        int y;
        int cost;
        Node(int y,int cost)
        {
            this.y=y;
            this.cost=cost;
        }
    }
    static boolean dp[][];
    static void find(int i,int cost)
    {
        dp[i][cost]=true;
        for(Node n:al.get(i))
        {
            if(!dp[n.y][n.cost|cost])
            find(n.y,n.cost|cost);
        }
    }
    static ArrayList<ArrayList<Node>>al;
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        al=new ArrayList<>();
        dp=new boolean[1001][1024];
        for(int i=0;i<=n;i++)
        al.add(new ArrayList<>());
        for(int i=0;i<m;i++)
        {
            int p=s.nextInt();
            int q=s.nextInt();
            int c=s.nextInt();
            al.get(p).add(new Node(q,c));
            al.get(q).add(new Node(p,c));
        }
        int p=s.nextInt();
        int q=s.nextInt();
        int b[]=new int[n];
        find(p,0);
        boolean flag=false;
        for(int i=0;i<1024;i++)
        {
            if(dp[q][i]==true)
            {System.out.println(i);
            flag=true;
            break;}
        }
        if(flag==false)
        System.out.println(-1);
    }
}


