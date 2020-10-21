import java.io.*;
import java.util.*;

public class Solution {
    static int find(int node, int[] parent) {
        while(parent[node]>0)
            node=parent[node];
        return node;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] parent=new int[n+1];
        Arrays.fill(parent, -1);
        for(int i=1; i<n; i++) {
            int u=in.nextInt();
            int v=in.nextInt();
            String c=in.next();
            if(c.charAt(0)=='b') {
                u=find(u, parent);
                v=find(v, parent);
                if(u!=v) {
                    if(parent[u]>parent[v]) {
                        parent[v]+=parent[u];
                        parent[u]=v;
                    }
                    else{
                        parent[u]+=parent[v];
                        parent[v]=u;
                    }
                }
            }
        }

        long result=n;
        result=result*(n-1)/2;
        result=result*(n-2)/3;
        for(int i=1; i<=n; i++) {
            if(parent[i]<0) {
                long number=-parent[i];
                if(number>2)
                    result-=number*(number-1)/2*(number-2)/3;
                if(number>1)
                    result-=number*(number-1)/2*(n-number);
            }
        }

        System.out.println((int)(result%1000000007));
    }
}